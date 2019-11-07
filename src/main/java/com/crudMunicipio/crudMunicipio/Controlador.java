package com.crudMunicipio.crudMunicipio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600 )
@RestController
@RequestMapping({"/municipios"})

public class Controlador {
	
	@Autowired
	MunicipioService service;
	
	@GetMapping
	public List<Municipio>listar(){
		 return service.listar();
	}
	
	@PostMapping
	public Municipio agregar(@RequestBody Municipio m) {
		return service.add(m); 
	}
}
