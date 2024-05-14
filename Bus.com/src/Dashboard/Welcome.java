package Dashboard;
 
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Login.Login;
 
 
public class Welcome extends JFrame implements MouseListener, ActionListener{
	private JPanel panel;
	private JFrame WelcomeFrame;
	private JLabel label, background, wel;
	private JButton exit, next;
	private Color fontClr, exitClr, exitClrFont, nextClrFont,clr,clr1,clr2,clr3;
	private Font exitFont, nextFont,welFont;
	private ImageIcon img;
	private Cursor cursor;
	public Welcome(){
		super("Online Bus Ticket");
		super.setBounds(250,90,900,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("picture/welcome.jpg");

		panel = new JPanel();
		panel.setLayout(null);

		background = new JLabel(img);
		background.setBounds(0,0,900,600);
		panel.add(background);
		cursor = new Cursor(Cursor.HAND_CURSOR);

		wel = new JLabel("Welcome");
		wel.setBounds(330,20,350,60);
		welFont = new Font("Forte",Font.PLAIN,50);
		wel.setFont(welFont);
		fontClr = new Color(0,0,0);
		wel.setForeground(fontClr);
		panel.add(wel);
		background.add(wel);

		exit = new JButton("Exit");
		exit.setBounds(200,430,80,50);
		panel.add(exit);
		exit.setBackground(exitClr);
		exitFont = new Font("Cambria",Font.BOLD,20);
		exit.setFont(exitFont);
		exitClrFont = new Color(0,0,0);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		exit.setCursor(cursor);
		exit.setForeground(exitClrFont);
		background.add(exit);

		next = new JButton("Next");
		next.setBounds(600,430,80,50);
		panel.add(next);
		nextFont = new Font("Cambria",Font.BOLD,20);
		next.setFont(nextFont);
		nextClrFont = new Color(0,0,0);
		next.addMouseListener(this);
		next.addActionListener(this);
		next.setCursor(cursor);
		next.setForeground(nextClrFont);
		background.add(next);

		super.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == exit){
			clr = new Color(232,21,21);
			exit.setBackground(clr);
		}
		else if(me.getSource() == next){
			clr1 = new Color(27,88,230);
			next.setBackground(clr1);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == exit){
			clr2 = new Color(226,222,222);
			exit.setBackground(clr2);
		}
		else if(me.getSource() == next){
			clr3 = new Color(226,222,222);
			next.setBackground(clr3);
		}
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exit){
			System.exit(0); 
		}
		else if(ae.getSource() == next){
			Login obj1 = new Login();
			obj1.setVisible(true);
			this.setVisible(false);
		}
	}
}