package com.company;

public class BinaryTree {
    static Node root;

    public void addNode(int distance, String cityName){
        Node city = new Node(distance, cityName);
        Node focus = root;
        Node parent;
        while(true){
            parent = focus;
            if(distance < focus.distance){
                focus = focus.left;
                if(focus == null){
                    parent.left = city;
                    return;
                }
            } else{
                focus = focus.right;
                if(focus == null){
                    parent.right = city;
                    return;
                }
            }
        }
    }

    public void print(Node focus){
        if(focus != null) {
            print(focus.left);
            if(focus != root) {
                System.out.println(focus);
            }
            print(focus.right);
        }
    }


    BinaryTree(){
        root = null;
    }



}
