/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

import java.util.HashSet;

/**
 *
 * @author jonathan.villalobos
 */
public class pila {
    
     //variables
    private node top;
    private int lenght;
    
    public void Pilas(){
        this.top = null;
        this.lenght = 0;
    }
    
    public boolean isEmpty() {
        if (top == null) {
            System.out.println("La pila esta vacia");
            return true;
        } else {
            return top == null;
        }
    }

    public int getLenght(){
        return lenght;
    }
    
    /**
     * Metodo para ingresar un nuevo valor a la pila
     * @param value = valor a agregar en la pila
     */
    public void push(int value){
        node newNode = new node();
        newNode.setValue(value);
        
        //Verificar si el nodo esta vacio
        if (isEmpty()) {
            //Inicializar pila con newNode
            top=newNode;
            System.out.println("Nuevo top es: "+ top.getValue());
        }else{
            newNode.setNext(top);
            //Nuestro start/top ahora es el nuevo nodo
            top=newNode;
            System.out.println("Se agrego nuestro nuevo nodo a la pila: " + top.getValue());
        }
        lenght++;
    }
    
    /**
     * Quita el top de la pila
     */
    public void pop(){
        if (isEmpty()) {
            System.out.println("No hay ningun valor, agregar nuevo nodo");
        }else{
            System.out.println("Se quito el top de la fila: "+ top.getValue());
            //Asigna el que estaba como segundo en la pila a top
            top=top.getNext();
            System.out.println("Nuevo top es: "+ top.getValue());
            lenght--;
        }
    }
}
