package com.maersk.containerManagement.controller;

import com.maersk.containerManagement.common.customerRequest.api.Bookings;
import com.maersk.containerManagement.common.customerRequest.api.CustomerRequestData;
import com.maersk.containerManagement.service.ContainerManagementBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class ContainerManagementController
{
    //private static final logger LOGGER = LoggerFactory.getLogger(ContainerManagementController.class);

    @Autowired
    private ContainerManagementBusinessService containerManagementBusinessService;

   @PostMapping("/checkAvailability")
    public boolean checkContainerSpace(@RequestBody CustomerRequestData customerRequestData){
    return containerManagementBusinessService.checkAvailability(customerRequestData);
    }

    @PostMapping("/saveBooking")
    public ResponseEntity<String> saveBookingDetails(@RequestBody Bookings bookingRequest){
       return containerManagementBusinessService.saveBookingData(bookingRequest);
    }
}
