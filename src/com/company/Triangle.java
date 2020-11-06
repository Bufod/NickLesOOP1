package com.company;

public class Triangle extends Figure{
    private int
            a = 1,
            b = 1,
            c = 1;

    Triangle(){}

    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double s(){
        double tmp = p()/2;
        return Math.sqrt(tmp*(tmp-this.a)*(tmp-this.b)*(tmp-this.c));
    }

    public double p(){
        return this.a + this.b + this.c;
    }
}
