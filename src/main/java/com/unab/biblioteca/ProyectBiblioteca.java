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
        
        Docente userDocente = new Docente("55.555.555-5", "Carlos García", "M", true, true, "Informatica");
       
        System.out.println("Docente instanciado con exito!!!!");
        System.out.println(userDocente.toString());
        
        
    }
}
