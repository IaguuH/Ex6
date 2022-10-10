import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double raio, area, PI;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o valor do raio - ");

        raio = teclado.nextDouble();
        PI = 3.1416;
        area = PI * (raio * raio);

        System.out.print("A área do círculo é = " + area);
        
    }
}
