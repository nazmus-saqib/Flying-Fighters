package fighter;



import java.awt.Rectangle;

public class EnemyMoving extends Thread  {

	Bullet[] bullet;
	EnemyJet enemy;
	EnemyJet enemy1;
	GameBoard gameBoard;
	
	
	
	public EnemyMoving(Bullet[] bullet, EnemyJet enemy,EnemyJet enemy1, GameBoard gameBoard) {
		
		this.bullet = bullet;
		this.enemy = enemy;
		this.enemy1=enemy1;
		this.gameBoard = gameBoard;
		
		for(int i = 0; i < bullet.length; i++){
			EnemyBulletFire ebf = new EnemyBulletFire(bullet[i],enemy,enemy1,gameBoard);
			ebf.start();
		}
	}
	
     public void run(){
		
    	 
    	 
		while(true){
			enemy.setX(enemy.getX()-5);
			
			
				
			if(enemy.getX()<-50){
				enemy.setX(1000);
			}
			
			
			
			
			try{
				Thread.sleep(50);
			}
			catch(Exception e){}
			
			gameBoard.repaint();
			
		}
			
		
	}
     
     public void run1(){
			
    	 
    	 
			while(true){
				enemy1.setX(enemy1.getX()-5);
				
				
					
				if(enemy1.getX()<-50){
					enemy1.setX(1000);
				}
				
				
				
				
				try{
					Thread.sleep(50);
				}
				catch(Exception e){}
				
				gameBoard.repaint();
				
			}
     }
	
}
		

		
		
	
	
	

	

	
	
	
