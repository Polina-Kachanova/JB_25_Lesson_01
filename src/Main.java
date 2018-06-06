public class Main {

    public static void main (String[] args){

        printHelloWorld();
        printMyInfo();
        printMarkes();
        calculateTriangle();
        calculateSum();
    }

    private static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println();
    }

    private static void printMyInfo(){
        String name = "Polina";
        String surname = "Kachanova";
        String address = "Minsk, Russyanova 27/2 str., apt #191";
        String telephone = "+375445808037";

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Address: " + address);
        System.out.println("Telephone: " + telephone);
        System.out.println();
    }

    private static void printMarkes(){
        System.out.println("Пройдет много лет, и полковник Аурелиано Буэндиа, стоя у стены в ожидании расстрела,");
        System.out.println("вспомнит тот далекий вечер, когда отец взял его с собой посмотреть на лед. Макондо было");
        System.out.println("тогда небольшим селением с двумя десятками хижин, выстроенных из глины и бамбука на");
        System.out.println("берегу реки, которая мчала свои прозрачные воды …");
        System.out.println();
    }

    private static void calculateTriangle(){
        double a, b;
        double c;
        double perimeter;
        double square;
        a = 10;
        b = 20;

        c = Math.sqrt(a * a + b * b);
        perimeter = a + b + c;
        square = 0.5 * a * b;
        System.out.println("Perimeter = " + perimeter + "; Square = " + square);
        System.out.println();
    }

    private static void calculateSum(){
        double a,b,c,d, sum;
        a = 10;
        b = 22.5;
        c = -0.5;
        d = 0;
        sum = a + b + c + d;
        System.out.println("Sum of " + a + ", " + b + ", " + c + " and " + d + " = " + sum);
    }
}
