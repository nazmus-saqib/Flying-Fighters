package fighter;


import java.awt.Rectangle;

public class EnemyBulletFire extends Thread {

	private Bullet bullet;
	private EnemyJet enemy;
	private EnemyJet enemy1;
	
	private GameBoard board;
	
	
	public EnemyBulletFire(Bullet bullet, EnemyJet enemy,EnemyJet enemy1, GameBoard board) {
	
		this.bullet = bullet;
		this.enemy = enemy;
		this.board =  board;
		this.enemy1=enemy1;
	}
	
	public void run(){
		
		while(true){
			
			bullet.setX(bullet.getX() - 10);
		
			if(bullet.getX() < -150)
				bullet.setX(enemy.getX());
               
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			board.repaint();
			
		}
				
		
	}
	
   public void run1(){
		
		while(true){
			
			bullet.setX(bullet.getX() - 10);
		
			if(bullet.getX() < -150)
				bullet.setX(enemy1.getX());
               
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			board.repaint();
			
		}
				
		
	}
	
	
	
	   public void checkCollision(){
			
			Rectangle bulletRect = new Rectangle(bullet.getY(),bullet.getX(),40,20);
			
				
			Rectangle enemyRect = new Rectangle(enemy.getY(),enemy.getX(),100,80);
			Rectangle enemy1Rect = new Rectangle(enemy1.getX(),enemy1.getY(),100,80);
			
				
				if((bulletRect.intersects(enemyRect)) &(bulletRect.intersects(enemy1Rect)) == true){
					GameSound.bulletHitSound();
					enemy.setY(500);
					enemy1.setY(500);
					GameBoard.score++;
				     break;
				}
			
				
			
				
			}
	
    
		
		

		
	
	
}
