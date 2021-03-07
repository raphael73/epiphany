package java_1;

import java.util.Scanner;

public class java_2 {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		final double COSTOF_COLOR = 0.10;//每英寸染色的价格
		final double COSTOF_FRAME = 0.15;//每英寸框架的价格
		final double COSTOF_FANCY = 0.25;//每英寸精致框架的价格
		final double COSTOF_PAPER = 0.02;//每平方英寸使用纸板的价格
		final double COSTOF_GLASS = 0.07;//每平方英寸使用玻璃的价格
		final double COSTOF_CROWN = 0.35;//每个边角用使用皇冠装饰的价格
		
		double Length;//框架长度
		double Width;//框架宽度
		int type;//询问框架种类。0表示普通的，1表示精致的。
		int framecolor;//询问是否需要染色，0表示不染色，1表示染色。
		int Crown;//需要装饰皇冠的数量
		double total;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("输入框架长度:");
		Length = scan.nextDouble();
		System.out.println("输入框架宽度:");
		Width = scan.nextDouble();
		System.out.println("输入框架种类(0表示普通相框，1表示精致相框):");
		type = scan.nextInt();
		System.out.println("输入装饰皇冠的数量(0≤a≤4):");
		Crown = scan.nextInt();
		scan.nextLine();
		System.out.println("是否需要染色(0表示不染色，1表示染色):");
		framecolor=scan.nextInt();
		if(type == 0&&framecolor==1){
			total = (Length+Width)*(COSTOF_FRAME+COSTOF_COLOR)*2+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		}
		else if(type == 0&&framecolor==0) {
			total = (Length+Width)*COSTOF_FRAME*2+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		}
		else if(type == 1&&framecolor==1) {
			total = (Length+Width)*(COSTOF_FANCY+COSTOF_COLOR)*2+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		}
		else
			total = (Length+Width)*COSTOF_FANCY*2+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		System.out.println("相框装饰总制作价格为："+total);

	}

}

