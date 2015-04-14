package com.andrew.dataexam.repository;


import com.andrew.dataexam.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    @Query("select b from Worker b where b.name = :name")
    Worker findByName(@Param("name") String name);
}
