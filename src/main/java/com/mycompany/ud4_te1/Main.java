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

public class Main {

    public static void main(String[] args) {
        operativaCuenta(2300);
    }

    public static void operativaCuenta( double cantidad) {
        CCuenta cuentaTrabajo;
        double saldoActual;
        

        cuentaTrabajo = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);
        saldoActual = cuentaTrabajo.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            cuentaTrabajo.retirar(cantidad);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Abono en cuenta");
            cuentaTrabajo.ingresar(695);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
