import java.util.Scanner;

public class Code3_10 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int score;
        System.out.println("점수를 입력해주세요 : ");
        score = s.nextInt();

        if(score>=70)
        {
            System.out.println("합격입니다.");
        }
        else
        {
            System.out.println("불합격입니다.");
        }
        s.close();



    }
}
