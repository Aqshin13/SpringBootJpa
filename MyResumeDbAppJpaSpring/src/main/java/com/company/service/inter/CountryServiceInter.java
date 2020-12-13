package com.company.service.inter;

import com.company.entity.Country;

import java.util.List;

public interface CountryServiceInter {

    List<Country> getAllCountry();

    Country getCountryById(int id);

    boolean removeCountry(int id);

    boolean addCountry(Country country);

    boolean updateCountry(Country country);

}
