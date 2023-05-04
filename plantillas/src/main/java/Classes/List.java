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
    
    public List(){ 
            this.first = null; 
            this.last = null; 
            this.size = 0; 
    }
    
    public boolean isEmpty(){
    return first == null; 
    }
    
    public void empty(){            
        this.first = null;            
        this.last = null;            
        this.size = 0;
    }
    public Nodo first(){
        return this.first;
    }
    public Nodo last(){
        return this.last;
    }
    public int accessElement(int index){
        if(index> 0 && index <= this.size){
            int i = 0;
            Nodo temp = this.first;
            while(i<index-1){
                temp = temp.getNext();
                i++;
            }
            return temp.getElement();
        }
        return -1;
    }
    public void insert(int x, Nodo pValor){
        Nodo newNodo = new Nodo(x);
        if (this.first()==this.last()){
            this.first = newNodo;
            size++;
        }else{
            if(pValor!=this.last){
                newNodo.setNext(pValor.getNext());
                pValor.setNext(newNodo);
                size++;
            }
        }
    }
    public void insertAtTheStart(int x){
        Nodo newNodo = new Nodo(x);
        newNodo.setNext(this.first());
        this.first = newNodo;
        size++;
    }
    public void addAtTheEnd(Nodo newNodo){        
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
    public void deleteAtTheStart(){            
        if(!this.isEmpty()){                
            if (size == 1) {                    
                this.empty();                
            }
            else{                    
                first = first.getNext();                   
                size--;                
            }            
        }        
    }
    public void next(Nodo pValue){
        if(pValue!=last()){
            pValue = pValue.getNext();
        }
    }
    public void delete(Nodo pValue){
        Nodo P;
        if(pValue==this.first()){
            P = first;
            first = P.getNext();
        }else{
            P = first;
            while(P.getNext()!= pValue){
             P = P.getNext();
            }
            P = pValue.getNext();
        }
        size--;
    }
    public void print(){        
        Nodo temp = first; 
        if(this.isEmpty()){            
            System.out.println("The list is empty.");        
        }        
        while(temp != null){            
            System.out.println(temp.getElement());            
            temp = temp.getNext();        
        } 
    }
    public int size(){
        return this.size;
    }
    public List revertList(){
        List revertedList = new List();
        for(int i= this.size(); i > 0;i--){
        int x = this.accessElement(i);
        Nodo temp = new Nodo(x);
        revertedList.addAtTheEnd(temp);
        }
        return revertedList;
    }
}    