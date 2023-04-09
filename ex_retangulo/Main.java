import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nesse programa vou ler os valores da largura e altura" +
                "de um retangulo. mostrar na tela area, perimetro e diagonal.");
        /*
        rectangle - classe
        width - double
        height -double atributos

        Area() - double
        Perimeter() -double
        Diagonal() -double métodos
         */
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();
        System.out.println("Digite a largura do retangulo");
        retangulo.width = sc.nextDouble();

        System.out.println("Digite a altura do retangulo");
        retangulo.height = sc.nextDouble();

        double area, perimetro, diagonal;
       area = retangulo.Area();
       perimetro = retangulo.Perimeter();
       diagonal = retangulo.Diagonal();
       System.out.println("Area = " + area + " Perimetro = " + perimetro + " Diagonal = " + diagonal);
        // OU
        //System.out.println("Area = " + retangulo.Area() + " Perimetro = " + retangulo.Perimeter() + " Diagonal = " + retangulo.Diagonal());
        sc.close();
    }


}