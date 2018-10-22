package com.margadarshak.travelmantra.margadarshak;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, Integer> {
    User findByName(String name);
}