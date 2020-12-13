package com.company.service.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;
import com.company.service.inter.CountryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service("countryService")
@Transactional
public class CountryServiceImpl extends AbstractDAO implements CountryServiceInter {

    @Autowired
    @Qualifier("countryDaoImpl")
    CountryDaoInter countryDaoInter;

    @Override
    public List<Country> getAllCountry() {
        return countryDaoInter.getAllCountry();
    }

    @Override
    public Country getCountryById(int id) {
        return countryDaoInter.getCountryById(id);
    }

    @Override
    public boolean removeCountry(int id) {
        return countryDaoInter.removeCountry(id);
    }

    @Override
    public boolean addCountry(Country country) {
        return countryDaoInter.addCountry(country);

    }

    @Override
    public boolean updateCountry(Country country) {
        return countryDaoInter.updateCountry(country);
    }

}
