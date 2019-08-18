package fighter;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;



public class GameBoard extends JPanel implements KeyListener{
	
	EnemyJet enemy;
	EnemyJet enemy1;
	
	Bullet[] bullet = new Bullet[10];
	
	static int score = 0;
	
	public GameBoard(){
		super();
		super.setFocusable(true);
		super.addKeyListener(this);
		
		  enemy = new EnemyJet(900,250,"images//enemy.png",true);
		  enemy1 = new EnemyJet(0,250,"images//enemy1.png",true);
		
			
			int xBullet =-860; int yBullet=-250;
			
			for(int i = 0; i < bullet.length; i++){
				
				bullet[i] = new Bullet(enemy.getX() + 2,enemy.getY() + 25,"images//bullet.png");
				
				
			}
			

			for(int i = 0; i < bullet.length; i++){
				
				
				bullet[i] = new Bullet(enemy1.getY() + 25,enemy1.getX() + 2,"images//bullet.png");
				
			}
				
		        EnemyMoving em = new EnemyMoving(bullet,enemy,enemy1,this);
		       
			
				em.start();

			
		
		
	}
	

	public void paint(Graphics g){
		
		ImageIcon background = new ImageIcon("images//background.png");
		g.drawImage(background.getImage(),0,0,null);
			
			enemy.draw(g);
		
		for(int i = 0; i<bullet.length; i++){
			
			bullet[i].draw(g);
		
			
		}
		
		g.setColor(Color.BLACK);
		g.drawString("Score = " + score,0, 10);	
		
	}
	

	public void keyTyped(KeyEvent e) {
		
		
	}

	public void keyPressed(KeyEvent e) {
		
        if(e.getKeyCode() == KeyEvent.VK_UP){
			
			if(enemy.getY() > 0)
				enemy.setY(enemy.getY() - 5);
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			
			if(enemy.getY() < 400)
				enemy.setY(enemy.getY() + 5);
			
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_Q){
			
			if(enemy1.getY() > 0)
				enemy1.setY(enemy1.getY() - 15);
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_A){
			
			if(enemy1.getY() < 400)
				enemy1.setY(enemy1.getY() + 15);
			
			
		}

		
		super.repaint();
		
	}

	public void keyReleased(KeyEvent e) {		
	}
}



