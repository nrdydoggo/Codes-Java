package build02;

public class Try_catch 
{
	public static void main(String[] args) 
	{
		// Try Catch ����ó�� �ڵ�
		try 
		{ // ������ �߻��� �� �ִ� �ڵ� ����
			Thread.sleep(2000);
		}catch (InterruptedException e)
		{ // ������ ���� 
			e.printStackTrace(); // �߻��� ���� ���
		}
	}
}
