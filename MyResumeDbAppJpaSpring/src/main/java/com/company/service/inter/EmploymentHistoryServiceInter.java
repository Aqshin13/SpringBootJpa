package com.company.service.inter;

import com.company.entity.EmploymentHistory;

import java.util.List;

public interface EmploymentHistoryServiceInter {

    List<EmploymentHistory> getAllEmploymentHistory();

    EmploymentHistory getAllEmploymentHistoryById(int id);

    boolean removeEmploymentHistory(int id);

    boolean addEmploymentHistory(EmploymentHistory employmentHistory);

    boolean updateEmploymentHistory(EmploymentHistory employmentHistory);

}
