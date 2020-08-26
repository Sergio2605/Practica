package com.practicabackend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.practicabackend.apirest.models.entity.Practicas;

public interface IPracticaDao extends CrudRepository<Practicas,Long>{

}
