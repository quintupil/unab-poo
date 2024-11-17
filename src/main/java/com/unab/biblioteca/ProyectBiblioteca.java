/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unab.biblioteca;

/**
 *
 * @author garci
 */
public class ProyectBiblioteca {

    public static void main(String[] args) {
        System.out.println("Sistema Biblioteca Bienvenido!!!");
        
        Docente userDocente = new Docente();
        userDocente.setNombre("Carlos García");
        userDocente.setRut("14.120.095-K");
        userDocente.setGenero("FM");
        userDocente.setMagister(true);
        userDocente.setDoctor(true);
       
        System.out.println("Docente instanciado con exito!!!!");
        System.out.println(userDocente.toString());
        
        
    }
}
