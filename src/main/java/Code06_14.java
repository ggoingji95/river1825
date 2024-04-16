import java.util.Scanner;

public class Code06_14 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a,b;
        int hap = 0;

        while(true){
            System.out.println("숫자 1 :");
            a = s.nextInt();;
            if(a == 0){
                break;
            }
            System.out.println("숫자 2 :");
            b = s.nextInt();

            hap = a + b;
            System.out.println(a + "+"+ b + "=" + hap);


        }
        s.close();
        System.out.println("힝... 0의 값이 나왔어요 ");
        System.out.println("프로그램을 강제 종료합니다.");
    }
}
