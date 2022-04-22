/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;
/*
    Casos de usos para los grafos:

1. Para la tecnologia blockchain que utilizan los NFTs
2. Modelar trayectos de un autobus para encontrar el camino mas optimo.
3. Sirve para el dibujo computacional.

*/
/**
 *
 * @author jonathan.villalobos
 */
public class Graph {
    
    public int numVertices; //Contamos cuantos vertices hay en el grafo
    private int maxCapacity; //Maxima capacidad de vertices
    private int[] vertices; //Almacenamos la lista de vertices
    private int[][] edges;; //Almacenamos las aristas
    
    
    //Constructor

    public Graph(int maxVertices) {
        this.numVertices = 0;
        this.maxCapacity = maxVertices;  //Definimos la capcidad maxima
        this.vertices = new int [this.maxCapacity];  //Creamos una lista para almacenar los vertices
        this.edges = new int[this.maxCapacity][this.maxCapacity]; //Creamos una lista para almacenar las aristas
    }
    
    public void addVertex(int vertex){
        
        //Validamos que haya campo en el grafo
        if (this.numVertices == this.maxCapacity) {
            System.out.println("El grafo ya esta lleno.");
            return;
        } else if (vertex != 0) {
            System.out.println("No se puede insertar un grafo nulo");
        }
        
        this.vertices[this.numVertices] = vertex;
        
        for (int i = 0; i < this.numVertices; i++) {
            
            //Llenamos con 0 hasta que se le asigne un peso a la arista
            
            this.edges[this.numVertices][i] = 0;
            this.edges[i][this.numVertices] = 0;
            
        }
        //Se incrementa la cuenta de vertices insertados
        this.numVertices++;
    }
    
    /**
     * 
     * @param vertex Vertice del cual se quiere saber el indice
     * @return index Indice de la posicion del vertice. -1 si no se encuentra
     */
    private int findVertex(int vertex) {
        
        for (int i = 0; i < this.vertices.length; i++) {
            if (this.vertices[i] == vertex) {
                return i;
            }
        }
        return -1;
    }
    
    public int getWeidght (int fromVertex, int toVertex){
        int row = findVertex(fromVertex);
        int column = findVertex(toVertex);
        
        if(row != -1 && column != -1 ){
            return this.edges[row][column];
        }else{
            return -1;
        }
    }
    
    public void addEdge (int fromVertex, int toVertex, int weight){
        
        int row = findVertex(fromVertex);//Encontramos el indice del primer vertice a conectar
        int column = findVertex(toVertex);//Encontramos el indice del vertice que se desea conectar
        
        if (row != -1 && column != -1){
            //Debido a que es un grafo no dirigido, asignamos el peso a ambos sentidos de la matriz.
            this.edges[row][column] = weight;
            this.edges[column][row] = weight;
        } else {
            System.out.println("No se puede crear una arista entre vertices que no estan en el grafo");
        }
        
    }    

    public void mostrarGrafo() {
        
        System.out.print(" ");
        for (int i = 0; i < maxCapacity; i++) {
            System.out.printf("  %3d", i);
        }
        System.out.println();
        for (int i = 0; i < maxCapacity; i++) {
            System.out.printf(" %3d", i);
            for (int j = 0; j < maxCapacity; j++) {
                System.out.printf(" %3d", edges[i][j]);
            }
            System.out.println();
        }
    }

}
