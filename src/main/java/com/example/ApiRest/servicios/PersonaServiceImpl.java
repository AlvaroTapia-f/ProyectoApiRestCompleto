package com.example.ApiRest.servicios;

import com.example.ApiRest.entidades.Persona;
import com.example.ApiRest.repositorios.BaseRepository;
import com.example.ApiRest.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired //Forma para poder acceder a todos los métodos que sean propios del repositorio persona
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            //List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            List<Persona> personas = personaRepository.search(filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
