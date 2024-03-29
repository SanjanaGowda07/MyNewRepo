package com.maersk.containerManagement;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
@Configuration
@EnableMongoRepositories("com.maersk.containerManagement.repository")
public class MongoConfiguration {

}
