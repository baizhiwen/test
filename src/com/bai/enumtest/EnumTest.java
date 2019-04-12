package com.bai.enumtest;

public class EnumTest {

	// 1. 定义枚举类型
    public   enum Light {
       // 利用构造函数传参
       RED (1), GREEN (3), YELLOW (2);
       // 定义私有变量
       private   int   nCode ;
       // 构造函数，枚举类型只能为私有
       private Light( int _nCode) {
           this . nCode = _nCode;
      }
       @Override
       public String toString() {
           return String.valueOf ( this . nCode );
      }
   } 
	
	public static void main(String[] args) {
		// 1. 遍历枚举类型
        System. out .println( " 演示枚举类型的遍历 ......" );
        testTraversalEnum (); 
//		System.out.println(API_CARD_PAY_TYPE.CASH.getName().toString());
	}
	
	/**
	 *  支付方式 
	 */
	public static enum API_CARD_PAY_TYPE{
		CASH("现金"),
		POS("POS机"),
		WEIXIN("微信"),
		TOP_UP("充值"),
		ALIPAY("支付宝"),
		YIBAO("易宝"),
		API_CARD("伴侣"),
		CITY_PARK_CARD("城泊卡");
		
		private String name;
		private API_CARD_PAY_TYPE(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
	}
	
	/**
     *   演示枚举类型的遍历
     */
    private   static   void testTraversalEnum() {
      Light[] allLight = Light.values ();
       for (Light aLight : allLight) {
          System. out .println( " 当前灯 name ： " + aLight.name());
          System. out .println( " 当前灯 ordinal ： " + aLight.ordinal());
          System. out .println( " 当前灯： " + aLight);
      }
   } 
}
