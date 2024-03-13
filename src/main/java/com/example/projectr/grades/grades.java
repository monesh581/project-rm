package com.example.projectr.grades;


import com.example.projectr.users.user;
import jakarta.persistence.*;

@Entity
@Table(name = "grades")
public class grades {

    @Id
    @Column(name = "gradeid")
    private int gradeid;


    @Column(name = "userid")
    private int userid;

    @Column(name = "IA1")
    private int IA1;

    @Column(name = "IA2")
    private int IA2;

    @Column(name = "grade")
    private int grade;


    @Column(name = "examtype")
    private String examtype;

    @Column(name = "currsem")
    private int currentsem;


    @OneToOne(mappedBy = "grades", cascade = CascadeType.ALL)
    private user user;

    public grades(int gradeid, int userid, int IA1, int IA2, int grade, String examtype, int currentsem) {

        this.gradeid = gradeid;
        this.userid = userid;
        this.IA1 = IA1;
        this.IA2 = IA2;
        this.grade = grade;
        this.examtype = examtype;
        this.currentsem = currentsem;
    }

    public grades(){

    }

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getIA1() {
        return IA1;
    }

    public void setIA1(int IA1) {
        this.IA1 = IA1;
    }

    public int getIA2() {
        return IA2;
    }

    public void setIA2(int IA2) {
        this.IA2 = IA2;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype;
    }

    public int getCurrentsem() {
        return currentsem;
    }

    public void setCurrentsem(int currentsem) {
        this.currentsem = currentsem;
    }

    @Override
    public String toString() {
        return "grades{" +
                "gradeid=" + gradeid +
                ", userid=" + userid +
                ", IA1=" + IA1 +
                ", IA2=" + IA2 +
                ", grade=" + grade +
                ", examtype='" + examtype + '\'' +
                ", currentsem=" + currentsem +
                '}';
    }
}
