package com.company.service.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;
import com.company.service.inter.EmploymentHistoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service("employmentService")
@Transactional
public class EmploymentHistoryServiceImpl extends AbstractDAO implements EmploymentHistoryServiceInter {

    @Autowired
    @Qualifier("employmentHistorydaoImpl")
    EmploymentHistoryDaoInter employmentHistoryDaoInter;

    @Override
    public List<EmploymentHistory> getAllEmploymentHistory() {
        return employmentHistoryDaoInter.getAllEmploymentHistory();
    }

    @Override
    public EmploymentHistory getAllEmploymentHistoryById(int id) {
        return employmentHistoryDaoInter.getAllEmploymentHistoryById(id);
    }

    @Override
    public boolean removeEmploymentHistory(int id) {
        return employmentHistoryDaoInter.removeEmploymentHistory(id);
    }

    @Override
    public boolean addEmploymentHistory(EmploymentHistory employmentHistory) {
        return employmentHistoryDaoInter.addEmploymentHistory(employmentHistory);
    }

    @Override
    public boolean updateEmploymentHistory(EmploymentHistory employmentHistory) {
        return employmentHistoryDaoInter.updateEmploymentHistory(employmentHistory);
    }

}
