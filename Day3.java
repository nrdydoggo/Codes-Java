package build02;

public class Day3 
{
	public static void main (String[] args)
	{
	char unicode = 65; //ASCII 'A'
	System.out.printf("%c\n", unicode);
	char alpha = 'A'; // ASCII 65
	System.out.printf("Ascii val = %d\n\n", (int)alpha); 
	//char���� ���ڸ� �ƽ�Ű�� ����ϱ� ���� int������ ����ȯ�� ���ش�.
	
	int age = 20;
	double kg = 49.9;
	System.out.printf("����%d + ������%.1f == %d\n",age,  kg, age + (int)kg);
	System.out.printf("����%d + ������%.1f == %.1f", age, kg, (double)age + kg);
	
	}
}
