package com.company;

public class Node {
    String cityName;
    int distance;
    Node left, right;

    Node(int distance, String cityName){
        this.cityName = cityName;
        this.distance = distance;
        right = null;
        left = null;
    }

    public String getCityName() {
        return cityName;
    }


    @Override
    public String toString() {
        return cityName + " is " + distance + " km away from " + BinaryTree.root.getCityName();
    }
}
