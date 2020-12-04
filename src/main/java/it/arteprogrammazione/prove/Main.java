package it.arteprogrammazione.prove;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl
                = "https://app-restexample.herokuapp.com/rest/v1/customers/1";


        ResponseEntity<String> response
                = restTemplate.getForEntity(resourceUrl, String.class);

        CustomerDTO responseDTO
                = restTemplate.getForObject(resourceUrl, CustomerDTO.class);

        System.out.println("\nCOMPLETE RESPONSE: " + response);
        System.out.println("\nRESPONSE BODY: " + response.getBody());
        System.out.println("\nRESPONSE DTO: " +responseDTO);
    }

}
