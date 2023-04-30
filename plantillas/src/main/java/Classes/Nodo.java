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
    private int element;

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
    public int getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(int element) {
        this.element = element;
    }
}
