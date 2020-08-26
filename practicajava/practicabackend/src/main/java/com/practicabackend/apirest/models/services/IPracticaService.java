package com.practicabackend.apirest.models.services;
import java.util.List;

import com.practicabackend.apirest.models.entity.Practicas;

public interface IPracticaService {
	
	public List<Practicas>findAll();
	
	public void save(Practicas Practicas);

}
