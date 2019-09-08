import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

import java.awt.Font;

public class DrawComponent extends JComponent{
	
	public String s;
	public WordList wL;
	public ArrayList<Word> rL;
	public ArrayList usedX;
	public ArrayList usedY;
	public void stringInput (String st) {
		s = st;
	}
	
	public void listInput (WordList woL) {
		wL = woL;
	}
	
	public void realInput (ArrayList<Word> reL) {
		rL = reL;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		int[] useX = new int[wL.wList.size()];
		int[] useY = new int[wL.wList.size()];
		
		
		for(int i = 0; i < wL.wordCount-2; i++) {
			g2.setFont(new Font("monospaced", Font.BOLD, (int) ((wL.get(i).getImp())*700)));
			
			int x = (int)(Math.random()*1650);
			int y = (int)(Math.random()*850);
			
			for(int o = 0; o < wL.wList.size(); o++) {
				
				int xX = Math.abs(x - useX[o]);
				int yY = Math.abs(y - useY[o]);

				
				if(xX < 100 && yY < 45) {
					x = (int)(Math.random()*1650);
					y = (int)(Math.random()*850);
				}
				else {
					g2.drawString(wL.get(i).getName(), x+60, y+60);
				}
			}			
		}
	}
}

