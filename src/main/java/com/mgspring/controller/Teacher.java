package com.mgspring.controller;

import java.util.List;
import java.util.Map;

public class Teacher {
    private Integer tid;
    private String tname;
    private List<String> cls;
    private List<Student> students;
    private Map<String,String> bossmap;


    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", cls=" + cls +
                ", students=" + students +
                ", bossmap=" + bossmap +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<String> getCls() {
        return cls;
    }

    public void setCls(List<String> cls) {
        this.cls = cls;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<String, String> getBossmap() {
        return bossmap;
    }

    public void setBossmap(Map<String, String> bossmap) {
        this.bossmap = bossmap;
    }
}
