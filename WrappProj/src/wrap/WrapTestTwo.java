package wrap;

public class WrapTestTwo {
	
	public static void main(String[] args) {
		//������������ת�����ַ���
		int t1=2;
		String t2=Integer.toString(t1);
		
		//����
		System.out.println("int ����ת����String ���Ͷ��� t2 ="+t2);
		
		System.out.println("=================================");
		//�ַ�������ת���ɻ�����������
		//1. ��װ���parse
		//2. ��װ���valueOf, �Ƚ��ַ���ת��Ϊ��װ��, ��ͨ���Զ�����
		int t3=Integer.parseInt(t2);
		int t4=Integer.valueOf(t2);
		System.out.println("String ����ת����int ���� t3 ="+t3);
		System.out.println("String ����ת����int ���� t4 ="+t4);
		
	}

}





