package com.bai.test5;

import java.awt.*;

public class MySnow {
	public static void main(String args[]){
		Frame w = new Frame() ;
		w.setSize(1024 , 768) ;
		w.setBackground(Color.BLACK) ;
		
		MyPanel mp = new MyPanel() ;
		w.add(mp) ;
		
		Thread t = new Thread(mp) ;
		t.start() ;
		
		w.show() ;
	}
}

class MyPanel extends Panel implements Runnable{
	int x[] = new int[300] ;
	int y[] = new int[300] ;

	//构造方法	
	public MyPanel(){
		for(int i = 0 ; i < 300 ; i ++){
			x[i] = (int)(Math.random()*1024) ;
			y[i] = (int)(Math.random()*768) ;
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE) ;
		for (int i = 0; i < 300; i++) {
			g.drawString("*", x[i] , y[i]) ;
		}
	}
	public void run() {
		while(true){
			try{
				for (int i = 0; i < 300; i++) {
					y[i] ++ ;
					if(y[i]>768){
						y[i] = 0 ;
					}
				}
				Thread.sleep(30) ;
			}catch(Exception e){}
			repaint() ;
		}
	}
}
