import java.util.Scanner;

class list01_atv03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Double numero1;

        Double numero2;

        System.out.print("Digite um número:");

        numero1 = sc.nextDouble();

        System.out.print("Digite outro número:");

        numero2 = sc.nextDouble();

        sc.close();

        System.out.format("A soma desses dois números é: " + Math.round(numero1 + numero2));
    }
}