package org.iesch.ad.demo.persistencia.modelo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// Esta anotacion se encarga de hacer que no ocurra el bucle este de los toString con llamadas recurrentes (se pone solo en una de las dos clases)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titulo;
    LocalDate year;
    String genero;
    String urlFoto;
    String director;
    String sinopsis;
    int duracion;
    int puntuacion;

    @OneToMany (mappedBy = "pelicula", fetch = FetchType.EAGER)
    List<Actor> listaActores = new ArrayList<>();
}
