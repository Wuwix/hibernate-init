package com.wuwix.dao;

import com.wuwix.domain.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeRelationManyService {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveEmployee(EmployeeRelationMany employee, List<Phone> phones ) {
        entityManager.persist(employee);
        for (Phone phone : phones) {
            entityManager.persist(phone);
        }
        return;
    }

    public List<EmployeeRelation> getAll() {
        return entityManager.createQuery("from EmployeeRelationMany").getResultList();
    }
}
