package com.margadarshak.travelmantra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.margadarshak.travelmantra.domain.CityNode;

@Repository
public interface TravelMantraRepository extends MongoRepository<CityNode, Long> {

}
