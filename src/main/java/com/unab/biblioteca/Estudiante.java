/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unab.biblioteca;

/**
 *
 * @author garci
 */
public class Estudiante extends Usuario{
    private String carrera;

    public Estudiante(String rut, String nombre, String genero, String carrera) {
        super(rut, nombre, genero);   
        setCarrera(carrera);
        
    }
    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
