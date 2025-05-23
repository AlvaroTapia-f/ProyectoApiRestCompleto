package com.example.ApiRest.servicios;

import com.example.ApiRest.entidades.Autor;
import com.example.ApiRest.repositorios.AutorRepository;
import com.example.ApiRest.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Autor> search(String filtro) throws Exception {
        try {
            List<Autor> autores = autorRepository.search(filtro);
            return autores;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
