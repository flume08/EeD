/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plantillas;

import Classes.ListArray;


/**
 *
 * @author carre
 */
public class Plantillas {
    public static void main(String[] args){
        ListArray myList = new ListArray();
        myList.insert(10);
        myList.insert(3);
        myList.insert(7);
        myList.insert(21);
        System.out.println("El primer index es: " + myList.first());
        System.out.println("El ultimo index es: " +  myList.last());
        System.out.println(myList.read(2));
        myList.delete(2);
        System.out.println(myList.first());
    }
}
