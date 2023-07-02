/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 * @param <T>
 */
    public class Queue<T> {
    private Nodo first;
    private int size;
     /**
     * Constructor de la clase Queue.
     * Inicializa una cola vacía.
     */
    public Queue(){
        first = null;
        size =0;
    }
    /**
     * Obtiene el primer elemento de la cola.
     * @return El primer elemento de la cola.
     */
    public Object getFirst(){
        return first.getElement();
    }
    public int getSize(){
        return size;
    }
    /**
     * Verifica si la cola está vacía.
     * @return true si la cola está vacía, false de lo contrario.
     */
    public boolean isEmpty(){
        return first == null;
    }
    /**
     * Agrega un elemento a la cola.
     * @param x El elemento a agregar a la cola.
     */
    public void addToTheQueue(T x){
        Nodo pNew = new Nodo(x);
        pNew.setNext(this.first);
        this.first = pNew;
        size++;
    }
    
    /**
     * Elimina y retorna el primer elemento de la cola.
     * @return El primer elemento de la cola.
     */
    
    public Object unqueue(){
        Nodo temp = first;
        this.first = first.getNext();
        return temp.getElement();
    }
    
}
