import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! How many stars would you like:");
        Scanner scan=new Scanner(System.in);
        int numStars=scan.nextInt();

        for(int i=0; i<numStars;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=numStars-1;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Done ");
    }

}
