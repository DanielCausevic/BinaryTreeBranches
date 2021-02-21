package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree map = new BinaryTree();
        map.root = new Node(90, "Sønderborg");
        map.addNode(119, "Fredericia");
        map.addNode(98, "Kolding");
        map.addNode(192, "Århus");
        map.addNode(70, "Tønder");
        map.addNode(36, "Aabenraa");
        map.print(map.root);
        System.out.println("--------------Test-------------");
        System.out.println(map.root.right.right.toString());
        System.out.println(map.root.right.left.toString());
        System.out.println(map.root.left.toString());
    }
}
