/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class Stacks<T> {
    private Nodo<T> top;

    public void push(T value) {
        Nodo newNode = new Nodo(value);
        newNode.setNext(top);
        top = newNode;
    }

    public T pop() {
        T value = top.getElement();
        top = top.getNext();
        return value;
    }

    public T peek() {
        return top.getElement();
    }

    public boolean isEmpty() {
        return top == null;
    }
}
