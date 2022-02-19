package com.lucid.techrd.domain;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucid.techrd.model.Manifest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Probe {

	private static final String BIGID_ATLAS_INTEGRATION = "https://192.168.169.81:8085";
	
	
	public String urlProbe() {
		RestAssured.useRelaxedHTTPSValidation();
		try {
			Response getRespone = given().log().all()
			.when().get(BIGID_ATLAS_INTEGRATION).andReturn();
			
			System.out.println("Response Status   : " + getRespone.getStatusCode());
			System.out.println("Response : " + getRespone.getBody().asString());
			return getRespone.getBody().asString();
			
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}
