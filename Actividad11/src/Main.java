import java.util.Scanner;

public class Main {
    public static Circle myCircle = new Circle();
    public static Triangle myTriangle = new Triangle();
    public static Square mySquare = new Square();

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la calculadora de perímetro y área.");
        do{
            selectOption();
        }while(tryAgain());
    }

    public static void selectOption(){
        boolean repeat = true;
        while(repeat){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Seleccione una opción:");
                System.out.print("1 Perímetrp y área de Círculo\n" +
                        "2 Perímetro y área de Tríangulo\n" +
                        "3 Perímetro y área de Cuadrado\n" +
                        "0 Salir\n");
                int answer = sc.nextInt();
                switch(answer){
                    case 0:
                        System.out.println("Hasta luego!");
                        System.exit(0);
                        break;
                    case 1:
                        Circle();
                        repeat = false;
                        break;
                    case 2:
                        Triangle();
                        repeat = false;
                        break;
                    case 3:
                        Square();
                        repeat = false;
                        break;
                    default:
                        System.out.println("Opción inválida, vuelva a intentarlo.");
                }
            }catch(Exception e){
                System.out.println("Opción inválida, vuelva a intentarlo.");
            }
        }
    }

    public static void Circle(){
        boolean repeat = true;
        while(repeat){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el radio:");
                double radius = sc.nextDouble();
                myCircle.setRadius(radius);
                myCircle.setDiameter(radius * 2);
                System.out.println("El perímetro es: " + myCircle.getPerimeter());
                System.out.println("El área es: " + myCircle.getArea());
                repeat = false;
            }catch(Exception e){
                System.out.println("Datos incorrectos, vuelva a intentar");
            }
        }
    }

    public static void Triangle(){
        boolean repeat = true;
        while(repeat){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el tamaño del lado 1:");
                myTriangle.setSide1(sc.nextDouble());
                System.out.println("Ingrese el tamaño del lado 2:");
                myTriangle.setSide2(sc.nextDouble());
                System.out.println("Ingrese el tamaño de la base:");
                myTriangle.setBase(sc.nextDouble());
                System.out.println("Ingrese el tamaño de la altura");
                myTriangle.setHeight(sc.nextDouble());
                System.out.println("El perímetro es: " + myTriangle.getPerimeter());
                System.out.println("El área es: " + myTriangle.getArea());
                repeat = false;
            }catch(Exception e){
                System.out.println("Datos incorrectos, vuelva a intentar");
            }
        }
    }

    public static void Square(){
        boolean repeat = true;
        while(repeat){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el tamaño de los lados:");
                mySquare.setSide(sc.nextDouble());
                System.out.println("El perímetro es: " + mySquare.getPerimeter());
                System.out.println("El área es: " + mySquare.getArea());
                repeat = false;
            }catch(Exception e){
                System.out.println("Datos incorrectos, vuelva a intentar");
            }
        }
    }

    public static boolean tryAgain() throws Exception{
        boolean tryAgain = false;
        boolean repeat = true;
        try{
            while(repeat){
                Scanner sc = new Scanner(System.in);
                System.out.println("Quieres escoger otra opción? (Ss/Nn)");
                char answer = sc.next().charAt(0);
                switch(answer){
                    case 'S':
                    case 's':
                        tryAgain = true;
                        repeat = false;
                        break;
                    case 'N':
                    case 'n':
                        System.out.println("Hasta luego!");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Opción inválida, vuelva a intentarlo.");
                }
            }
        }catch (Exception e){
            System.out.println("Opción inválida, vuelva a intentarlo.");
        }
        return tryAgain;
    }
}