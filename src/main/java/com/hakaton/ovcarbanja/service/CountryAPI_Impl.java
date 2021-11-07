package com.hakaton.ovcarbanja.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hakaton.ovcarbanja.api.country.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryAPI_Impl implements CountryAPI {

    @Value("http://api.countrylayer.com/v2/all")
    private String urlAll;
    @Value("access_key=69d7be8e41207b92e719ef43ff607f3f")
    private String key;
    @Value("http://api.countrylayer.com/v2/name/")
    private String byNameUrl;


    @Override
    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList<>();
        String response = "";

        try{
            RestTemplate restTemplate = new RestTemplate();
            response = restTemplate.getForObject(urlAll + "?" + key, String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            countries = objectMapper.readValue(response, new TypeReference<List<Country>>() {
            });
            return countries;
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }return null;
    }

    @Override
    public Country getCountryByName(String name) {
        try{
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(byNameUrl + name + "?" + key, String.class);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response, Country.class);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }
}
