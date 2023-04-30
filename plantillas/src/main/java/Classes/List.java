/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author carre
 */
public class List {
    private Nodo first;
    private Nodo last;
    private int size;

    public List(int size) {
        this.first = null;
        this.last = null;
        this.size = size;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void empty(){
        this.first = null;
        this.last = null;
        this.size = 0;
        
    }
    public void addAtTheEnd(Nodo NewNodo){
        if(this.isEmpty()){
            first = last = NewNodo;
        }
        else{
            last.setNext(NewNodo);
            last = NewNodo;
            
        }
       size++;
    }
    public void DeleteAtTheStart(){
        if(!this.isEmpty()){
            if(size==1){
                this.empty();
            }
            else{
                first = first.getNext();
                size--;
            }
        }
    }
    public void printList(){
        Nodo temp = first;
        if(this.isEmpty()){
            System.out.println("The list is empty");
        }
        while(temp!=null){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}
