package mogakso;

import java.util.Scanner;

public class mogakso_week3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("팩토리얼 계산할 숫자를 입력하세요:");
        int n=scanner.nextInt();
        if (n<0){
            System.out.println("팩토리얼은 음수에 대해 정의되지 않습니다");
        }
        else{
            long pac=1;

            for(long i=n; i>0; i--){
                pac*=i;
            }
            System.out.print(n+" 팩토리얼은 "+ pac +" 입니다.");
        }

    }
}
