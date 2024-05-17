  /******************************************************************************************************************
   
     Nombre:   Ainhoa de la Puente     
     Fecha:    16/05/2024
     Modulo:   Entornos de Desarrollo.
     UD:       UD04 Optimización y documentación.
     Tarea:    ED04 Tarea Evaluativa 1. Aplicando el control de versiones, la refactorización y la documentación
     de aplicaciones Java (100%).
     Autoevaluación: https://docs.google.com/document/d/1wPwEiBb8zuDSa_R7C-GVfcLbtL3vyyKifzcEo21P3yo/edit?usp=sharing
     URL del Proyecto en GitHub: https://github.com/apuenter/ED04_TE1_ADR.git
                                           
   *******************************************************************************************************************/

package com.mycompany.ud4_te1;

/**
 * Es una clase que nos permite crear una cuenta bancaria, que nos permite ingresar
 * y retirar dinero.
 * @author Ainhoa
 * @version 5
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Variable constante que establece la comisión al retirar saldo.
     */
    public static final int COMISION = 2;
    
    /**
     * Constructor base.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta.
     * @param nom Nombre de la cuenta a establecer.
     * @param cue Número de cuenta a establecer.
     * @param sal Saldo de la cuenta a establecer.
     * @param tipo Tipo de interés a establecer.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Getter del nobmre.
     * @return String: nombre. Devuelve el nombre de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre.
     * @param nombre el nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del número de cuenta.
     * @return String: cuenta. Devuelve el número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter del número de cuenta.
     * @param cuenta el número de cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter del saldo.
     * @return double: saldo. Devuelve el saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Getter del saldo actual de la cuenta.
     * @param saldo el saldo de la cuenta a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter del tipoInteres.
     * @return double: tipoInterés. Devuelve  el tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Setter del tipoInterés.
     * @param tipoInteres tipoInterés a establecer.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método que agrega a saldo la cantidad que pasemos como parámetro.
     * @param cantidad de tipo Double. Será la cantida de dinero que ingresemos 
     * al saldo de la cuenta.
     * @throws Exception : Se lanzará una excepción que indique que la cantidad 
     * a ingresar debe de ser positiva.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }

    /**
     * Método que retira del saldo la cantidad que pasemos como parámetro.
     * @param cantidad de tipo Double. Será la cantidad de dinero que retiraremos
     * al saldo de la cuenta.
     * @throws Exception : se lanzarán dos excepciones diferentes:
     * una indicará que la cantidad a retirar debe de ser positiva
     * Otra nos avisará de que no hay suficiente saldo a retirar.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad + COMISION)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + COMISION);
    }
    
   
}
