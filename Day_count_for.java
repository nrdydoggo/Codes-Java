package build02;
import java.util.Scanner;
public class Day_count_for 
{
	public static void main(String[] args) 
	{
		// �Ѵ� 30��, 1��1�Ϻ��� 4/13���� ���� ��ҳ�
		int count = 0;
		
		for(int i =0 + 1; i <13; i++)
		{
			for(int t = 0 + 1; t < 31; t++)
			{
				count +=1;
				if(i == 4 && t == 13)
				{
					System.out.printf("%d�� %d��\n", i, t);
					System.out.printf("day = %d", count);
					break;
				}
			}
		}
		
		
	}
}
