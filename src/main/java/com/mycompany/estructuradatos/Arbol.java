/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

import com.sun.source.tree.ContinueTree;

/**
 *
 * @author jonathan.villalobos
 */
public class Arbol {
    private NodoArbol raiz;
    private int altura;
    
    public void inserta(int value){
        
        if(raiz == null){
            raiz= new NodoArbol(value);
        }else{
            insertar(raiz,value);
        }
    }
    
    public void insertar(NodoArbol nodo, int value){
        
        if (value < nodo.getId()) {
            if(nodo.getHijoIzq()==null){
                nodo.setHijoIzq(new NodoArbol(value));
            }else{
                insertar(nodo.getHijoIzq(), value);
            }
        } else {
            if (nodo.getHijoDer() == null) {
                nodo.setHijoDer(new NodoArbol(value));
            }else{
                insertar(nodo.getHijoDer(), value);
            }
        }
    }
    
    public void inOrden(){
        
        if(raiz!=null){
            inOrdenRecorrer(raiz);
        }else{
            System.out.println("Arbol vacio...");
        }
        
    }
    
    private void inOrdenRecorrer(NodoArbol nodo){
        if(nodo != null){
            inOrdenRecorrer(nodo.getHijoIzq());
            System.out.println(nodo.getId());
            inOrdenRecorrer(nodo.getHijoDer());
        }
    }
    
   public void iMenor(){
        
        if(raiz!=null){
            imprimirMenor(raiz);
        }else{
            System.out.println("Arbol vacio...");
        }
        
    }
    
    private void imprimirMenor(NodoArbol nodo) {
        
        if(nodo != null) {
            if (nodo.getHijoIzq() != null) {
                imprimirMenor(nodo.getHijoIzq());
            } else {
                System.out.println(nodo.getId());
            }
        }
    }
    
    public void iHojas(){
        
        if(raiz!=null){
            imprimeHojas(raiz);
        }else{
            System.out.println("Arbol vacio...");
        }
    }
    
    private void imprimeHojas(NodoArbol nodo){
        if(nodo != null){
            
            imprimeHojas(nodo.getHijoIzq());
            
            if(nodo.getHijoDer() == null && nodo.getHijoIzq() == null){
                System.out.println(nodo.getId());
            }
            
            imprimeHojas(nodo.getHijoDer());
        }
    }
    
    private void retornarAltura(NodoArbol nodo, int nivel){
        if (nodo != null) {
            retornarAltura(nodo.getHijoIzq(), nivel+1);
            if(nivel>altura){
                altura=nivel;
            }
            retornarAltura(nodo.getHijoDer(),nivel+1);
        }
    }
    
    public int retornarAltura(){
        altura=0;
        retornarAltura(raiz,1);
        System.out.println(altura);
        return altura;
    }
}
