/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class NodoGeneral<T> {

    private T dato;
    private NodoGeneral<T> hijoIzquierdo;
    private NodoGeneral<T> hermanoDerecho;

    public NodoGeneral(T dato) {
        this.dato = dato;
        hijoIzquierdo = null;
        hermanoDerecho = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoGeneral<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoGeneral<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoGeneral<T> getHermanoDerecho() {
        return hermanoDerecho;
    }

    public void setHermanoDerecho(NodoGeneral<T> hermanoDerecho) {
        this.hermanoDerecho = hermanoDerecho;
    }

    public void agregarHijo(NodoGeneral<T> hijo) {
        if (hijoIzquierdo == null) {
            hijoIzquierdo = hijo;
        } else {
            NodoGeneral<T> aux = hijoIzquierdo;
            while (aux.getHermanoDerecho() != null) {
                aux = aux.getHermanoDerecho();
            }
            aux.setHermanoDerecho(hijo);
        }
    }
}
