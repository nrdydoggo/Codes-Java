package build02;
public class A_to_z
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(char ab = 'A'; ab <= 'z'; ab++)
		//�ݺ����� �ݵ�� 0 ==> Ư�� ���ڰ� ���� �ݺ���ų �ʿ�� ����.
		//0���� Ư�����ڱ��� �ݺ���Ű�� ����, �迭���� �ʱⰪ�� 0�̿��� �ϴ� ��쿡 ����ϸ� �ȴ�.
		//�ݺ����� Ư�� �ñ⿡ �����ų �� �ֱ⶧���� �ʱⰪ�� ���ᰪ�� ���ϴ� ������ ����ؼ� ++,--�� ���ָ� �ȴ�.
		//��Ȳ�� ���� ���ѹݺ� (;;) / (true) ��Ű��, Ư�� ������ ������ ���� ������ѵ� �ȴ�.
		{		
			if(count % 6 == 0)
				System.out.printf("\n");
				if(ab > 'z')
					return;
				if(ab == 91)
					ab = 97;
				System.out.printf("%c ", ab);
				count++;
				
		}
	
	}
   }

