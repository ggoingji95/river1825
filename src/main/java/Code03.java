import java.util.Scanner;

public class Code03 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a,b;
        a =s.nextInt();
        b =s.nextInt();
        int hap = 0;
        if(a > b){
            for(int i =a; i>=b; i--){
                if(i%2!=0){
                    hap+=i;
                }
            }
        }

        if(a < b){
            for(int i = a; i<=b; i++){
                if(i%2!=0){
                    hap +=i;

                }
            }
        }

        s.close();
        System.out.println("사용자가 입력한 홀수의 값 구하기 " +hap);
    }
}
