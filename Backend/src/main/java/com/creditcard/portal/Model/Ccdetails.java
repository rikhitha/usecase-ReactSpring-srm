package com.creditcard.portal.creditcard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Ccdetails")
public class Ccdetails
{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(mappedBy = "ccdetails")
    private Register register;

    public Ccdetails(String num, String nam,String exp,String cv) {
        this.num = num;
        this.nam = nam;
        this.exp=exp;
        this.cv=cv;
    }
    public Ccdetails()
    {

    }

    
    
    @Column(name="number")
    private String num;

    public String getNum() {
        return num;
    }
    @Override
    public String toString() {
        return "Ccdetails [cv=" + cv + ", exp=" + exp + ", id=" + id + ", nam=" + nam + ", num=" + num + "]";
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getNam() {
        return nam;
    }
    public void setNam(String nam) {
        this.nam = nam;
    }
    public String getExp() {
        return exp;
    }
    public void setExp(String exp) {
        this.exp = exp;
    }
    public String getCv() {
        return cv;
    }
    public void setCv(String cv) {
        this.cv = cv;
    }

    @Column(name="name")
    private String nam;

    @Column(name="expiry")
    private String exp;

    
    @Column(name="cvc")
    private String cv;
}
