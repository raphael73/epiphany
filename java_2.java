package java_1;

import java.util.Scanner;

public class java_2 {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		final double COSTOF_COLOR = 0.10;//ÿӢ��Ⱦɫ�ļ۸�
		final double COSTOF_FRAME = 0.15;//ÿӢ���ܵļ۸�
		final double COSTOF_FANCY = 0.25;//ÿӢ�羫�¿�ܵļ۸�
		final double COSTOF_PAPER = 0.02;//ÿƽ��Ӣ��ʹ��ֽ��ļ۸�
		final double COSTOF_GLASS = 0.07;//ÿƽ��Ӣ��ʹ�ò����ļ۸�
		final double COSTOF_CROWN = 0.35;//ÿ���߽���ʹ�ûʹ�װ�εļ۸�
		
		double Length;//��ܳ���
		double Width;//��ܿ��
		int type;//ѯ�ʿ�����ࡣ0��ʾ��ͨ�ģ�1��ʾ���µġ�
		int framecolor;//ѯ���Ƿ���ҪȾɫ��0��ʾ��Ⱦɫ��1��ʾȾɫ��
		int Crown;//��Ҫװ�λʹڵ�����
		double total;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ܳ���:");
		Length = scan.nextDouble();
		System.out.println("�����ܿ��:");
		Width = scan.nextDouble();
		System.out.println("����������(0��ʾ��ͨ���1��ʾ�������):");
		type = scan.nextInt();
		System.out.println("����װ�λʹڵ�����(0��a��4):");
		Crown = scan.nextInt();
		scan.nextLine();
		System.out.println("�Ƿ���ҪȾɫ(0��ʾ��Ⱦɫ��1��ʾȾɫ):");
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
		System.out.println("���װ���������۸�Ϊ��"+total);

	}

}

