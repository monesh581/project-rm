package com.example.projectr.service;

import com.example.projectr.grades.grades;
import com.example.projectr.implement.gradeimpl;
import com.example.projectr.implement.userimpl;
import com.example.projectr.users.user;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class services implements service {


private final EntityManager entityManager;
private final userimpl userimpl;
private final gradeimpl gradeimpl;

    @Autowired
    public services(EntityManager entityManager, userimpl userimpl, gradeimpl gradeimpl) {
        this.entityManager = entityManager;

        this.userimpl = userimpl;
        this.gradeimpl = gradeimpl;
    }

    @Override
    public grades getgrades(int uid) {
        TypedQuery<grades> query=entityManager.createQuery("from grades where userid=:uid", grades.class);
        query.setParameter("uid", uid);
        grades grade=query.getSingleResult();
        return grade;
    }

    @Override
    public List<grades> getgradebyusernameandpass(String uname, String pass) {

        TypedQuery<grades> query1= entityManager.createQuery("from grades where user.username=:uname and user.password=:pass", grades.class
        );
        query1.setParameter("uname",uname);
        query1.setParameter("pass",pass);

        List<grades> grad=query1.getResultList();
        return grad;
    }

    @Override
    @Transactional
    public void savegrades(grades grades) {
        gradeimpl.save(grades);
    }


    @Override
    @Transactional
    public void saveuser(user myuser) {
       userimpl.save(myuser);
   }

    @Override
    public List<user> finall() {
        List<user> users=userimpl.findAll();
        return users;
    }



}
