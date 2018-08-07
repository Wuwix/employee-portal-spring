package com.wuwix.employeeportal.repositorySpring;

import com.wuwix.employeeportal.domain.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository()
public class EmployeeRepositorySpringImpl implements EmployeeRepositorySpringCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Employee> getFirstNameLike(String firstName) {
        Query query = entityManager.createNativeQuery("SELECT" +
                "    em.*," +
                "    a.*," +
                "    z.*" +
                " FROM mojabaza.pracownicy as em" +
                " left join adresy a on em.id = a.employee_id" +
                " left join zdjecia z on z.employee_id = a.employee_id" +
                " WHERE em.firstname LIKE ?", Employee.class);
        query.setParameter(1, firstName + "%");
        return query.getResultList();
    }

//    public List<Employee> getFirstNameLike(String firstName) {
//        entityManager.
//    }
}
