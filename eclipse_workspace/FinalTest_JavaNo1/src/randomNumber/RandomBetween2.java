package randomNumber;

import java.util.Scanner;
import java.util.Random;

class RandomBetween2 {
    public static void main(String[] args) {

		//Ű �Է��� ���� �� �ֵ��� �ϴ� scanner�� ����� ������
		Scanner s = new Scanner(System.in);
		//����ڷκ��� ������ ���� A�� Z�� �Է¹޴´�. 
		System.out.print("�Է� 1 : ");
		//���� ��ū(A)�� int Ÿ������ �����ϴ� s.nextInt(); �޼ҵ�
		int A = s.nextInt();
		System.out.print("�Է� 2 : ");
		//���� ��ū(Z)�� int Ÿ������ �����ϴ� s.nextInt(); �޼ҵ�
		int Z = s.nextInt();

        int min, max; 

		//Z�� A���� Ŭ ���
        if(A > Z) {
            min = Z;
            max = A;
        }        
		//A�� Z���� Ŭ ���
        else {
            min = A;
            max = Z;
        }

        //random �޼��� ����
        Random r = new Random();
        int randomBetween;
   
        for(int i = 0; i < 10; i++) {
           randomBetween = min;
           randomBetween += r.nextInt(max - min + 1);
           System.out.println(randomBetween);
        }
    }
}
