package one;

import java.util.Scanner;
/*
 дһ���������¶�ת���������¶ȵĳ���ת���Ĺ�ʽ�ǣ�

    ��F = (9/5)*��C + 32

����C��ʾ�����¶ȣ�F��ʾ�����¶ȡ�

�����������һ����������ʾ�����¶ȡ������Ӧ�������¶ȣ�Ҳ��һ��������

��ʾ��Ϊ�˰Ѽ������ĸ�����ת������������Ҫʹ������ı��ʽ��

    (int)x;

����x��Ҫת�����Ǹ���������
 */
public class �����¶�ת���϶� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int x=(int)((a-32)*5/9);
		System.out.println(x);
	}

}
