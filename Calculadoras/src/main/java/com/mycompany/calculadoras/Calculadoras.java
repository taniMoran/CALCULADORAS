/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoras;

/**
 *
 * @author tanim
 */
import java.util.Scanner;
public class Calculadoras {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una de las siguientes opciones");
        System.out.println("1:  suma");
        System.out.println("2:  resta");
        System.out.println("3:  multiplicacion");
        System.out.println("4:  division");
        opcion = sc.nextInt();
        switch (opcion){
        
            case 1:
                System.out.println("Usted eligio suma");                
                op.getResultado(op.suma());
                break;
                case 2:
                System.out.println("Usted eligio resta");
                  op.getResultado(op.resta());
                  break;
                case 3:
                System.out.println("Usted eligio multiplicacion");
                  op.getResultado(op.multiplicacion());
                  break;
                case 4:
                System.out.println("Usted eligio division");
                  op.getResultado(op.division());
                  break;
               
        
        
        }

    }}

