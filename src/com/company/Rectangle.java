package com.company;

public class Rectangle extends Figure {
    protected int
            a,
            b;

    Rectangle(){
        this.a = 1;
        this.b = 2;
    }

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double s(){
        return this.a*this.b;
    }

    @Override
    public double p(){
        return 2*(this.a + this.b);
    }


}
