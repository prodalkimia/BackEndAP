package com.proyectoapbecr.carlosrod.Entity;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size (min = 1, max = 50, message = "No cumple con la longitud necesaria")
    private String nombre;
    
    @NotNull
    @Size (min = 1, max = 50, message = "No cumple con la longitud necesaria")
    private String apellido;
    
    @Size (min = 1, max = 50, message = "No cumple con la longitud necesaria")
    private String img;         
}
