package com.creditcard.portal.creditcard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="status")
public class Checkstatus 
{

    

    public Checkstatus(String uname, String upannumber,String ustatus,String adminid) {
        this.uname = uname;
        this.upannumber = upannumber;
        this.ustatus=ustatus;
        this.adminid=adminid;
    }
    public Checkstatus()
    {

    }

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    

    

    @Override
    public String toString() {
        return "Checkstatus [adminid=" + adminid + ", id=" + id + ", uname=" + uname + ", upannumber=" + upannumber
                + ", ustatus=" + ustatus + "]";
    }

    @Column(name="uname")
    private String uname;

    @Column(name="upannumber")
    private String upannumber;

    @Column(name="ustatus")
    private String ustatus;

    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpannumber() {
        return upannumber;
    }
    public void setUpannumber(String upannumber) {
        this.upannumber = upannumber;
    }
    public String getUstatus() {
        return ustatus;
    }
    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
    public String getAdminid() {
        return adminid;
    }
    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    @Transient
    @Column(name="adminid")
    private String adminid;
}
