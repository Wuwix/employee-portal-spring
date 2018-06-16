package com.wuwix.employeeportal.dao;

import com.wuwix.employeeportal.domain.DataTime;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DataTimeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(DataTime objectWithTime) {
        entityManager.persist(objectWithTime);
        return;
    }
}
