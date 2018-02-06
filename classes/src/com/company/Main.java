package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
//      this porsche.model is only accessible because model in Car class is public
        porsche.model = "Carrera";

    }
}
