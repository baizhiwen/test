package com.bai.test;

import java.awt.* ;
import javax.swing.* ;
import java.awt.event.MouseListener;
import java.util.EventListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Huatu extends JFrame
{	
	Huatu()
	{
		HtPanel p1 = new HtPanel() ;
		this.setSize( 700 , 700 ) ;
		Container cn = this.getContentPane() ;
		cn.add(p1) ;
		this.addMouseListener(p1) ;
		this.addMouseMotionListener(p1) ;
	}
	public static void main (String args[])
	{
		Huatu w = new Huatu() ;
		w.show() ;	
	} 
}

class HtPanel extends JPanel implements MouseListener, MouseMotionListener
{
	int x = 30;
	
	int y = 30 ;
	
	boolean b = true ;
	public void paint(Graphics g)
	{
		super.paint(g) ;
		this.setBackground(Color.LIGHT_GRAY) ;
	//	g.clearRect( 0 , 0 , 700 , 700 ) ;			//主面版
		
//``````````````````````````````````````````````````````````````````````````
		if (b)
		{
			g.setColor(new Color( 80 , 180 , 80 )) ;			//龟尾巴
			g.fillOval( 140+x , 285+y , 150 , 150 ) ;
			g.setColor(Color.LIGHT_GRAY) ;
			g.fillOval( 155+x , 300+y , 140 , 140) ;
			g.fillOval( 195+x , 260+y , 200 ,240 ) ;
			g.setColor(new Color( 80 , 180 , 80 )) ;
			g.fillOval( 145+x , 355+y , 40 , 40) ;	
			g.setColor(Color.LIGHT_GRAY) ;
			g.fillOval( 157+x , 367+y , 15 , 15) ;
		}
		else
		{
			g.setColor(new Color( 80 , 180 , 80)) ;			//龟尾巴
			g.fillOval(13+x , 260+y , 150 , 150) ;
			g.setColor(Color.LIGHT_GRAY) ;
			g.fillOval(3+x , 265+y , 143 , 143) ;
			g.setColor(new Color( 80 , 180 , 80)) ;
			g.fillOval(100+x,353+y,40,40) ;	
			g.setColor(Color.LIGHT_GRAY) ;
			g.fillOval(113+x , 365+y , 15 , 15) ;
		}

//``````````````````````````````````````````````````````````````````````````		
		if (b)
		{
			g.setColor(new Color(80,180,80)) ;		//龟头
			g.fillOval( 120+x , 80+y , 60 , 100 ) ;
			g.setColor(Color.WHITE) ;
			g.fillOval( 130+x ,90+y , 10 ,10 ) ;		//左眼	
			g.fillOval( 160+x ,90+y , 10 ,10 ) ;		//右眼
			g.setColor(Color.BLACK) ;
			g.fillOval( 130+x ,90+y , 8 ,8 ) ;			//左眼珠
			g.fillOval( 160+x ,90+y , 8 ,8 ) ;			//右眼珠
		}
		else
		{
			g.setColor(new Color(80,180,80)) ;		//龟头
			g.fillOval( 120+x , 80+y , 60 , 100 ) ;
			g.setColor(new Color(200,0,0)) ;		//龟嘴
			g.fillOval( 130+x , 100+y , 40 ,50 ) ;
			g.setColor(new Color(80,180,80)) ;
			g.fillOval( 130+x , 80+y , 40 ,50 ) ;
			g.setColor(Color.BLACK) ;
			g.drawLine( 143+x ,83+y , 140+x , 90+y ) ;		//鼻子
			g.drawLine( 158+x ,83+y , 160+x , 90+y ) ;
		}
//``````````````````````````````````````````````````````````````````````````	
		if (b)
		{
			g.setColor(new Color(80,180,80)) ;
			g.fillOval( 50+x ,140+y ,50 , 70 ) ;		//左爪

			g.fillOval( 200+x ,140+y ,50 , 70 ) ;		//右爪

			g.fillOval( 50+x ,280+y ,50 , 70 ) ;		//左后爪

			g.fillOval( 200+x ,280+y ,50 , 70 ) ;		//右后爪
		}
		else
		{	
			g.setColor(new Color(80,180,80)) ;		//左爪
			g.fillOval( 50+x ,140+y ,50 , 70 ) ;	
			g.setColor(new Color(250,100,150)) ;	//左指头
			g.fillOval( 55+x ,155+y ,5 , 7 ) ;
			g.fillOval( 65+x ,148+y ,5 , 7 ) ;
			g.fillOval( 75+x ,145+y ,5 , 7 ) ;
			g.fillOval( 85+x ,150+y ,5 , 7 ) ;
			g.fillOval( 65+x ,160+y ,20 , 20 ) ;

			g.setColor(new Color(80,180,80)) ;		//右爪
			g.fillOval( 200+x ,140+y ,50 , 70 ) ;
			g.setColor(new Color(250,100,150)) ;	//右指头
			g.fillOval( 210+x ,150+y ,5 , 7 ) ;
			g.fillOval( 220+x ,145+y ,5 , 7 ) ;
			g.fillOval( 230+x ,148+y ,5 , 7 ) ;
			g.fillOval( 240+x ,155+y ,5 , 7 ) ;
			g.fillOval( 215+x ,160+y ,20 , 20 ) ;		
			
			g.setColor(new Color(80,180,80)) ;		//左后爪
			g.fillOval( 50+x ,280+y ,50 , 70 ) ;
			g.setColor(new Color(250,100,150)) ;	//左后指头		
			g.fillOval( 50+x ,315+y ,5 , 7 ) ;
			g.fillOval( 55+x ,328+y,5 , 7 ) ;
			g.fillOval( 65+x ,340+y ,5 , 7 ) ;
			g.fillOval( 80+x ,340+y ,5 , 7 ) ;
			g.fillOval( 63+x ,310+y ,20 , 20 ) ;
			
			g.setColor(new Color(80,180,80)) ;		//右后爪
			g.fillOval( 200+x ,280+y ,50 , 70 ) ;
			g.setColor(new Color(250,100,150)) ;	//右后指头		
			g.fillOval( 245+x ,320+y ,5 , 7 ) ;
			g.fillOval( 240+x ,330+y ,5 , 7 ) ;
			g.fillOval( 230+x ,340+y ,5 , 7 ) ;
			g.fillOval( 215+x ,338+y ,5 , 7 ) ;
			g.fillOval( 215+x ,310+y ,20 , 20 ) ;
		
		}
//```````````````````````````````````````````````````````````````````````````
		if (b)
		{
			g.setColor(new Color(50 ,160 , 50)) ;	//龟身大圈
			g.fillOval( 60+x , 150+y , 180 ,200 ) ;		
			g.setColor(new Color(50,200,50)) ;
			g.fillOval( 70+x , 160+y , 160 ,180 ) ;		//小圈

			g.setColor(new Color(0,0,0)) ;
			g.drawLine( 130+x , 210+y , 170+x , 210+y ) ;	//中间的花纹
			g.drawLine( 170+x , 210+y , 200+x , 240+y ) ;
			g.drawLine( 200+x , 240+y , 170+x , 270+y ) ;
			g.drawLine( 170+x , 270+y , 130+x , 270+y ) ;
			g.drawLine( 130+x , 270+y , 100+x , 240+y ) ;
			g.drawLine( 100+x , 240+y , 130+x , 210+y ) ;	 
			g.drawLine( 100+x , 180+y , 130+x , 210+y ) ;	//扩散出来的花纹
			g.drawLine( 170+x , 210+y , 200+x ,180+y ) ;
			g.drawLine( 200+x , 240+y , 230+x ,250+y ) ;
			g.drawLine( 170+x , 270+y , 200+x ,320+y ) ;
			g.drawLine( 130+x , 270+y , 100+x ,320+y ) ;
			g.drawLine( 100+x , 240+y , 70+x ,250+y ) ;
		}
		else
		{
			g.setColor(new Color(80,180,80)) ;
			g.fillOval( 60+x , 150+y , 180 ,200 ) ;		//龟身大圈
			g.setColor(new Color(255,230,240)) ;
			g.fillOval( 70+x , 160+y , 160 ,180 ) ;		//小圈
			
			g.setColor(new Color(0,0,0)) ;			//肚肚上的花纹
			g.drawLine( 100+x ,180+y , 115+x , 195+y ) ;
			g.drawLine( 200+x ,180+y , 185+x , 195+y ) ;
			g.drawLine( 115+x ,195+y , 185+x , 195+y ) ;
			g.drawLine( 100+x ,240+y , 75+x , 220+y ) ;
			g.drawLine( 200+x ,240+y , 225+x , 220+y ) ;
			g.drawLine( 100+x ,240+y , 200+x , 240+y ) ;
			g.drawLine( 120+x ,290+y , 90+x , 310+y ) ;
			g.drawLine( 180+x ,290+y , 210+x , 310+y ) ;
			g.drawLine( 120+x ,290+y , 180+x , 290+y ) ;
			g.drawLine( 150+x ,160+y , 150+x , 340+y ) ;
		
//``````````````````````````````````````````````````````````````````````````
		}
	}

	public void mouseClicked(MouseEvent e) 
	{
		int mousex=(int)e.getPoint().getX();
		int mousey=(int)e.getPoint().getY();
	}

	public void mousePressed(MouseEvent e) 
	{
		if(e.getX()>x+54 && e.getX()<x+328 && e.getY()>y+99 && e.getY()<y+399)
		{
			b = false ;
			this.repaint() ;
		}
	}

	public void mouseReleased(MouseEvent e) 
	{
		b = true ;
		this.repaint() ;
	}

	public void mouseEntered(MouseEvent e) 
	{
		// TODO: Add your code here
	}

	public void mouseExited(MouseEvent e) 
	{
		// TODO: Add your code here
	}

	public void mouseDragged(MouseEvent e) {
		x = e.getX() - 155 ;
		y = e.getY() - 264 ;
		this.repaint() ;
	}

	public void mouseMoved(MouseEvent e) {
		// TODO: Add your code here
	}
}
