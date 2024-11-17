/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unab.biblioteca;

/**
 *
 * @author garci
 */
public interface InterfaceUsuario {
    
    public static final String MASCULINO = "M";
    public static final String FEMENINO = "F";

    
    /**
     * Valida el rut de un usuario del sistema
     * @param rut
     * @return boolean
     */
    public boolean validarRut(String rut);
    
    /**
     * Calcula el DV
     * @param rut
     * @return 
     */
    public int calculateDV(int rut);

    /**
     * Valida que sea F o M
     * @param genero
     * @return 
     */
    public boolean validarGenero(String genero);
}
