import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int cal;
        int quotient;
        int remainder;
        System.out.println("Enter 2 number:-");
        Scanner r= new Scanner(System.in);
        System.out.println("Enter first number:-");
        n1 = r.nextInt();
        System.out.println("Enter Second number:-");
        n2 = r.nextInt();
        System.out.println("Select Operation:-");
        System.out.println("1-Add");
        System.out.println("2-Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4-Divide");
        System.out.println("Enter Operation Number ");
        Scanner s=new Scanner(System.in);
        n3 = r.nextInt();

        if(n3==1){
            cal=n1+n2;
            System.out.println(" Sum of two numbers:-"+cal);
          }else if(n3==2){
            cal=n1-n2;
            System.out.println(" Difference of two numbers:-"+cal);
         }else if (n3==3) {
            cal=n1*n2;
            System.out.println(" Multiplication of two numbers:-"+cal);
            }else if (n3==4) {
                quotient=n1/n2;
                remainder=n1%n2;
                System.out.println(" quotient of two numbers:-"+quotient);
                System.out.println(" remainder of two numbers:-"+remainder);
            }

    }

}