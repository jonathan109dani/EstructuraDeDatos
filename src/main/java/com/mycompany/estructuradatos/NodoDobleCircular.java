/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class NodoDobleCircular {
    
    //variables
    private NodoDobleCircular next;
    private NodoDobleCircular back;
    private persona persona;

    //Constructor
    
    public NodoDobleCircular(persona persona) {
        this.persona = persona;
    }
    
    
    //Getter and Setter

    public NodoDobleCircular getNext() {
        return next;
    }

    public void setNext(NodoDobleCircular next) {
        this.next = next;
    }

    public NodoDobleCircular getBack() {
        return back;
    }

    public void setBack(NodoDobleCircular back) {
        this.back = back;
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "NodoDobleCircular{" + "next=" + next + ", back=" + back + ", persona=" + persona + '}';
    }
}