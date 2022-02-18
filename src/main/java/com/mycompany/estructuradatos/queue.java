/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class queue {
    
    //Atributos que ocupa la cola
    private node head;
    private node tail;
    
    //Constructor
    public queue(){
        this.head = null;
        this.tail = null;
    }
    
    //Metodo para ingresar un dato en la cola
    public void insertar(int dato){
        node newNode = new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        
        if (head == null & tail == null) {
            head = newNode;
            tail = newNode;
        }
        
        System.out.println("El valor anterior del tail es: "+tail.getValue());
        tail.setNext(newNode);
        tail = newNode;        
        System.out.println("El valor actual del tail es: "+tail.getValue());
    }
    
    //Metodo para extraer un dato en la cola
    public void extraer(){
        System.out.println("El valor anterior del head es: "+head.getValue());
        head = head.getNext();
        
        System.out.println("El valor actual del head es: "+head.getValue());
    }
    
    //Metodo para validar que no este vacia la cola
    public boolean isEmpty(){
        boolean cola = false;
        if (head == null & tail == null) {
            cola = true;
            System.out.println("La cola esta vacia");
        }else{
            System.out.println("La cola no esta vacia");
            cola=false;
        }
        return cola;
    }
    
    public int contar(){
        int contador =0;
        node c = this.head;
        
        if(isEmpty()){
            return contador;
        }else{
            while(c !=  null){
                contador++;
                c = c.getNext();
            }
            return contador;
        }
    }
}
