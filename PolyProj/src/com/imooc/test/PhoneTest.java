package com.imooc.test;
import com.imooc.tel.Camera;
import com.imooc.tel.Computer;
//接口Interface, 接口是一种规范, 实现接口里面方法的类必须得遵守接口里面的规范(访问权限,返回值,参数列表)
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
		 //通过接口来描述不同类型具有的相同特征
		 Iphoto ip=new FourthPhone();
		 ip.photo();
		 
		 ip=new Camera();
		 ip.photo();
		 
		 System.out.println("\n========================================\n");
		 //访问接口常量
		 System.out.println("INet 接口常量 : "+INet.temp);
		 
		//可以把接口看作一个标准, 所有实现这个接口的类,都必须得准寻这个标准,这句话表明sw遵循INet里面定义的标准
		 INet sw=new SmartWatch();
		 System.out.println("INet 接口常量 : "+sw.temp);
		 System.out.println(sw);//net
		 sw.connection();
		 
		 //访问接口静态方法
		 INet.stop();
		 
		 System.out.println("\n========================================\n");
		 //当父类/子类中有和接口重名的默认方法时, 父类/子类的优先级比接口要高
		 phone.connection();
		 

	}

}


