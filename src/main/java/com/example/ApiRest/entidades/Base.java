package com.example.ApiRest.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@MappedSuperclass
@NoArgsConstructor
@Data
public class Base implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}
