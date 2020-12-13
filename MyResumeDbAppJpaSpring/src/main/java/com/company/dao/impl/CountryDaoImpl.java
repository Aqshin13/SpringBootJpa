package com.company.dao.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository(value = "countryDaoImpl")
@Transactional
public class CountryDaoImpl extends AbstractDAO implements CountryDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Country> getAllCountry() {
        Query query = em.createNamedQuery("Country.findAll", Country.class);
        List<Country> list = query.getResultList();
        return list;
    }

    @Override
    public Country getCountryById(int id) {
        String jpql = "select c Country c where c.id=:id";
        Query query = em.createQuery(jpql);
        Country country = (Country) query.getSingleResult();
        return country;
    }

    @Override
    public boolean removeCountry(int id) {
        Country country = em.find(Country.class, id);
        em.remove(country);
        return false;
    }

    @Override
    public boolean addCountry(Country country) {
        em.persist(country);
        return true;

    }

    @Override
    public boolean updateCountry(Country country) {
        em.merge(country);
        return true;
    }

}
