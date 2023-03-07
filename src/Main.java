import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n1 :");
        int n1 = scanner.nextInt();
        System.out.print("enter n2 :");
        int n2 = scanner.nextInt();


        //// EBOB solution
        System.out.println("EBOB solution with while loop ...");
        int ebob = 1;
        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println(ebob);
        System.out.println("==================");
        System.out.println("EKOB solution with while loop ...");

        //// EKOB solution
        int ekob = 1;
        int k = 1;
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekob = k;
                break;
            }
            k++;
        }
        System.out.println(ekob);


    }


}