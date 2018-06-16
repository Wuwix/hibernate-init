package com.wuwix.dao;

import com.wuwix.domain.DataTime;
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
