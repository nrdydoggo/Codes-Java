package build02;

public class String_calc 
{
	public static void main(String[] args) 
	{
		String str1 = 2 + 3 + ""; // 2 + 3 + " " ==> 5""
		String str2 = 2 + "" + 3; // (2 + "") + 3 ==> "2" + 3 ==> "23" 
		String str3 = "10" + 2 + 3; // ("10" + 2) + 3 ==> "102" + 3 ==> "1023"
		//���� �ٿ� ����, ���ڿ� ""���ڿ��� ���ϸ� �� ���ڴ� ���ڿ��� �ǹ�����, ���ڿ��� ���ڴ� �������� �ʰ� �����ϰ� �ȴ�.
 		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
