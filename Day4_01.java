package build02;

public class Day4_01
{
	public static void main(String[] args)
	{
		int CTcode = 1; 
		String CTstr;
		//1 ���� ȯ���մϴ� else �� �� ����, ȯ���մϴ�
		if (CTcode == 1)
			CTstr = "����, ȯ���մϴ�.";
		else
			CTstr = "�� �� ����, ȯ���մϴ�";
		System.out.println(CTstr);
		if(CTcode == 1)
			CTstr = ((CTcode == 1) ? 
					"����, ȯ���մϴ�.":"�� �� ����, ȯ���մϴ�");
		System.out.println(CTstr);
	}
}
