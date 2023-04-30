/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plantillas;

import Classes.List;
import Classes.Nodo;

/**
 *
 * @author carre
 */
public class Plantillas {
    public static void main(String[] args){
    List mylist = new List();
    Nodo nodo1 = new Nodo(5);
    Nodo nodo2 = new Nodo(9);
    Nodo nodo3 = new Nodo(6);
    mylist.addAtTheEnd(nodo1);
    mylist.addAtTheEnd(nodo3);
    mylist.addAtTheEnd(nodo2);
    mylist.insert(3,nodo3);
    mylist.print();
        System.out.println("------");
    mylist.delete(nodo3);
    mylist.print();
    //mylist.accessElement(2);
    
    }
}
