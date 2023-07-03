/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
class AVLNode {
    int key;
    int height;
    AVLNode left;
    AVLNode right;

    public AVLNode(int key) {
        this.key = key;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

class AVLTree {
    AVLNode root;

    public AVLTree() {
        root = null;
    }

    private int height(AVLNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int getBalance(AVLNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        // Realiza la rotación
        x.right = y;
        y.left = T2;

        // Actualiza las alturas de los nodos
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        // Realiza la rotación
        y.left = x;
        x.right = T2;

        // Actualiza las alturas de los nodos
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private AVLNode insertNode(AVLNode node, int key) {
        // Realiza una inserción normal de un árbol binario de búsqueda
        if (node == null) {
            return new AVLNode(key);
        }
        if (key < node.key) {
            node.left = insertNode(node.left, key);
        } else if (key > node.key) {
            node.right = insertNode(node.right, key);
        } else {
            // La clave ya existe, no se permite duplicados
            return node;
        }

        // Actualiza la altura del nodo actual
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Calcula el factor de equilibrio del nodo actual
        int balance = getBalance(node);

        // Realiza las rotaciones necesarias según el factor de equilibrio
        if (balance > 1 && key < node.left.key) {
            // Caso izquierda-izquierda: se realiza una rotación a la derecha
            return rotateRight(node);
        }
        if (balance < -1 && key > node.right.key) {
            // Caso derecha-derecha: se realiza una rotación a la izquierda
            return rotateLeft(node);
        }
        if (balance > 1 && key > node.left.key) {
            // Caso izquierda-derecha: se realiza una rotación a la izquierda y luego a la derecha
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && key < node.right.key) {
            // Caso derecha-izquierda: se realiza una rotación a la derecha y luego a la izquierda
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void print() {
        printTree(root);
    }
    private void printTree(AVLNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.key + " ");
            printTree(node.right);
        }
    }
}
