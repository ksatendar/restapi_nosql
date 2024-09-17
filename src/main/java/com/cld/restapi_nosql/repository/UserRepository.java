package com.cld.restapi_nosql.repository;

import com.cld.restapi_nosql.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
