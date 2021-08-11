package com.creditcard.portal.creditcard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="CardApplication")
public class Application 
{
    
    
    public Application(String name, String email, String phone, String age, String gender,
            String country, String pannumber,String income,String ctype) 
            {
        
        this.name = name;
        this.email=email;
        this.phone=phone;
        this.age=age;
        this.gender=gender;
        this.country=country;
        this.pannumber=pannumber;
        this.income=income;
        this.ctype=ctype;
    }
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Application [age=" + age + ", country=" + country + ", ctype=" + ctype + ", email=" + email
                + ", gender=" + gender + ", id=" + id + ", income=" + income + ", name=" + name + ", pannumber="
                + pannumber + ", phone=" + phone + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPannumber() {
        return pannumber;
    }
    public void setPannumber(String pannumber) {
        this.pannumber = pannumber;
    }
    public Application()
    {

    }
  

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Size(min=3, message="Name should have atleast 3 characters")
    @Column(name="name")
    private String name;

    
    @Column(name="email")
    private String email;
    

    @Column(name="phone")
    private String phone;

    @Column(name="age")
    private String age;

    public String getIncome() {
        return income;
    }
    public void setIncome(String income) {
        this.income = income;
    }
    public String getCtype() {
        return ctype;
    }
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }


    @Column(name="gender")
    private String gender;

    @Column(name="country")
    private String country;

    @Column(name="pannumber")
    private String pannumber;

    @Column(name="income")
    private String income;

    @Column(name="ctype")
    private String ctype;

    

    
    
}
