package com.example.ApiRest.servicios;

import com.example.ApiRest.entidades.Libro;
import com.example.ApiRest.repositorios.BaseRepository;
import com.example.ApiRest.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {super(baseRepository);}
}
