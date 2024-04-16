import java.util.Scanner;

public class code02 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a,b;
        int hap = 0;

        while(true){
            System.out.println("첫번째 숫자 값 =====> : ");
            a = s.nextInt();
            if(a==0)
                break;
            System.out.println("두번째 숫자 값 =====> : ");
            b = s.nextInt();

            hap = a + b;
            System.out.println(a + " + " + b + " = " + hap);
        }
        s.close();
        System.out.println("잘못된 값을 입력 하셨습니다 ");
    }
}
