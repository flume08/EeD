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
public class ArbolGeneral<T> {

    private NodoGeneral<T> raiz;

    public ArbolGeneral() {
        raiz = null;
    }

    public ArbolGeneral(T dato) {
        raiz = new NodoGeneral<>(dato);
    }

    public void setRaiz(NodoGeneral<T> nodo) {
        raiz = nodo;
    }

    public NodoGeneral<T> getRaiz() {
        return raiz;
    }

    public void agregarHijo(NodoGeneral<T> padre, NodoGeneral<T> hijo) {
        padre.agregarHijo(hijo);
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public boolean buscar(T dato) {
        return buscar(raiz, dato);
    }

    private boolean buscar(NodoGeneral<T> nodo, T dato) {
        if (nodo == null) {
            return false;
        }
        if (nodo.getDato().equals(dato)) {
            return true;
        }
        NodoGeneral<T> aux = nodo.getHijoIzquierdo();
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            encontrado = buscar(aux, dato);
            aux = aux.getHermanoDerecho();
        }
        return encontrado;
    }

    private void imprimir(NodoGeneral<T> nodo) {
        System.out.print(nodo.getDato() + " -> ");
        NodoGeneral<T> aux = nodo.getHijoIzquierdo();
        while (aux != null) {
            imprimir(aux);
            aux = aux.getHermanoDerecho();
        }
    }

    public void imprimir() {
        imprimir(raiz);
        System.out.println("null");
    }
}
