        /*
        rectangle - classe
        width - double
        height -double atributos

        Area() - double
        Perimeter() -double
        Diagonal() -double métodos
         */

public class Rectangle {
    //atributos
    double width;
    double height;

    //metodo 1: area
    public double Area(){
        return width * height;
    }

    //metodo 2 : perimetro
    public double Perimeter(){
        return ((width * 2) + (height * 2));
    }

    //metodo 3: diagonal
    //d2 = b2 + h2
    public double Diagonal() {
        return (Math.sqrt((width * width) + (height * height)));
    }

}
