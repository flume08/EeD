/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
/**
 */
public class Lista<T> { 
    private Nodo first; 
    private Nodo last; 
    private int size; 
    /**
     * Constructor de la clase List.
     * Inicializa una lista vacía.
     */
    public Lista(){ 
            this.first = null; 
            this.last = null; 
            this.size = 0; 
    }
    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false de lo contrario.
     */
    public boolean isEmpty(){
    return first == null; 
    }
    /**
     * Vacía la lista, eliminando todos los elementos.
     */
    public void empty(){            
        this.first = null;            
        this.last = null;            
        this.size = 0;
    }
    /**
     * Obtiene el primer nodo de la lista.
     * @return El primer nodo de la lista.
     */
    public Nodo first(){
        return this.first;
    }
    /**
     * Obtiene el último nodo de la lista.
     * @return El último nodo de la lista.
     */
    public Nodo last(){
        return this.last;
    }
    /**
     * Accede al elemento en la posición especificada.
     * @param index La posición del elemento a acceder.
     * @return El elemento en la posición especificada.
     */
    public T accessElement(int index){
        if (index==0 || index == -size){
            return (T) this.first.getElement();
        }else{
        if(index> 0 && index <= this.size){
            int i = 0;
            Nodo temp = this.first;
            while(i<index){
                temp = temp.getNext();
                i++;
            }
            return (T) temp.getElement();
        }else if(index<0 && index > -size){
            return this.accessElement(index + size);
        }
        }
        System.out.println("Index out of range");
        return null;
        
    }
     /**
     * Accede al nodo en la posición especificada.
     * @param index La posición del nodo a acceder.
     * @return El nodo en la posición especificada.
     */
    public Nodo accessElementNodo(int index){
        if (index==0 || index == -size){
            return this.first;
        }else{
        if(index> 0 && index <= this.size){
            int i = 0;
            Nodo temp = this.first;
            while(i<index){
                temp = temp.getNext();
                i++;
            }
            return temp;
        }else if(index<0 && index > -size){
            return this.accessElementNodo(index + size);
        }
        }
        System.out.println("Index out of range");
        return null;
        
    }  
    /**
     * Inserta un elemento en la posición especificada.
     * @param x El elemento a insertar.
     * @param pValor El nodo después del cual se insertará el elemento.
     */
    public void insert(int x, Nodo pValor){
        Nodo newNodo = new Nodo(x);
        if (this.first()==this.last()){
            newNodo.setNext(first);
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
    public void insertT(int x, T element){
        Nodo pValor = new Nodo(element);
        Nodo newNodo = new Nodo(x);
        if (this.first()==this.last()){
            newNodo.setNext(first);
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
    /**
     * Inserta un elemento al inicio de la lista.
     * @param x El elemento a insertar.
     */
    public void insertAtTheStart(T x){
        Nodo newNodo = new Nodo(x);
        if (!(this.last == this.first))
        {
        newNodo.setNext(this.first());
        this.first = newNodo;
        }
        else
        {
            this.first = newNodo;
            this.last = newNodo;
        }
        size++;
    }
    /**
     * Agrega un nodo al final de la lista.
     * @param newNodo El nodo a agregar.
     */
    public void addAtTheEnd(Nodo newNodo){        
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
     /**
     * Agrega un elemento al final de la lista.
     * @param x El elemento a agregar.
     */
    public void addAtTheEndT(T x){
        Nodo newNodo = new Nodo(x);
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
    /**
     * Elimina el primer nodo de la lista.
     */
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
    /**
     * Avanza al siguiente nodo.
     * @param pValue El nodo actual.
     */
    public void next(Nodo pValue){
        if(pValue!=last()){
            pValue = pValue.getNext();
        }
    }
    /**
     * Elimina el nodo en la posición especificada.
     * @param index La posición del nodo a eliminar.
     */
    public void deleteIndex(int index){
        if (index == 0)
        {
            this.first = this.first.getNext();
        }
        else{
            Nodo temp = first();
            int contador = 0;
            while(contador < index-1)
            {
                temp = temp.getNext();
                contador++;
            }
            temp.setNext(temp.getNext().getNext());
            if (index == size-1){
                this.last = temp;
            }
        }
        size--;
    }
    public Nodo deleteIndexN(int index){
        if (index == 0)
        {
            Nodo node = first;
            this.first = this.first.getNext();
            size--;
        return node;}
        else{
            Nodo temp = first();
            int contador = 0;
            while(contador < index-1)
            {
                
                temp = temp.getNext();
                contador++;
            }
            Nodo node = temp;
            temp.setNext(temp.getNext().getNext());
            if (index == size-1){
                this.last = temp;
            }
            size--;
            return node;
        }}
    /**
     * Elimina un nodo específico de la lista.
     * @param pValue El nodo a eliminar.
     */
    public void deleteNodo(Nodo pValue){
        if (pValue == first())
        {
            this.first = this.first.getNext();
        }
        else
        {
            Nodo temp = first();
            while(temp.getNext()!=pValue)
            {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }
     /**
     * Imprime los elementos de la lista.
     */
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
    /**
     * Obtiene el tamaño de la lista.
     * @return El tamaño de la lista.
     */
    public int getSize(){
        return this.size;
    }
    /**
     * Elimina todas las ocurrencias de un elemento en la lista.
     * @param x El elemento a eliminar.
     */
    public Nodo deleteIntN(T x){
        int i = 0;
        while(i<this.size){
        if (x == this.accessElement(i))
            {
            Nodo node = this.accessElementNodo(i);
            this.deleteIndex(i);
            i--;
            return node;
            }
        i++;
        }
        return null;
    }
    public boolean findElement(T element){
        for(int i = 0; i<this.size; i++){
           if(this.accessElement(i)==element){
               return true;
           } 
        }
        return false;
    }
    public Lista<T> subList(int start, int end){
        if((start < end) && (end<this.size) && (start>-1)){
        Lista<T> sublist = new Lista<T>();
        Nodo<T> pAux = new Nodo<>(null);
        for(int i=start; i<=end; i++){
                T x = this.accessElement(i);
                sublist.addAtTheEndT(x);
        }
        return sublist;               
        }
    return null;}
    public void addAll(Lista<T> listR){
        for(int i= 0; i<listR.size; i++){
            this.addAtTheEndT(listR.accessElement(i));
        }
    }
    public void swapElements(int x, int y){
    Object temp = this.accessElementNodo(x);
    this.accessElementNodo(x).setElement(this.accessElement(y));
    this.accessElementNodo(y).setElement(temp);
}
}
