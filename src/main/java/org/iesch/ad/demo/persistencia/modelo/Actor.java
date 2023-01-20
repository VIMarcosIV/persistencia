package org.iesch.ad.demo.persistencia.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Actor {
    @Id
    @Column(length = 9)
    String dni;
    String nombre;
    LocalDate nacimiento;

    @ManyToOne(fetch = FetchType.EAGER)
    Pelicula pelicula;

}
