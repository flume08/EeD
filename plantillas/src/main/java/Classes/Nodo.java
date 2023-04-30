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
    Nodo next;
    Object element;

    public Nodo(Object element) {
        this.next = null;
        this.element = element;
    }
}
