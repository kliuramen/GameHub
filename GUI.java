import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class GUI extends JFrame implements ActionListener {	
	public static final int height = 720; 
	public static final int width = height * 16 / 9; 
	
	JButton play;
	JButton exit; 
	GUI() { 
		play = new JButton(); 
		exit = new JButton(); 
		play.setBounds(100, 100, 100, 200);
		exit.setBounds(100, 400, 100, 200);
		this.add(play);
		this.add(exit);
		 
		this.setTitle("MG Studio");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLayout(null);
		this.setSize(width, height);
		this.setVisible(true);
		
		ImageIcon icon = new ImageIcon("icon.png");
		this.setIconImage(icon.getImage()); 

	
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
