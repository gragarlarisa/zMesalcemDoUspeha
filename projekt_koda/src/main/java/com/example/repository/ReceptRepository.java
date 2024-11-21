package com.example.repository;

import com.example.model.Recept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptRepository extends JpaRepository<Recept, Long> {
}