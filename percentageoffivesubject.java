import java.util.Scanner;

public class percentageoffivesubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of maths");
        double maths = sc.nextDouble() ;
        System.out.println("enter marks of physics");
        double physics= sc.nextDouble() ;
        System.out.println("enter marks of chemistry");
        double chemistry = sc.nextDouble();
        System.out.println("enter marks of english");
        double english= sc.nextDouble() ;
        System.out.println("enter marks of hindi");
        double hindi=sc.nextDouble() ;
        double sum = (maths+physics+chemistry+english+hindi)/5;
        System.out.println("percentage" +sum);

    }
}
