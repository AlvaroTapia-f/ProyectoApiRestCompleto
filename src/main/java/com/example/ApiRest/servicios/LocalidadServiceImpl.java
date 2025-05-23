package com.example.ApiRest.servicios;

import com.example.ApiRest.entidades.Localidad;
import com.example.ApiRest.repositorios.BaseRepository;
import com.example.ApiRest.repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Localidad> search(String filtro) throws Exception {
        try {
            List<Localidad> localidades = localidadRepository.search(filtro);
            return localidades;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
