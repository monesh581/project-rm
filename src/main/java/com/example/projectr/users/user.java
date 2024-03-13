package com.example.projectr.users;

import com.example.projectr.grades.grades;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "users")
public class user {


    @Id
    @Column(name = "userid")
    private int id;


    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;


    @Column(name = "email")
    private String email;

    @Column(name = "doj")
    private Date doj;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "department")
    private String department;


    @OneToOne
    @JoinColumn(name = "userid")
    private grades grades;


    public user(grades grades) {
        this.grades = grades;
    }

    public user(int id, String firstname, String lastname, String email, Date doj, String username, String password, String department) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

        this.email = email;
        this.doj = doj;
        this.username = username;
        this.password = password;
        this.department = department;
    }
    public user(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", doj=" + doj +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
