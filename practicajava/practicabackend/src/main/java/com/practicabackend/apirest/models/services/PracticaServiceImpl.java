package com.practicabackend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicabackend.apirest.models.dao.IPracticaDao;
import com.practicabackend.apirest.models.entity.Practicas;

@Service
public class PracticaServiceImpl implements IPracticaService {
	
	
	@Autowired
	private IPracticaDao practicaDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<Practicas> findAll() {
	
		return (List<Practicas>) practicaDAO.findAll();
	}
	
	@Override

	public void save(Practicas Practicas) {
		practicaDAO.save(Practicas);
		
	}
	

}
 