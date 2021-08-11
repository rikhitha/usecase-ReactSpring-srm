package com.creditcard.portal.creditcard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="forms")
public class forms 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name="Referencename")
    private int Referencename;

    @Column(name="Referencnumber")
    private int Referencenumber;


}
