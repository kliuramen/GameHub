import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 

public class ConnectFour extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
    
    private boolean winner = false; 

    private static JFrame frame; 
	private static final int WIDTH = 1280, HEIGHT = 720, widthUnit = 75, heightUnit = 75; 
	
    public ConnectFour() {
		frame = new JFrame("Connect Four");
		frame.setBounds(50, 50, WIDTH, HEIGHT);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        javax.swing.Timer timer = new javax.swing.Timer(10, this);
        timer.start();

        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
	}
	

	private JButton[] columns = new JButton[7];
	private JButton col1 = new JButton(); 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint(); 
	}
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		grid.draw(g);
	}





	public static class Grid { 
		public enum Slot{ 
			EMPTY(),
			YELLOW(),
			RED();
		}
		
		private static Slot[][] grid = new Slot[6][7]; 
		private Slot current = Slot.YELLOW;
		
		public void setGrid() { 
			for(int row = 0; row < grid.length; row++) { 
				for(int column = 0; column < grid[row].length; column++) { 
					grid[row][column] = Slot.EMPTY; 
				}
			}
		}
		
	    public static void draw(Graphics g) {
	        for(int i = widthUnit; i <= WIDTH; i+= widthUnit) { 
	        	g.setColor(Color.BLACK);
	        	g.drawLine(i, heightUnit, i, HEIGHT - heightUnit);
	        }
	    }
		
	    public void useTurn() { 
			switch(current) { 
			case YELLOW:
				current = Slot.RED; 
			case RED:
				current = Slot.YELLOW;
			default:
				break;
			}
		}

		public int playTurn(int column) { 
			for(int row = 0; row < grid.length; row++) {
				if(grid[row][column] == Slot.EMPTY) { 
					return row; 
				}
			}
			return -1; 
    	}

		public boolean checkVictoryAt(int row, int column) { 
			return checkHorizontal(row) || checkVertical(row, column) || checkDiagonal(row, column); 
		}
		
		public boolean checkHorizontal(int row) { 
			int inARow = 0; 
			for(int i = 0; i < grid[row].length; i++) { 
				if(grid[row][i] == current) {
					inARow++;
				} 
				if(inARow == 4) { 
					return true; 
				}
			}
			return false; 
		}
			
		public boolean checkVertical(int row, int column) { 
			int inARow = 0;
			if(row > 3) return false; 
			for(int i = row; i >= 0; i--) { 
				if(grid[i][column] == current) { 
					inARow++; 
				}
				if(inARow == 4) { 
					return true; 
				}
			}
			return false;
		}
		
		public boolean checkDiagonal(int row, int column) { 
			int inARow = 0; 
			for(int r = 0; r < 7; r++) { 
				int c = column; 
				if(grid[r][c] == current) { 
					inARow++;
				}
				if(inARow == 4) { 
					return true; 
				}
			}
			return false; 
		}
	}
}
