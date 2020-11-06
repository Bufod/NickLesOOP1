package com.company;

public class Circle extends Figure {
    private int r = 1;

    Circle(){}

    Circle(int r){
        this.r = r;
    }

    double s(){
        return Math.PI*Math.pow(this.r, 2);
    }

    double p(){
        return 2*Math.PI*this.r;
    }


}
