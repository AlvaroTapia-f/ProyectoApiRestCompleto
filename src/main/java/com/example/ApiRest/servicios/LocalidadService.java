package com.example.ApiRest.servicios;

import com.example.ApiRest.entidades.Localidad;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {

    List<Localidad> search(String filtro) throws Exception;

}
