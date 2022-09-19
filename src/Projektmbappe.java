import java.util.Scanner;

public class Projektmbappe {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("b værdien er = ");
        double b = scan.nextDouble();
        System.out.println("x_0 værdien er = ");
        double x_0 = scan.nextDouble();
        System.out.println("y_0 værdien er = ");
        double y_0 = scan.nextDouble();
        System.out.println("Afstanden mellem linjen og punktet = ");
        double Afstand = Math.abs(((a * x_0) - y_0 + b)) / (Math.sqrt(1 + (a * a)));

        System.out.println(Afstand);
    }

}

