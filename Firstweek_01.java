package build02;
public class Firstweek_01 
{
	public static void main(String[] args)
	{
		System.out.printf("%d",test(4, 5));
		
		double v1 =2.5;
		float v2 = 1.8f;
		long v3 = 2L;
		String v4 = "3.9";
		char ch = 'a';
		char b;
		b = (char) ((int)ch + 1);
		// ������ ���� = (������ �� ��ȯ��ų �ڷ���) (����);
		System.out.printf("%c\n", b);
		double n1 = 3.5, n2 = 2.7;
		int result =  (int)(v1 + v2) + (int)v3 + (int)Double.parseDouble(v4);
		System.out.printf("%d", result);
		//String�� ������ ����ȯ ��ų �� (int)Double.parseDouble(String �ڷ���); ���·� ����Ѵ�.
		

		
	}
	public static int test(int a, int b)
	{ 	
		return a * b;
		//void�� �ƴ� '���� �ִ� �Լ�'�� �ݵ�� return����
		//��ȣ���� ������ return������� �Ѵ�.
	}
}
