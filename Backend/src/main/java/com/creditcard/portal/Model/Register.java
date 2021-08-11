package com.creditcard.portal.creditcard.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Signup")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    public Register(String uname, String upassword,String cpassword) 
    {
        this.uname = uname;
        this.upassword = upassword;
        this.cpassword = cpassword;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ccdet", referencedColumnName = "id")
    private Ccdetails ccdetails;

    @Column(name="uname")
    private String uname;
    @Column(name="upassword")
    private String upassword;

    @Override
    public String toString() {
        return "Register [Id=" + Id + ", cpassword=" + cpassword + ", uname=" + uname + ", upassword=" + upassword
                + "]";
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    @Column(name="cpassword")
    private String cpassword;
    
   


}
