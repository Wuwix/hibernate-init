package com.wuwix.dao;

import com.wuwix.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(User user) {
        entityManager.persist(user);
        return;
    }

    public void merge(User user) {
        entityManager.merge(user);
        return;
    }

    public void drop() {
        entityManager.clear();
        return;
    }
}
