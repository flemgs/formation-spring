package fr.orsys.rest.test;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class SpringRestTestClient {
	public static final String REST_SERVICE_URI = "http://localhost:8080/TP-Spring-Rest";
	
	public static void main(String[] args) {
		System.out.println("Testing listAllUsers API------");
		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI + "/user/", List.class);
		
		if(usersMap != null) {
			for(LinkedHashMap<String, Object> map : usersMap) {
				System.out.println("User : id=" + map.get("id") + ", name=" + map.get("name") + ", age=" + map.get("age"));
			} 
		} else {
			System.out.println("No users");
		}
	}
}
