package build02;

import java.util.ArrayList;
public class �ٸ�Ŭ��������_����ϱ� 
{
	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();// () ������
		calc.num1 =32;
		calc.num2 =20;
		calc.addRes = calc.num1 + calc.num2;
		System.out.println(calc.addRes);
		// ��ü ==> ������ ����� �Ǵ� object
		// Ŭ���� ���� ������ ��ü ==> �ν��Ͻ�
		// new ��ɾ� �ڿ� ���� () �߰�ȣ ��� 
		ArrayList<Integer> arr = new ArrayList();
		for(int i = 0; i < 10; i++)
		{
			if(i == 3)
			arr.add(i, 44);
			else
			arr.add(i, 0);
			System.out.println(arr);
		
		}
	}
		
}
