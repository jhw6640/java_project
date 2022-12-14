package randomNumber;

import java.util.Scanner;
import java.util.Random;

class RandomBetween2 {
    public static void main(String[] args) {

		//키 입력을 받을 수 있도록 하는 scanner를 사용한 생성문
		Scanner s = new Scanner(System.in);
		//사용자로부터 임의의 정수 A와 Z를 입력받는다. 
		System.out.print("입력 1 : ");
		//다음 토큰(A)을 int 타입으로 리턴하는 s.nextInt(); 메소드
		int A = s.nextInt();
		System.out.print("입력 2 : ");
		//다음 토큰(Z)을 int 타입으로 리턴하는 s.nextInt(); 메소드
		int Z = s.nextInt();

        int min, max; 

		//Z가 A보다 클 경우
        if(A > Z) {
            min = Z;
            max = A;
        }        
		//A가 Z보다 클 경우
        else {
            min = A;
            max = Z;
        }

        //random 메서드 생성
        Random r = new Random();
        int randomBetween;
   
        for(int i = 0; i < 10; i++) {
           randomBetween = min;
           randomBetween += r.nextInt(max - min + 1);
           System.out.println(randomBetween);
        }
    }
}

