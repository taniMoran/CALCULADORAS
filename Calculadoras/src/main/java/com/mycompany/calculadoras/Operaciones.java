/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoras;

import java.util.Scanner;

/**
 *
 * @author tanim
 */
public class Operaciones 
{
    Scanner sc = new Scanner(System.in);
   private int numero1;
    private int numero2;
    private double resultado;
    
    
    public double suma(){
        
        System.out.println("Ingrese un numero para la suma");
        numero1 = sc.nextInt();
        System.out.println("Ingrese otro numero para sumar");
        numero2 = sc.nextInt();
        
        resultado = numero1 + numero2;
        return resultado;
        
        
    }
    
    public double resta(){
        
        System.out.println("Ingrese un numero para la resta");
        numero1 = sc.nextInt();
        System.out.println("Ingrese otro numero para restar");
        numero2 = sc.nextInt();
        
        resultado = numero1 - numero2;
        return resultado;
        
        
    }
    
    public double division(){
        
        System.out.println("Ingrese un numero para la division");
        numero1 = sc.nextInt();
        System.out.println("Ingrese otro numero para dividir");
        numero2 = sc.nextInt();
        
        resultado = numero1 / numero2;
        return resultado;
        
        
    }
    
    public double multiplicacion(){
        
        System.out.println("Ingrese un numero para la multiplicacion");
        numero1 = sc.nextInt();
        System.out.println("Ingrese otro numero para multiplicar");
        numero2 = sc.nextInt();
        
        resultado = numero1 * numero2;
        return resultado;
        
        
    }
    
    public void getResultado(double resultado)
    {
        
        System.out.println("El resultado de la operacion es: "+resultado);
        
    }
}