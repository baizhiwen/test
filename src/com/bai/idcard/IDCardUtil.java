package com.bai.idcard;

import java.util.*;
import java.lang.*; 

public class IDCardUtil{
	public static void main(String args[]){
//		System.out.print("请输入正确的身份证号：");
//		Scanner sc = new Scanner(System.in);
		String regex = "^\\d{17}[xX0-9]{1}$";
//		String s = sc.next();
		String s = "37292519901111113X";
		IDCardUtil ID = new IDCardUtil();
		if(s.matches(regex))
		{
			System.out.println("输入合法！");
		}
		else
		{
			System.out.println("输入错误！");
			System.exit(0);	
		}
		ID.SearchP(s);
		ID.SearchO(s);
	}

	public static List<String> SearchO(String s)
	{
		List<String> result = new ArrayList<String>();
  		Calendar cal = Calendar.getInstance();
  		int year=cal.get(Calendar.YEAR); 
		int t,y,z,w,k;
		String g = s.substring(6,10);
		result.add(g);
		t = Integer.parseInt(g);
		String b = s.substring(10,12);
		result.add(b);
		y = Integer.parseInt(b);
		String c = s.substring(12,14);
		result.add(c);
		z = Integer.parseInt(c);
		String d = s.substring(16,17);
		w = Integer.parseInt(d);
		k = year-t;
		
		if(w%2!=0)
		{
			System.out.println("性别：男");
			result.add(1+"");
		}
		else
		{
			System.out.println("性别：女");
			result.add(2+"");
		}
		System.out.println("年龄："+k);
		System.out.println("出生年份为："+t+"年");
		System.out.println("出生日期为："+y+"月"+z+"日");
		
		return result;
		
	}
	
	public static void SearchP(String s)
	{
		int x;
		String a = s.substring(0,2);
		x = Integer.parseInt(a);
		switch(x)
		{
			case 11:
				System.out.println("北京");
				break;
			case 12:
				System.out.println("天津");
				break;
			case 13:
				System.out.println("河北");
				break;
			case 14:
				System.out.println("山西");
				break;
			case 15:
				System.out.println("内蒙古");
				break;
			case 21:
				System.out.println("辽宁");
				break;
			case 22:
				System.out.println("吉林");
				break;
			case 23:
				System.out.println("黑龙江");
				break;
			case 31:
				System.out.println("上海");
				break;
			case 32:
				System.out.println("江苏");
				break;
			case 33:
				System.out.println("浙江");
				break;
			case 34:
				System.out.println("安徽");
				break;
			case 35:
				System.out.println("福建");
				break;
			case 36:
				System.out.println("江西");
				break;
			case 37:
				System.out.println("山东");
				break;
			case 41:
				System.out.println("河南");
				break;
			case 42:
				System.out.println("湖北");
				break;
			case 43:
				System.out.println("湖南");
				break;
			case 44:	
				System.out.println("广东");
				break;
			case 45:
				System.out.println("广西");
				break;
			case 46:
				System.out.println("海南");
				break;
			case 51:
				System.out.println("四川");
				break;
			case 50:
				System.out.println("重庆");
				break;
			case 52:
				System.out.println("贵州");
				break;
			case 53:
				System.out.println("云南");
				break;
			case 54:
				System.out.println("西藏");
				break;
			case 61:
				System.out.println("陕西");
				break;
			case 62:
				System.out.println("甘肃");
				break;
			case 63:
				System.out.println("青海");
				break;
			case 64:
				System.out.println("宁夏");
				break;
			case 65:
				System.out.println("新疆");
				break;
			default :
				System.out.println("未找到所属地区，请确认身份证号码！");
				break;
		}		 
	}
}