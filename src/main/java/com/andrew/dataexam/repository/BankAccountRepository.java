package com.andrew.dataexam.repository;


import com.andrew.dataexam.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{
    @Query("select b from BankAccount b where b.name = :name")
    BankAccount findByName(@Param("name")String name);
}
