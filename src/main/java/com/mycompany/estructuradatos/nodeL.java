/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class nodeL {
    persona personaValue;
    nodeL next;

    public nodeL(persona personaValue) {
        this.personaValue = personaValue;
    }

    public persona getPersonaValue() {
        return personaValue;
    }

    public void setPersonaValue(persona personaValue) {
        this.personaValue = personaValue;
    }

    public nodeL getNext() {
        return next;
    }

    public void setNext(nodeL next) {
        this.next = next;
    }
    
}
