/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author carre
 */
public class Nodo2 {
    private Nodo2 last;
    private Nodo2 next;
    private int element;
    public Nodo2(int element){
        this.element = element;
        this.next = null;
        this.last = null;
    }
    /**
     * @return the last
     */
    
    public Nodo2 getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Nodo2 last) {
        this.last = last;
    }

    /**
     * @return the next
     */
    public Nodo2 getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo2 next) {
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
