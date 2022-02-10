/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class recursion {
    
    //Array en el cual se va a buscar en la funcion buscarElemento.
    static int arr[] = {12,34,64,2,3};
    
    //El metodo recursivo debe tener una condicion de parada, que nos permita devolver un valor y llamarse a si misma.
    
    public static int factorial(int n) {
        if(n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
    //Metodo que logre buscar un valor X en un Array.
    
    public static int buscarElemento(int n, int arr[], int f, int i) {
        if(f < 1){
            return -1;
        }
        if(arr[i] == n){
            return n;
        }
        if(arr[f] == n){
            return n;
        }else{
            return buscarElemento(n,arr,f-1,1+i);
        }
    }
}

