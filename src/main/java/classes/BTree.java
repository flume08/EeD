/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
class BTreeNode {
    public Lista<Integer> keys;
    public Lista<BTreeNode> children;
    public boolean isLeaf;

    public BTreeNode() {
        this.keys = new Lista<>();
        this.children = new Lista<>();
        this.isLeaf = true;
    }
}

class BTree {
    private BTreeNode root;
    private int degree;

    public BTree(int degree) {
        this.root = new BTreeNode();
        this.degree = degree;
    }

    public void insert(int key) {
        if (root.keys.getSize() == (2 * degree - 1)) {
            BTreeNode newRoot = new BTreeNode();
            newRoot.children.addAtTheEndT(root);
            splitChild(newRoot, 0, root);
            root = newRoot;
        }
        insertNonFull(root, key);
    }

    private void insertNonFull(BTreeNode node, int key) {
        int i = node.keys.getSize() - 1;
        if (node.isLeaf) {
            while (i >= 0 && key < node.keys.accessElement(i)) {
                i--;
            }
            node.keys.insertT(i+1,key);
        } else {
            while (i >= 0 && key < node.keys.accessElement(i)) {
                i--;
            }
            i++;
            if (node.children.accessElement(i).keys.getSize() == (2 * degree - 1)) {
                splitChild(node, i, node.children.accessElement(i));
                if (key > node.keys.accessElement(i)) {
                    i++;
                }
            }
            insertNonFull(node.children.accessElement(i), key);
        }
    }

    private void splitChild(BTreeNode parentNode, int index, BTreeNode childNode) {
        BTreeNode newNode = new BTreeNode();
        newNode.isLeaf = childNode.isLeaf;
        for (int i = 0; i < degree - 1; i++) {
            newNode.keys.addAtTheEnd(childNode.keys.deleteIntN(degree));
        }
        if (!childNode.isLeaf) {
            for (int i = 0; i < degree; i++) {
                newNode.children.addAtTheEnd(childNode.children.deleteIndexN(degree));
            }
        }
        parentNode.keys.insertT(index, childNode.keys.accessElement(degree - 1));
        parentNode.children.insertT(index + 1, newNode);
    }

    public void print() {
        printNode(root);
    }

    private void printNode(BTreeNode node) {
        for (int i = 0; i < node.keys.getSize(); i++) {
            System.out.print(node.keys.accessElement(i) + " ");
        }
        if (!node.isLeaf) {
            for (int i = 0; i < node.children.getSize(); i++) {
                System.out.println();
                printNode(node.children.accessElement(i));
            }
        }
    }
}
