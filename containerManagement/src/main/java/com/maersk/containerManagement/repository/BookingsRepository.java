package com.maersk.containerManagement.repository;

import com.maersk.containerManagement.common.customerRequest.api.Bookings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingsRepository extends MongoRepository<Bookings,String> {
    Optional<Bookings> findById(String messageKey);
}
