package Excersice1;

//import java.awt.*; esta debería ser la clase que se debería importar

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect; //No es la forma adecuada de declarar un objeto y además la clase no fue importada anteriormente
        //Rectangle myRect = new Rectangle(); Forma adecuada
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area()); //Tampoco sabemos si la clase posee el método area
    }
}
