/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisn
 */
package modelo;
import javax.persistence.*; // Importante para las etiquetas
import java.io.Serializable;
import java.time.LocalDate;

@Entity // 1. Etiqueta de persistencia
public class Tarea implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // 2. ID autoincremental
    
    private String nombre;
    private String descripcion;
    private LocalDate plazo;
    private boolean estaTerminada;

    public Tarea() {} // 3. Constructor vacío obligatorio para JPA
    
    public Tarea(String nombre, String descripcion, LocalDate plazo, boolean estaTerminada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.plazo = plazo;
        this.estaTerminada = estaTerminada;
    }

    // Getters y Setters (Mantén los mismos que tienes) 
}