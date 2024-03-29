package com.maersk.containerManagement.service.impl;

import com.maersk.containerManagement.client.RestClient;
import com.maersk.containerManagement.common.customerRequest.api.AvailableSpace;
import com.maersk.containerManagement.common.customerRequest.api.Bookings;
import com.maersk.containerManagement.common.customerRequest.api.CustomerRequestData;
import com.maersk.containerManagement.service.ContainerManagementBusinessService;
import com.maersk.containerManagement.repository.BookingsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ContainerManagementBusinessServiceImpl implements ContainerManagementBusinessService {

    @Autowired
    private BookingsRepository bookingsRepository;

    @Autowired
    private RestClient restClient;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    private static Logger logger = LoggerFactory.getLogger(ContainerManagementBusinessServiceImpl.class);
    public boolean checkAvailability(CustomerRequestData customerData){
        boolean available = false;
        if(customerData != null){
            //verify from external service
            HttpEntity<CustomerRequestData> httpEntity = new HttpEntity<>(customerData);
            restClient.invokeAvailableSpaceCheck(httpEntity);
            AvailableSpace availableSpace = new AvailableSpace();
            availableSpace.setAvailableSpace(customerData.getContainerSize().toString());
            if(!availableSpace.getAvailableSpace().equals("0"))
                available = true;
        }
        return available;
    }

    public ResponseEntity<String> saveBookingData(Bookings bookings) {
        ResponseEntity<String> response = new ResponseEntity<>(HttpStatus.ACCEPTED);
        String responseMsg = "";
        if(bookings != null){
           try {
               long id = sequenceGeneratorService.generateSequence("refValue");
               String bookingRef = id+"";
               bookings.setId(bookingRef);
               logger.info("Booking Ref id : "+bookingRef);
               bookingsRepository.save(bookings);
               responseMsg = bookingRef;
               response = new ResponseEntity<>(responseMsg,HttpStatus.CREATED);
           }catch(Throwable throwable){
               responseMsg = "Sorry there was a problem processing your request";

               response = new ResponseEntity<>(responseMsg,HttpStatus.INTERNAL_SERVER_ERROR);
               logger.error("Exception occurred during save : "+throwable.toString());
           }
        }

        return response;
    }
}
