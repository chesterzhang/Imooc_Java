package com.imooc.test;
import com.imooc.tel.Camera;
import com.imooc.tel.Computer;
//�ӿ�Interface, �ӿ���һ�ֹ淶, ʵ�ֽӿ����淽�������������ؽӿ�����Ĺ淶(����Ȩ��,����ֵ,�����б�)
import com.imooc.tel.FourthPhone;
import com.imooc.tel.INet;
import com.imooc.tel.Iphoto;
import com.imooc.tel.SmartWatch;

public class PhoneTest {

	public static void main(String[] args) {
		
		 FourthPhone phone =new FourthPhone();
		 phone.call();
		 phone.message();
		 phone.vedio();
		 phone.music();
		 phone.photo();
		 phone.network();
		 
		 System.out.println("\n========================================\n");
		 //ͨ���ӿ���������ͬ���;��е���ͬ����
		 Iphoto ip=new FourthPhone();
		 ip.photo();
		 
		 ip=new Camera();
		 ip.photo();
		 
		 System.out.println("\n========================================\n");
		 //���ʽӿڳ���
		 System.out.println("INet �ӿڳ��� : "+INet.temp);
		 
		//���԰ѽӿڿ���һ����׼, ����ʵ������ӿڵ���,�������׼Ѱ�����׼,��仰����sw��ѭINet���涨��ı�׼
		 INet sw=new SmartWatch();
		 System.out.println("INet �ӿڳ��� : "+sw.temp);
		 System.out.println(sw);//net
		 sw.connection();
		 
		 //���ʽӿھ�̬����
		 INet.stop();
		 
		 System.out.println("\n========================================\n");
		 //������/�������кͽӿ�������Ĭ�Ϸ���ʱ, ����/��������ȼ��Ƚӿ�Ҫ��
		 phone.connection();
		 

	}

}


