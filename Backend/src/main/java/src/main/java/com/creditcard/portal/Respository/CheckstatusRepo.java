package com.creditcard.portal.creditcard.Respository;

import com.creditcard.portal.creditcard.Model.Checkstatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckstatusRepo  extends JpaRepository<Checkstatus,Integer>
{
    
}
