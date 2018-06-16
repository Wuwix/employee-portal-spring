package com.wuwix.employeeportal.dao;

import com.wuwix.employeeportal.domain.Cat;
import com.wuwix.employeeportal.domain.Owner;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class OwnerCatService {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveOwner(Owner owner, Cat cat) {
        entityManager.persist(owner);
        entityManager.persist(cat);
        return;
    }

    public List<Owner> getAll() {
        return entityManager.createQuery("from Owner").getResultList();
    }

    public void refresh(Cat cat) {
        entityManager.refresh(cat);
    }
}
