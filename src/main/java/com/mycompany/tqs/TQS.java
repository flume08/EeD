/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tqs;
import classes.*;
/**
 *
 * @author carre
 */
public class TQS {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.addAtTheEndT(1);
        lista.addAtTheEndT(2);
        lista.addAtTheEndT(3);
        Nodo nodo = lista.deleteIndexN(1);
        lista.print();
        System.out.println(nodo.getElement());
    }
}
