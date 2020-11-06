package com.company;

public abstract class Figure {

    abstract double s();
    abstract double p();

    @Override
    public String toString() {
        return "[Figure: " + this.getClass() +
                "\n\tS = " + this.s() +
                "\n\tP = " + this.p() + " ]";
    }
}
