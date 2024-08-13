package com.poly.beesixcakebe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poly.beesixcakebe.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer>{
}
