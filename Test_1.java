package java_1;

import java.util.Scanner;

public class Test_1 {
		@SuppressWarnings("resource")
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);

			final int COINS_100 = 100;   //100美分(1美元)
			final int COINS_50 = 50;     //50美分
			final int COINS_20 = 20;     //20美分
			final int COINS_10 = 10;     //10美分
			final int COINS_5 = 5;       //5美分
			final int COINS_2 = 2;       //2美分
			final int COINS_1 = 1;       //1美分
			int numberOfCoins;         //输入的美分金额
			int leftoverCoins;         //剩余的美分金额
			int numberOf100;        //100美分(1美元)的数目
			int numberOf50;         //50美分的数目
			int numberOf20;         //20美分的数目
			int numberOf10;         //10美分的数目
			int numberOf5;          //5美分的数目
			int numberOf2;          //2美分的数目
			int numberOf1;          //1美分的数目

			
			System.out.println("请输入美分数:");
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

			
			System.out.println("可以换" + numberOf100 + "张1美元");
			System.out.println(numberOf50 + "张50美分");
			System.out.println(numberOf20 + "张20美分");
			System.out.println(numberOf10 + "张10美分");
			System.out.println(numberOf5 + "张5美分");
			System.out.println(numberOf2 + "张2美分");
			System.out.println(numberOf1 + "张1美分");
		
	}

}
