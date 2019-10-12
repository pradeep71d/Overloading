package com.example.overloading;

public class Adder {
    public int sum(int x,int y){
        return x+y;// in overriding we have same class different parameters but same methods.
    }
    public int sum(int x,int y,int z){
        return x+y+z;
    }
    public double sum(double x,double y){
        return x+y;
    }
}
