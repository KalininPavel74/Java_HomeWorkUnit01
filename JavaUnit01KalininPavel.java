import java.util.Scanner;

public class JavaUnit01KalininPavel {
    public static void main(String[] args) throws Exception {

        String taskText = "Написать программу вычисления n-ого треугольного числа.\n";
        System.out.println(taskText);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int Tn = (int)(0.5*n*(n+1));
        System.out.println("Треугольное число Т"+n+" = "+Tn);
    }
}