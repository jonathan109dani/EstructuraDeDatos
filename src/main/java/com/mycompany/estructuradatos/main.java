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
    /*static int arr[] = {12,24,5,7,9};*/
    //static int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
    
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
        
        /*queue cola1 = new queue();
        cola1.insertar(5);
        cola1.insertar(11);
        cola1.insertar(2);
        cola1.insertar(10);
        cola1.insertar(12);
        cola1.insertar(55); 
        cola1.extraer();
        cola1.isEmpty();
        System.out.println(cola1.contar());/*
        
        
        */
        //System.out.println(practicaExamen.Problema1(123,2));
        
        /*String v = "hola";
        System.out.println(v.length());
        System.out.println(v.charAt(v.length()));
        
        System.out.println(v.charAt(0));*/
       
        //practicaExamen.Problema2("hola",0);
        //System.out.println(practicaExamen.Problema3(5, 0));
        
        //practicaExamen.Problema5(matriz);
       /* 
        System.out.println("Ingrese el tamaño del vector: ");
        int t = new java.util.Scanner(System.in).nextInt();
        int []vector7 = new int [t];
        
        practicaExamen.Problema7(vector7,0);
        
        pilaString pilaS = new pilaString();
        pilaS.push("a");
        pilaS.push("b");
        pilaS.push("c");
        pilaS.push("d");
        if (pilaS.isEmpty() == false) {
            
            System.out.printIn(pilaS.pop());
            guardaDato = (String) pila.dret;
            vector[]=guardaDato;
        }

        System.out.print(Arrays.toString(vector));*/
       
       /*lista miLista = new lista();
       miLista.insertar(new persona(5,"Pedro"));
       miLista.insertar(new persona(10,"Juan"));
       miLista.insertar(new persona(7,"Ian"));
       miLista.insertar(new persona(16,"Daniel"));
       miLista.insertar(new persona(3,"Diego"));
       miLista.insertar(new persona(15,"Gera"));
       miLista.imprimirLista();
       //System.out.println(miLista.existe(20));
        System.out.println("");
       miLista.modificar(16,"Israel");
       miLista.imprimirLista();*/

       /*
       ListaDobleCircular miLista = new ListaDobleCircular();
       miLista.inserta(new persona(5,"Pedro"));
       miLista.inserta(new persona(16,"Daniel"));
       miLista.inserta(new persona(3,"Diego"));
       miLista.inserta(new persona(15,"Gera"));
       System.out.println(miLista.existe(15));*/
       
       Arbol miArbol = new Arbol();
       
       miArbol.inserta(50);
       miArbol.inserta(20);
       miArbol.inserta(80);
       miArbol.inserta(15);
       miArbol.inserta(30);
       miArbol.inserta(14);
       miArbol.inserta(40);
       miArbol.inserta(90);
       miArbol.inserta(75);
       miArbol.inserta(33);
       miArbol.inserta(82);
       miArbol.inserta(42);
       miArbol.inserta(43);
       
       /*miArbol.inOrden();
       System.out.println("-------------------------");
       miArbol.iMenor();
       System.out.println("-------------------------");
       miArbol.iHojas();*/
       
       miArbol.retornarAltura();
    }
    
}
