import java.util.Scanner;

public class code02_10 {
    public static void main(String[]args){
        Scanner s  = new Scanner(System.in);

        int a, b, result;

        System.out.println("첫번째 숫자를 입력해주세요");

        a = s.nextInt();

                System.out.println("두번째 숫자를 입력해주세요 ");
         b = s.nextInt();

        result = a + b;
        System.out.println(a + " + " + b + " = "  + result);

        result = a  - b;
        System.out.println(a + " - " + b + " = " + result);

        result = a * b;
        System.out.println(a + " * " + b + " = " + result);

        result = a / b;
        System.out.println(a + " / " + b + " = " + result);

        result = a % b;
        System.out.println(a + " %% " + b + " = " + result);

        s.close();
    }
}
