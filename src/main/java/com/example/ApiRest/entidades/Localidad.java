package com.example.ApiRest.entidades;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "localidad")
@Audited
public class Localidad extends Base {

    @Column(name = "denominación")
    private String denominacion;


}
