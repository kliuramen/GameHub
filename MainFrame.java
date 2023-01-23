import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainFrame extends JFrame
{
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JLabel gameHub = new JLabel();
    public void initialize()
    {
        JButton connectFour = new JButton();
        connectFour.setFont(mainFont);
        connectFour.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //insert connectfour game 
            }
        });
        JButton ticTacToe = new JButton();
        ticTacToe.setFont(mainFont);
        ticTacToe.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //insert tictactoe game
            }
        });
        JButton hiddenGame = new JButton();
        hiddenGame.setFont(mainFont);
        hiddenGame.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //print that game is not avaiable yet
            }
        });
        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3, 0, 0));
        buttonsPanel.add(connectFour);
        buttonsPanel.add(ticTacToe);
        buttonsPanel.add(hiddenGame);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 225));
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("GameHub");
        setSize(1000, 1000);
        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
