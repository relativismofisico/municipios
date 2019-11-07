package com.crudMunicipio.crudMunicipio;

import java.util.List;

public interface MunicipioService {

	List<Municipio>listar();
	Municipio listarId(int id);
	Municipio add(Municipio m);
	Municipio edit(Municipio m);
	Municipio delete(int id);  
}

