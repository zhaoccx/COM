package com.imooc.test;

public class ChainTest {

	/**
	 * test1():�׳����ȴ��ˡ��쳣
	 * test2():����test1(),���񡰺ȴ��ˡ��쳣�����Ұ�װ������ʱ�쳣�������׳�
	 * main�����У�����test2(),���Բ���test2()�����׳����쳣
	 */
	public static void main(String[] args) {
		ChainTest ct = new ChainTest();
		try{
			ct.test2();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void test1() throws DrunkException{
		throw new DrunkException("�ȳ��𿪾ƣ�");
	}
	
	public void test2(){
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc = 
				new RuntimeException(e);
//			newExc.initCause(e);
			throw newExc;
		}
	}
}
