package com.imooc.test;

//�쳣��
public class TryDemoFive {

	public static void main(String[] args) {
		try {
			testThree();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void testOne() throws HotelAgeException {
		throw new HotelAgeException();
	}
	
	public static void testTwo() throws Exception {
		try {
			testOne();
		}catch(Exception e){
			throw new Exception("�����²������쳣1",e);
		}
	}
	
	public static void testThree() throws Exception {
		try {
			testTwo();
		}catch(Exception e){
			throw new Exception("�����²������쳣2",e);
		}
		
	}

}
