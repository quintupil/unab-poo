/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unab.biblioteca;

/**
 *
 * @author garci
 */
public class Docente extends Usuario{
    private String profesion;
    private boolean magister;
    private boolean doctor;
    
    
    public Docente(String rut, String nombre, String genero, boolean isMagister, boolean isDoctor, String profesion) {
        super(rut, nombre, genero);
        setMagister(isMagister);
        setDoctor(isDoctor);
        setProfesion(profesion);
    }
    
    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the grado
     */
    public String getGrado() {
        if (isMagister() && isDoctor()) {
            return "magister y doctor";
        } else if (isMagister()){
            return "magister";
        } else if(isDoctor()) {
            return "doctor";
        } else {
            return "";
        }
    }

    /**
     * @param magister the magister to set
     */
    public void setMagister( boolean magister ) {
        this.magister = magister;
    }

    /**
     * @return the magister
     */
    public boolean isMagister() {
        return magister;
    }
    
    /**
     * @return the doctor
     */
    public boolean isDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }
    
    
    @Override
    public String toString() {
        String retorno = " RUT: " + getRutConFormato() + "\n"
                + " Nombre: " + getNombre() + "\n"
                + " Genero: " + getGenero() + "\n"
                + " Grado: " + getGrado() + "\n"
                + " profesión: " + getProfesion();
        return retorno;
    }
}
