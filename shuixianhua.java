package java_1;

import java.util.Scanner;

public class shuixianhua {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入水仙花数的位数:");
		
		int lastnum = scan.nextInt();
		for(int num=(int)Math.pow(10, lastnum-1);num<Math.pow(10,lastnum);num++) {
			int sum=0;
			int data=num;
			while(data!=0) {
				int last=data%10;
				sum=(int)(sum+Math.pow(last, lastnum));
				data=data/10;
			}
			if(sum==num) {
				System.out.println(num);
			}
		}

	}

}
