/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class node {
    
    //variables
    private node next;
    private int value;

    //Constructor
    public void node() {
        this.next = null;
        this.value = 0;
    }
    
    //Getter and Setter
    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}

//Nueva clase pilas

/*public class Pilas{
    
    //variables
    private node start;
    private int lenght;
    
    public void Pilas(){
        this.start = null;
        this.lenght = 0;
    }
    
    public boolean isEmpty(){
        return start==null;
    }
    
    public int getLenght(){
        return lenght;
    }
    
    
}*/