package com.maersk.containerManagement.service;

import com.maersk.containerManagement.common.customerRequest.api.Bookings;
import com.maersk.containerManagement.common.customerRequest.api.CustomerRequestData;
import org.springframework.http.ResponseEntity;

public interface ContainerManagementBusinessService {
    public boolean checkAvailability(CustomerRequestData customerData);

    public ResponseEntity<String> saveBookingData(Bookings bookings);

}
