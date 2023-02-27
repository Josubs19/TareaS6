package com.practica01.g3.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")

public class Pais implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long idPais;
    
    private String nombre;
    private String capital;
    private int poblacion;
    private String costas;

    public Pais(){
        
    }

    public Pais(String nombre, String capital, int poblacion, String costas) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;

    }

}
