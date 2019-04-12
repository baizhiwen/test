package com.bai.test4;

import java.awt.*;

public class MyBall {
	public static void main(String args[]){
		Frame w = new Frame() ;
		w.setSize(300 , 400) ;
		
		MyPanel mp = new MyPanel() ;
		w.add(mp) ;

		Thread t = new Thread(mp) ;
		t.start() ;
		
		w.show() ;
	}
}

class MyPanel extends Panel implements Runnable{
	int x = 30;
	int y = 30;
	int att = 0;// 0就是右下，1就是左下，2就是左上，3就是右上
	
	public void paint(Graphics g){
		g.fillOval(x, y, 20, 20) ;
	}
	public void run() {
		System.out.println("aaa ");
		while(true){
			// 定义飞行姿态
			if (att == 0) {
				x++;
				y++;
			}
			if (att == 1) {
				x--;
				y++;
			}
			if (att == 2) {
				x--;
				y--;
			}
			if (att == 3) {
				x++;
				y--;
			}
			
			
			// 改变飞行姿态
			if (x > 263) {
				if (att == 0) {
					att = 1;
				} else {
					att = 2;
				}
			}
			if (y > 341) {
				if (att == 1) {
					att = 2;
				} else {
					att = 3;
				}
			}
			if (x < 0) {
				if (att == 2) {
					att = 3;
				} else {
					att = 0;
				}
			}
			if (y < 0) {
				if (att == 3) {
					att = 0;
				} else {
					att = 1;
				}
			}
			
			try{
				Thread.sleep(30) ;
			}catch(Exception e){}
			repaint() ;
		}
	}
}

