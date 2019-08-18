package fighter;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		GameBoard gb = new GameBoard();
			
			JFrame gameFrame = new JFrame();
			gameFrame.setTitle("Flying Fighters");
			gameFrame.setSize(1000, 500);
			gameFrame.add(gb);
			gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setVisible(true);

		}


	}

