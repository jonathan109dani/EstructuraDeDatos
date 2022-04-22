/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class ListaDobleCircular {
    
    private NodoDobleCircular cabeza;
    private NodoDobleCircular ultimo;    
    
    
    public void inserta(persona persona){
        
        if(cabeza == null){
            
            cabeza = new NodoDobleCircular(persona);
            ultimo =  cabeza;
            
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
            //insertar al inicio
        }else if(persona.getId()<cabeza.getPersona().getId()){
        
            NodoDobleCircular aux = new NodoDobleCircular(persona);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
            //insertar en lo ultimo
        }else if(persona.getId()>=ultimo.getPersona().getId()){
            
            NodoDobleCircular aux = new NodoDobleCircular(persona);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo=ultimo.getNext();
            
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        
        }else{
            NodoDobleCircular aux = cabeza;
            
            //Verificar un elemento hacia adelante
            while(aux.getNext().getPersona().getId() < persona.getId()){
                aux = aux.getNext();
            }
            
            NodoDobleCircular temp = new NodoDobleCircular(persona);
            
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            temp.getNext().setBack(temp);
            aux.setNext(temp);
        }   
    }

    public boolean existe(int id) {
        
        NodoDobleCircular aux = cabeza;
        
        if (cabeza == null) {
            
            return false;
            
        } else if (cabeza == aux && ultimo == aux && aux.getPersona().getId() == id) {
            
            return true;
            
        }else if(id == ultimo.getPersona().getId()){
            
            return true;
            
        } else {

            while (aux != null && aux != ultimo) {

                if (id == aux.getPersona().getId()) {
                    return true;
                }

                aux = aux.getNext();
            }
            return false;
        }
    }
}
