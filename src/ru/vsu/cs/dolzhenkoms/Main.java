package ru.vsu.cs.dolzhenkoms;

public class Main {

    public static void main(String[] args) throws Exception {
        SimpleBinaryTree myTree = new SimpleBinaryTree(Object::toString);
        myTree.fromBracketNotation("A(B(D(M(L,P),K),G),C)");
        myTree.printTree();
        myTree.printColouredTree();
    }
}
