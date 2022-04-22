/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class nodeString {
    
    //variables
    private nodeString next;
    private String value;

    //Constructor
    public void node() {
        this.next = null;
        this.value = null;
    }
    
    //Getter and Setter
    public nodeString getNext() {
        return next;
    }

    public void setNext(nodeString next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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