package com.weather.entity;




import org.springframework.data.neo4j.core.schema.Node;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
@Node
public class Coord {
	 Long id;
	    @JsonProperty("lon")
	    private float lon;
	    @JsonProperty("lat")
	    private float lat;

}
