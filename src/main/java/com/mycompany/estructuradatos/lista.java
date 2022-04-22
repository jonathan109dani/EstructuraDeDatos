/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author jonathan.villalobos
 */
public class lista {
    
    private nodeL cabeza;

    public lista() {
    }
    
    public void insertar(persona p){
        if(cabeza == null){
            cabeza = new nodeL(p);
        }
        
        else if(p.getId() < cabeza.getPersonaValue().getId()){
            
            nodeL aux = new nodeL(p);
            aux.setNext(cabeza);
            cabeza = aux;
        }
        
        else if(p.getId() > cabeza.getPersonaValue().getId() && cabeza.getNext() == null){
            
            nodeL aux = new nodeL(p);
            cabeza.setNext(aux);
        }else{
            nodeL aux = cabeza;
            
            while(aux.getNext() != null && aux.getNext().getPersonaValue().getId() < p.getId()){
                aux=aux.getNext();
            }
            
            nodeL temp = new nodeL(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            
        }
    }
    
    public void imprimirLista(){
        nodeL aux=cabeza;
        while (aux != null) {            
            System.out.println(aux.getPersonaValue().toString());
            aux=aux.getNext();
        }
    }
    
    public boolean existe(int id){
        nodeL aux=cabeza;
        boolean bandera = false;
        while (aux != null) {            
            if(id == aux.getPersonaValue().getId()){
                return true;
            }
            aux=aux.getNext();
        }
        return bandera;
    }
    
    public void modificar(int id, String nombre){
        nodeL aux=cabeza;
        while (aux != null) {            
            if(id == aux.getPersonaValue().getId()){
                 aux.getPersonaValue().setNombre(nombre);
                 break;
            }
            aux=aux.getNext();
        }
    }
    
    public void eliminar(persona p){
        nodeL aux=cabeza;
        while (aux != null) {            
            if(p.getId() == aux.getPersonaValue().getId()){
                
                nodeL temp = new nodeL(p);
                break;
            }
            aux=aux.getNext();
        }
    }
            
            
    public nodeL getCabeza() {
        return cabeza;
    }

    public void setCabeza(nodeL cabeza) {
        this.cabeza = cabeza;
    }
    
}
