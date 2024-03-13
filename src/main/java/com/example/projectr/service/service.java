package com.example.projectr.service;

import com.example.projectr.grades.grades;
import com.example.projectr.users.user;

import java.util.List;

public interface service {

    grades getgrades(int uid);

    List<grades> getgradebyusernameandpass(String uname, String pass);

    void savegrades(grades grades);
    void saveuser(user myuser);

    List<user> finall();

}
