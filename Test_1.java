package java_1;

import java.util.Scanner;

public class Test_1 {
		@SuppressWarnings("resource")
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);

			final int COINS_100 = 100;   //100����(1��Ԫ)
			final int COINS_50 = 50;     //50����
			final int COINS_20 = 20;     //20����
			final int COINS_10 = 10;     //10����
			final int COINS_5 = 5;       //5����
			final int COINS_2 = 2;       //2����
			final int COINS_1 = 1;       //1����
			int numberOfCoins;         //��������ֽ��
			int leftoverCoins;         //ʣ������ֽ��
			int numberOf100;        //100����(1��Ԫ)����Ŀ
			int numberOf50;         //50���ֵ���Ŀ
			int numberOf20;         //20���ֵ���Ŀ
			int numberOf10;         //10���ֵ���Ŀ
			int numberOf5;          //5���ֵ���Ŀ
			int numberOf2;          //2���ֵ���Ŀ
			int numberOf1;          //1���ֵ���Ŀ

			
			System.out.println("������������:");
			numberOfCoins = scan.nextInt();
			
			numberOf100 = numberOfCoins / COINS_100;
			leftoverCoins = numberOfCoins % COINS_100;
			numberOf50 = leftoverCoins / COINS_50;
			leftoverCoins = leftoverCoins % COINS_50;
			numberOf20 = leftoverCoins / COINS_20;
			leftoverCoins = leftoverCoins % COINS_20;
			numberOf10 = leftoverCoins / COINS_10;
			leftoverCoins = leftoverCoins % COINS_10;
			numberOf5 = leftoverCoins / COINS_5;
			leftoverCoins = leftoverCoins % COINS_5;
			numberOf2 = leftoverCoins / COINS_2;
			leftoverCoins = leftoverCoins % COINS_2;
			numberOf1 = leftoverCoins / COINS_1;
			leftoverCoins = leftoverCoins % COINS_1;

			
			System.out.println("���Ի�" + numberOf100 + "��1��Ԫ");
			System.out.println(numberOf50 + "��50����");
			System.out.println(numberOf20 + "��20����");
			System.out.println(numberOf10 + "��10����");
			System.out.println(numberOf5 + "��5����");
			System.out.println(numberOf2 + "��2����");
			System.out.println(numberOf1 + "��1����");
		
	}

}
