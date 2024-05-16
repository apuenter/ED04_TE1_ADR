  /******************************************************************************************************************
   
     Nombre:   Ainhoa de la Puente     
     Fecha:    16/05/2024
     Modulo:   Entornos de Desarrollo.
     UD:       UD04 Optimización y documentación.
     Tarea:    ED04 Tarea Evaluativa 1. Aplicando el control de versiones, la refactorización y la documentación
     de aplicaciones Java (100%).
     Autoevaluación: 
     URL del Proyecto en GitHub: https://github.com/apuenter/ED04_TE1_ADR.git
                                           
   *******************************************************************************************************************/

package com.mycompany.ud4_te1;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    public static final int COMISION = 2;
    
    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }


    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad + COMISION)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + COMISION);
    }
    
   
}
