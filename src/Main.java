import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sorgu sayısı");
        int input=scan.nextInt();

        for (int i=0; i<input; i++){
            System.out.print("Enter a:");
            int a= scan.nextInt();
            System.out.print("Enter n:");
            int b= scan.nextInt();
            System.out.print("Enter n:");
            int n = scan.nextInt();

            for (int j=0; j<n;j++){
                a+=b * (int) Math.pow(2,j);
                System.out.print(a+"");

            }
            System.out.println();
        }


    }
}
