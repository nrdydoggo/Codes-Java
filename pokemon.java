package chap06;
import java.util.Scanner;
public class pokemon
{
    public static void main(String[] args)
    {
    int input = 0;
    int raidcount = 0;
    int candy = 0, xs = 0, s = 0, M = 0, L = 0, dmax = 0;
    Scanner sc = new Scanner(System.in); 
    for(;;)
    {
    System.out.println("�����ϼ���.\n\n");
    System.out.println("1. �̻��ѻ���\n2. XS\n3. S\n4. M\n5. L\n6. ���̸ƽ�����\n\n");
    System.out.printf("���α׷������ 9�Է�, ���̵� ����� 8�Է�\n\n\n");
    input = sc.nextInt();
    switch(input)
    {
        case 1:
        System.out.println("ȹ���� ������ �Է��ϼ���\n");
        candy += sc.nextInt();
        if(candy == 0)
        	break;
        break;
        case 2:
        System.out.println("ȹ���� ������ �Է��ϼ���\n");
        xs += sc.nextInt();
        if(xs == 0)
        	break;
        break;
        case 3:
        System.out.println("ȹ���� ������ �Է��ϼ���\n");
        s+= sc.nextInt();
        if(s == 0)
        	break;
        break;
        case 4:
        System.out.println("ȹ���� ������ �Է��ϼ���\n");	
        M+= sc.nextInt();
        if(M == 0)
        	break;
        break;
        case 5:
        System.out.println("ȹ���� ������ �Է��ϼ���\n");
        L+= sc.nextInt();
        if(L == 0)
        	break;
        break;
        case 6:
        	 System.out.println("ȹ���� ������ �Է��ϼ���\n");
             dmax+= sc.nextInt();
             if(dmax == 0)
             	break;	
             break;
        case 8: 
        	raidcount++;
        	break;
        case 9:
        	sc.close();
            return;
    }
    System.out.println("\n===========================================\n");
    System.out.printf("���� ���̵� Ƚ�� ==>%d\n\n", raidcount);
    System.out.printf("�̻��ѻ��� %d��\nXS����%d��\nS����%d��\n", candy, xs, s);
    System.out.printf("M����%d��\nL����%d��\n���̸ƽ�����%d��\n", M, L,dmax);
    System.out.println("\n===========================================\n");
    }
    }

}