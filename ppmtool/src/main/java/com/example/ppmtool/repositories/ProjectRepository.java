package com.example.ppmtool.repositories;


import com.example.ppmtool.domian.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository <Project, Long> {

}
