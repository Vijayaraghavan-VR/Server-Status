package com.lucid.techrd.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucid.techrd.model.Manifest;

import io.restassured.RestAssured;

public class ServerStatus {
	
	private String applicationName;
	private String version;
	private String status;
	
	private static final String BIGID_ATLAS_INTEGRATION = "https://192.168.169.81:8085";

	
	public ServerStatus(Manifest manifest) {
		applicationName = manifest.appName;
		version = manifest.version;
		status = "Online";
	}


	public static void main(String[] args) {
		RestAssured.useRelaxedHTTPSValidation();
		System.out.println("Hello");
		String json = new Probe().urlProbe();
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			Manifest manifest = mapper.readValue(json, Manifest.class);
//			System.out.println(manifest.appName);
//			System.out.println(manifest.version);
			
			System.out.println(new ServerStatus(manifest));
			
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}


	@Override
	public String toString() {
		return "ServerStatus [applicationName=" + applicationName + ", version=" + version + ", status=" + status + "]";
	}
}