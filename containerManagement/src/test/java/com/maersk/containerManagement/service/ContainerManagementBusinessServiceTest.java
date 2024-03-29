package com.maersk.containerManagement.service;

import com.maersk.containerManagement.client.RestClient;
import com.maersk.containerManagement.common.customerRequest.api.AvailableSpace;
import com.maersk.containerManagement.common.customerRequest.api.Bookings;
import com.maersk.containerManagement.common.customerRequest.api.CustomerRequestData;
import com.maersk.containerManagement.repository.BookingsRepository;
import com.maersk.containerManagement.service.impl.ContainerManagementBusinessServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.internal.stubbing.answers.DoesNothing;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ContainerManagementBusinessServiceTest {
    @InjectMocks
    private ContainerManagementBusinessServiceImpl containerManagementBusinessService = new ContainerManagementBusinessServiceImpl();

    @Mock
    private BookingsRepository bookingsRepository;

    @Mock
    private RestTemplate restTemplate;

    @Mock
    private RestClient restClient = new RestClient();


    @Test
    public void testCheckAvailability(){
        CustomerRequestData customerRequestData = new CustomerRequestData();
        customerRequestData.setContainerSize(BigInteger.TEN);
        HttpEntity<CustomerRequestData> httpEntity = new HttpEntity<>(customerRequestData);
        ResponseEntity<AvailableSpace> responseEntity = new ResponseEntity<>(HttpStatus.CREATED);
       boolean response = containerManagementBusinessService.checkAvailability(customerRequestData);
        Assert.isTrue(response);
    }

    @Test
    public void testNotAvailability(){
        CustomerRequestData customerRequestData = new CustomerRequestData();
        customerRequestData.setContainerSize(BigInteger.ZERO);
        HttpEntity<CustomerRequestData> httpEntity = new HttpEntity<>(customerRequestData);
        ResponseEntity<AvailableSpace> responseEntity = new ResponseEntity<>(HttpStatus.CREATED);
        boolean response = containerManagementBusinessService.checkAvailability(customerRequestData);
        Assert.isTrue(!response);
    }

    @Test
    public void testSaveBookings(){
        Bookings bookings = new Bookings();
        bookings.setId("1234");
        Mockito.verify(bookingsRepository,Mockito.times(0)).save(bookings);
        ResponseEntity<String> response = containerManagementBusinessService.saveBookingData(bookings);
    }
}
