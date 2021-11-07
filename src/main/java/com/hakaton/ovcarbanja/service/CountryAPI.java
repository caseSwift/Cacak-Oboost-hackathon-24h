package com.hakaton.ovcarbanja.service;

import com.hakaton.ovcarbanja.api.country.Country;

import java.util.List;

public interface CountryAPI {

    List<Country> getAllCountries();
    Country getCountryByName(String name);
}
