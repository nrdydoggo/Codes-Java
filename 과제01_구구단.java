package build02;
import java.util.Scanner;


public class ����01_������ 
{
	public static void main(String[] args) 
			throws Exception 
	{
		//���� �Լ�/���� ����
		Scanner scanf = new Scanner(System.in);
		//scanf.close();//scanner�� sc�� ��� �� �ݾ���� ��.
		int num = 0; //�ܼ� �Է�
		num = scanf.nextInt();
		//System.out.println(num);
		//��¼��� ����Ҷ� => System.out.printf
		for(int i = 0; i < 8; i++)
		{
			if (num == 10)
				return;
			for(int t = 0; t < 10; t++)
			{
				if(t == 0)
					t += 1;
				System.out.printf("%d x %d = %d\n", num, t, num * t);
				
			}
			num++;
			System.out.println("\n");
		}
		scanf.close(); //sc �Լ��� ��� �� ���� �� ����ϴ� sc.close();
	}
}
