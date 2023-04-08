package com.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stud.model.Studentmodel;

@Repository
public interface Studentrepository extends JpaRepository<Studentmodel,Integer>{

}
