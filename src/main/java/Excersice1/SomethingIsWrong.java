package Excersice1;

import Excersice1.Rectangle;

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(); //Corregimos la forma en cómo estaba inicializado el rectangulo
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}