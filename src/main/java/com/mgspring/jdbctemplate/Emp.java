package com.mgspring.jdbctemplate;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.jdbctemplate
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 9:56
 * Description:TODO
 * Modify: TODO
 */
public class Emp {
    private Integer eid;
    private String ename;
    private Integer age;
    private String sex;

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
