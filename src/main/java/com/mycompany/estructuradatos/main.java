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
        System.out.println(recursion.buscarElemento(12,arr,arr.length-1,0));
    }
    
}
