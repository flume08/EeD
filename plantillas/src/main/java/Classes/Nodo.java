/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author carre
 */
public class Nodo {
    private Nodo next;
<<<<<<< HEAD
    private int element;
=======
    private Object element;
>>>>>>> main

    public Nodo(int element) {
        this.next = null;
        this.element = element;
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * @return the element
     */
<<<<<<< HEAD
    public int getElement() {
=======
    public Object getElement() {
>>>>>>> main
        return element;
    }

    /**
     * @param element the element to set
     */
<<<<<<< HEAD
    public void setElement(int element) {
=======
    public void setElement(Object element) {
>>>>>>> main
        this.element = element;
    }
}
