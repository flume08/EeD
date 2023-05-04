/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author carre
 */

public class ListArray {
    int first, empty, last;
    int max = 20;
    NodoArray[] arr = new NodoArray[max];
    public ListArray(){
        this.max = 20;
        this.first = 0;
        this.last = 0;
        this.empty = 1;
        this.initialize(); 
    }
    final void initialize(){
       for(int i=0;i<max;i++){
           NodoArray node =  new NodoArray(0);
           arr[i] = node;
        }
        int i = 0;
        while(i<this.max-1){
            this.arr[i].setNext(i+1);
            this.arr[i].setLast(i-1);
            i++;
        }
        this.arr[i].setNext(0);
        this.arr[i].setLast(i-1);
    }
    public boolean isEmpty(){
        return first == 0;
    }
    public int first(){
        return first;
    }
    public int last(){
        return last;
    }
    public int next(int index){
        return (this.arr[index]).getNext();
    }
    public int read(int index){
        if(index<=max){
            return this.arr[index].getElement();    
        }
        return 0;
    }
    public boolean is_valid(){
        return !(this.empty == 0);
    }
    public void insert(int x){
        int p, aux, pLst;
        p = this.empty;
        if(this.is_valid()){
            this.arr[p].setElement(x);
            this.empty = this.arr[p].getNext(); 
            if(this.isEmpty()){
                this.first = p;
                this.last = p;
                this.arr[p].setNext(0);
                this.arr[p].setLast(0);
                }
            else{
                if(this.arr[p].getElement()<this.arr[this.first].getElement()){
                    this.arr[p].setNext(first());
                    this.arr[p].setLast(0);
                    this.first = p;
                    }

                else{
                    if(this.arr[p].getElement()>this.arr[last].getElement()){
                     this.arr[last].setNext(p);
                     this.arr[p].setNext(0);
                     this.arr[p].setLast(last);
                     last = p;
                    }
                    else{
                        aux = first();
                        pLst = 0;
                        while(this.arr[aux].getElement() < this.arr[p].getElement()){
                            pLst=aux;
                            aux = next(aux);
                        }
                        this.arr[pLst].setNext(p);
                        this.arr[aux].setLast(p);
                        this.arr[p].setNext(aux);
                        this.arr[p].setLast(pLst);
                    }

            }
        }
        }else{
            System.out.println("Memomry full");
            }
    }
    
    public void delete(int pValue){
        int pLst;
        boolean finded = false;
        if(pValueIsValid(pValue)){
            if(pValue==first){
                pLst = first;
                first = arr[first].getNext();
                if(first ==0){
                    last = 0;
                }
            }else{
                pLst = 1;
                while(!(finded)){
                    if(arr[pLst].getNext()==pValue){
                        finded = true;
                    }else{
                        pLst++;
                    }
                }
                arr[pLst].setNext(arr[pValue].getNext());
                if(pValue == last){
                    last = pLst;
                }
            }
            }
    }

    public boolean pValueIsValid(int pValue){
        return pValue <max;
    }
}    