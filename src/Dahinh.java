import java.util.Scanner;

public class Dahinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle top-left");
        System.out.println("3. Print the square triangle top-right");
        System.out.println("4. Print the square triangle botton-left");
        System.out.println("5. Print the square triangle botton-right");
        System.out.println("6. Exit");
        System.out.println("Enter choice");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                for (int i = 0; i <3; i++) {
                    for (int j = 0; j <6; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 0; i < 6; i++){
                    System.out.println("");
                    for (int j = 0; j <i; j++) {
                        System.out.print("*");
                    }
                }
                break;



            }

        }

}

