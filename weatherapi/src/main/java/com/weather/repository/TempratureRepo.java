package com.weather.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempratureRepo extends Neo4jRepository<com.weather.entity.Temprature,Long> {

}
