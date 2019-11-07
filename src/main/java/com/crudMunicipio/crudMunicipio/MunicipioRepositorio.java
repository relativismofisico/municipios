package com.crudMunicipio.crudMunicipio;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface MunicipioRepositorio extends Repository<Municipio, Integer>{
	List<Municipio>findAll();
	Municipio findOne(int id);
	Municipio save(Municipio m);
	Municipio delete(Municipio m);
}
