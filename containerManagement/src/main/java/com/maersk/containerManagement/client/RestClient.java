package com.maersk.containerManagement.client;

import com.maersk.containerManagement.common.customerRequest.api.AvailableSpace;
import com.maersk.containerManagement.common.customerRequest.api.CustomerRequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public ResponseEntity<AvailableSpace> invokeAvailableSpaceCheck(HttpEntity<CustomerRequestData> httpEntity){
        try{
            //restTemplate.postForEntity("http://localhost:8082/test",httpEntity,AvailableSpace.class
            ResponseEntity<AvailableSpace> responseEntity = new ResponseEntity<>(HttpStatus.CREATED);
            return responseEntity;
        }catch(Exception exception){
            throw exception;
        }
    }


}
