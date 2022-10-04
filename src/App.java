import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double raio, area; 

        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        sc.close(); 

        area = Math.PI * Math.pow(raio, 2); 

        System.out.format("A área do círculo é: %.2f ", area); 

        }
}
