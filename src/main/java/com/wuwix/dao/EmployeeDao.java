package com.wuwix.dao;

import com.wuwix.domain.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Employee employee) {
        entityManager.persist(employee);
        return;
    }

    public List<Employee> getAll() {
        return entityManager.createQuery("from Employee").getResultList();
    }
}
