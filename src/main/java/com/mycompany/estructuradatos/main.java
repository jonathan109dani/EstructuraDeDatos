/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class main {
    
    //Array en el cual se va a buscar en la funcion buscarElemento.
    static int arr[] = {12,24,5,7,9};
    
    public static void main(String[] args){
        //System.out.println(recursion.factorial(5));
        
        //Orden: int n, int arr[], int f, int i
        //System.out.println(recursion.buscarElemento(12,arr,arr.length-1,0));
        /*
        pila Pila = new pila();
        System.out.println(Pila.getLenght());
        Pila.push(1);
        System.out.println(Pila.getLenght());
        Pila.push(7);
        Pila.push(909090);
        System.out.println(Pila.getLenght());
        Pila.pop();
        System.out.println(Pila.getLenght());*/
        
        queue cola1 = new queue();
        cola1.insertar(5);
        cola1.insertar(11);
        cola1.insertar(2);
        cola1.insertar(10);
        cola1.insertar(12);
        cola1.insertar(55);
        cola1.extraer();
        cola1.isEmpty();
        System.out.println(cola1.contar());
    }
    
}
