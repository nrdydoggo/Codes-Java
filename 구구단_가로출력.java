package build02;
import java.util.Scanner;
public class ������_�������
{
	public static void main(String[] args) 
	{
	 //���� #1 ���� 2-9�� ���
	 // 2 x 1 ==> 9 x 1 ���� ���η� ���(�ܼ��� x, ���ΰ� �ȴ�.)
	 // �ܼ��� 1�� ����, 9�ܱ��� ������ �����ϰ��� \n���� �Ʒ��� ����
	 // ���ϴ� ���� ��ĭ ���������� ������Ŵ
		for(int y = 1; y < 10; y++)
		{
			for(int x = 2; x < 10; x++)	
				System.out.printf("%2d x %d = %2d  ", x, y, x * y);
			System.out.printf("\n");
		}
		
		
		
	}
}  

