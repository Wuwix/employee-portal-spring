package com.wuwix.employeeportal.dao;

import com.wuwix.employeeportal.domain.AddressRelation;
import com.wuwix.employeeportal.domain.EmployeeRelation;
import com.wuwix.employeeportal.domain.EmployeeSalaryAvg;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeRelationService {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveEmployee(EmployeeRelation employee, AddressRelation address ) {
        entityManager.persist(employee);
        entityManager.persist(address);
        return;
    }

    public List<EmployeeRelation> getAll() {
        return entityManager.createQuery("from EmployeeRelation").getResultList();
    }

    public EmployeeRelation findById(long id) {
        return entityManager.find(EmployeeRelation.class, id);
    }

    public List<EmployeeRelation> findEmployeesByFirstName(String firstName) {
        Query query = entityManager.createQuery("from EmployeeRelation e where e.firstName = :firstName");
        query.setParameter("firstName", firstName);
        return query.getResultList();
    }

    public EmployeeSalaryAvg getAvgSalary() {
        Query query = entityManager.createQuery("select avg(e.salary), max(e.salary), min(e.salary) " +
                "from EmployeeRelation e");
        Object[] singleResult = (Object[]) query.getSingleResult();
        return new EmployeeSalaryAvg(
                (Double) singleResult[0],
                (Double) singleResult[1],
                (Double) singleResult[2]);
    }
}
