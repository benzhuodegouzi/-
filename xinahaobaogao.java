package one;

import java.util.Scanner;

/*
 ��Ŀ���ݣ�
���ߵ�̨��RS���źű�������������������ɵģ�
R(Readability) �źſɱ�ȼ�������.
S(Strength)    �ź�ǿ�ȼ���С.
����Rλ�ڱ����һλ������5������1��5���ֱ�ʾ.
1---Unreadable
2---Barely readable, occasional words distinguishable
3---Readable with considerable difficulty
4---Readable with practically no difficulty
5---Perfectly readable
����ڶ�λ��S�����־Ÿ�������1��9�е�һλ���ֱ�ʾ
1---Faint signals, barely perceptible
2---Very weak signals
3---Weak signals
4---Fair signals
5---Fairly good signals
6---Good signals
7---Moderately strong signals
8---Strong signals
9---Extremely strong signals
���ڣ���ĳ���Ҫ����һ���źű�������֣�Ȼ�������Ӧ�ĺ��塣�����59���������
Extremely strong signals, perfectly readable.
�����ʽ:
һ���������źű��档������ʮλ���ֱ�ʾ�ɱ�ȣ���λ���ֱ�ʾǿ�ȡ������������Χ��[11,59]����Ч�����֣�
�����Χ������ֲ����ܳ����ڲ��������С�
�����ʽ��
һ�仰����ʾ����źű�������塣������Ŀ�е����֣��������ʾǿ�ȵ����֣�
���϶��źͿո�Ȼ���Ǳ�ʾ�ɱ�ȵ����֣����Ͼ�š�ע��ɱ�ȵľ��ӵĵ�һ����ĸ��Сд�ġ�ע������ı����Ŷ���Ӣ�ĵġ�
����������
33
���������
Weak signals, readable with considerable difficulty.
 */
public class xinahaobaogao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=a/10;
		int c=a%10;
		switch (c) {
		case 1:
			System.out.print("Faint signals, barely perceptible, ");
			break;
		case 2:
			System.out.print("Very weak signals, ");
			break;
		case 3:
			System.out.print("Weak signals, ");
			break;
		case 4:
			System.out.print("Fair signals, ");
			break;
		case 5:
			System.out.print("Fairly good signals, ");
			break;
		case 6:
			System.out.print("Good signals, ");
			break;
		case 7:
			System.out.print("Moderately strong signals, ");
			break;
		case 8:
			System.out.print("Strong signals, ");
			break;
		case 9:
			System.out.print("Extremely strong signals, ");
			break;
		default:
			break;
		}
		switch (b) {
		case 1:
			System.out.println("unreadable.");
			break;
		case 2:
			System.out.println("barely readable, occasional words distinguishable.");
			break;
		case 3:
			System.out.println("readable with considerable difficulty.");
			break;
		case 4:
			System.out.println("readable with practically no difficulty.");
			break;
		case 5:
			System.out.println("perfectly readable.");
			break;
		default:
			break;
		}
	}

}
