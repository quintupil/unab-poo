/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unab.biblioteca;

/**
 *
 * @author garci
 */
public abstract class Usuario implements InterfaceUsuario{
    private int rut;
    private String dv;
    private String nombre;
    private String genero;

    
    /**
     * Se valida el rut antes de setear
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        if ( !validarRut(rut) )
            throw new IllegalArgumentException("El RUT: "+ rut +" no es valido !!!!");
    }
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Se valida el genero antes de setear
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        if( !validarGenero(genero) ) {
            String mensaje = "El Genero: "+ genero +" no es valido. Valores permitidos: " 
                    + InterfaceUsuario.FEMENINO + " o " 
                    + InterfaceUsuario.MASCULINO;
            throw new IllegalArgumentException( mensaje );
        }
    }
    
    
    /**
     * @return the rut with format 9876543-K
     */
    public String getRutConFormato() {
        return String.valueOf(this.rut) + "-" + this.dv ;
    }

    /**
     * @return the rut
     */
    public int getRut() {
        return rut;
    }
    
    /**
     * @return the dv
     */
    public String getDv() {
        return dv;
    }
    


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    @Override
    public boolean validarRut(String rut){
        if ( rut == null) {
            throw new IllegalArgumentException("El RUT no puede ser vacio");
        } else if ( rut.length() < 2 ) {
            throw new IllegalArgumentException("El RUT no es valido");
        } else {
            rut = rut.replace(".", "").replace("-", "");
            try {
                // Extraer el dígito verificador
                char dv = rut.charAt(rut.length() - 1);
                String rutNumerico = rut.substring(0, rut.length() - 1);

                // Calcular el dígito verificador esperado
                int calculatedDv = calculateDV(Integer.parseInt(rutNumerico));

                // Comparar el dígito verificador ingresado con el calculado
                boolean isValid =  (dv == 'K' && calculatedDv == 10) || (dv == '0' + calculatedDv);
                if( isValid ) {
                    this.dv = String.valueOf(dv);
                    this.rut = Integer.parseInt(rutNumerico);
                }
                return isValid;
            } catch (NumberFormatException e) {
                return false; // El RUT no es válido si contiene caracteres no numéricos (excepto el DV)
            }
        }
    }

    @Override
    public int calculateDV(int rut) {
        int sum = 0;
        int multiplier = 2;

        // Calcular la suma ponderada de los dígitos del número del RUT
        while (rut > 0) {
            sum += (rut % 10) * multiplier;
            rut /= 10;

            // Ajustar el multiplicador (de 2 a 7 y volver a 2)
            multiplier = (multiplier == 7) ? 2 : multiplier + 1;
        }

        // Calcular el dígito verificador
        int remainder = 11 - (sum % 11);
        return (remainder == 11) ? 0 : remainder;
    }
    
    
    @Override
    public boolean validarGenero(String genero) {
        if ( genero == null || "".equals(genero.trim())) {
            throw new IllegalArgumentException("El Genero no puede ser vacio");
        } else if ( genero.length() > 1 ) {
            return false;
        } else {
            boolean isValid = (InterfaceUsuario.MASCULINO.equals(genero) || InterfaceUsuario.FEMENINO.equals(genero));
            if (isValid) {
                this.genero = genero;
            }
            return isValid;
        }
    }
}
