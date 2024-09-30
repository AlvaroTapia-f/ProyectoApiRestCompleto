package com.example.ApiRest.repositorios;

import com.example.ApiRest.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Metodo de Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    //boolean existsByDni(int dni);

    //Utilizando la notación Query, con la consulta JPQL
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    //En SQL
    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true)
    List<Persona> searchNativo(@Param("filtro") String filtro);





}
