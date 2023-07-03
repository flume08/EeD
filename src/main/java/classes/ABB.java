/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class ABB<T> {
    
    private NodoTree root = null;
    public void insert(T key) {
        root = insertHelper(root, key);
    }
    
    private NodoTree insertHelper(NodoTree node, T key) {
        if (node == null) {
            node = new NodoTree(key);
            return node;
        }
        
        if ((int)key < (int)node.getElement()) {
            node.setLeftSon(insertHelper(node.getLeftSon(), key));
        } else if ((int)key > (int)node.getElement()) {
            node.setRightSon(insertHelper(node.getRightSon(), key));
        }
        
        return node;
    }
    
    public boolean contains(T key) {
        return containsHelper(root, key);
    }
    
    private boolean containsHelper(NodoTree node, T key) {
        if (node == null) {
            return false;
        }
        
        if ((int)key == (int)node.getElement()) {
            return true;
        } else if ((int)key < (int)node.getElement()) {
            return containsHelper(node.getLeftSon(), key);
        } else {
            return containsHelper(node.getRightSon(), key);
        }
    }
    
    public void printInOrder() {
        printInOrderHelper(root);
    }
    
    private void printInOrderHelper(NodoTree node) {
        if (node != null) {
            printInOrderHelper(node.getLeftSon());
            System.out.print(node.getElement() + " ");
            printInOrderHelper(node.getRightSon());
        }
    }
    
    public void printPreOrder() {
        printPreOrderHelper(root);
    }
    
    private void printPreOrderHelper(NodoTree node) {
        if (node != null) {
            System.out.print(node.getElement() + " ");
            printPreOrderHelper(node.getLeftSon());
            printPreOrderHelper(node.getRightSon());
        }
    }
    
    public void printPostOrder() {
        printPostOrderHelper(root);
    }
    
    private void printPostOrderHelper(NodoTree node) {
        if (node != null) {
            printPostOrderHelper(node.getLeftSon());
            printPostOrderHelper(node.getRightSon());
            System.out.print(node.getElement() + " ");
        }
    }
    
    public void printLevelOrder() {
        int height = getHeight(root);
        for (int i = 1; i <= height; i++) {
            printLevelHelper(root, i);
        }
    }
    
    private void printLevelHelper(NodoTree node, int level) {
        if (node == null) {
            return;
        }
        
        if (level == 1) {
            System.out.print(node.getElement() + " ");
        } else if (level > 1) {
            printLevelHelper(node.getLeftSon(), level - 1);
            printLevelHelper(node.getRightSon(), level - 1);
        }
    }
    
    private int getHeight(NodoTree node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = getHeight(node.getLeftSon());
            int rightHeight = getHeight(node.getRightSon());
            
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}

