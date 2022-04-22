/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class practicaExamen {
    
    static int arr[] = {};
    //division, division con %, recursion
    public int Problema1(int n, int p){
        
        if (n < 10) {
            return n;
        }else{
            //3 * 10p3 + (12, 2) //2* 10p2 + (1,1) //1* 10p1
            return n%10 * (int)Math.pow(10, p) + Problema1(n/10, p-1);
        }
    }
    
    public static void Problema2(String palabra, int i){
        
        if (palabra.length() == 1) {
            System.out.println(palabra.charAt(0));
        }else{
            System.out.println(palabra.charAt(i));
            Problema2(palabra, i++);
        }
        
    }
    
    public static int Problema3(int n, int i) {
        
        if(i == arr.length){
            return n;
        }else{
            return Problema3(arr[i]= n,i++);
        }
    }
    
    public static int Problema4(int array[], int cont){
        int res=0;
        
            for(int i = 0; i < array.length;i++){
                res += array[i];
            }
            
        return res;
            
       /* if(cont == array.length){
            return res;
        }else{
            return 
        }*/
    }
    
    //int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
    public static void Problema5(int[][] matriz) {
        
        pila Pila = new pila();

        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f < matriz[c].length; f++) {
                Pila.push(matriz[c][f]);
            }
        }
        
    }
    
    
    public static void Problema7(int []v,int i){
        
        queue cola1 = new queue();
        
        if (i <= v.length-1) {
            System.out.println("Indice: " + i);
            System.out.println("Ingrese un numero: ");
            v[i] = new java.util.Scanner(System.in).nextInt();
            //System.out.println("Tamaño del vector: "+v.length);
            cola1.insertar(v[i]);
            Problema7(v, i+1);
        }
        
    }

}
