package com.company.dao.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository(value = "employmentHistorydaoImpl")
@Transactional
public class EmploymentHistoryDaoImpl extends AbstractDAO implements EmploymentHistoryDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<EmploymentHistory> getAllEmploymentHistory() {
        return em.createQuery("select e employment_history e ").getResultList();
    }

    @Override
    public EmploymentHistory getAllEmploymentHistoryById(int id) {
        EmploymentHistory u = em.find(EmploymentHistory.class, id);
        return u;
    }

    @Override
    public boolean removeEmploymentHistory(int id) {
        EmploymentHistory employmentHistory = em.find(EmploymentHistory.class, id);
        em.remove(employmentHistory);
        return false;
    }

    @Override
    public boolean addEmploymentHistory(EmploymentHistory employmentHistory) {
        em.persist(employmentHistory);
        return true;
    }

    @Override
    public boolean updateEmploymentHistory(EmploymentHistory employmentHistory) {
        em.merge(employmentHistory);
        return true;
    }

}
