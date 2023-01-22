import java.awt.*; 

public class ConnectFour {
    public enum Slot{ 
		EMPTY(0),
		YELLOW(1),
		RED(2);
		
		private final int slotValue;
		
		private Slot(int i) {
			this.slotValue = i; 
		}
	}
	
	private Slot[][] grid = new Slot[6][7]; 
	private Slot current = Slot.YELLOW;
    private boolean winner = false; 

	
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
	
	public void setGrid() { 
		for(int row = 0; row < grid.length; row++) { 
			for(int column = 0; column < grid[row].length; column++) { 
				grid[row][column] = Slot.EMPTY; 
			}
		}
	}
	
	public void printGrid() { 
		System.out.print(grid.toString());
	}
	
	public boolean checkVictoryAt(int row, int column) { 
		return checkHorizontal(row) || checkVertical(column) || checkDiagonal(row, column); 
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
		
	public boolean checkVertical(int column) { 
		int inARow = 0;
		for(int i = 0; i < grid.length; i++) { 
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
	
	public void play() { 
		setGrid(); 
        while(!winner) { 

        }
	}
}
