package Login;
 
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
public class AdminLogin extends JFrame implements MouseListener, ActionListener{
	private JPanel panel;
	private JLabel labelUserName, labelPass, background, top;
	private JTextField userTf;
	private JPasswordField passPf;
	private Font useNmFont, passFont, loginFont, backFont, userTfFont, passPfFont, topFont,exitFont;
	private JButton login, back,exit;
	private Color fontClr;
	private ImageIcon img;
	private Cursor cursor;

	public AdminLogin(){
		super("Admin Login");
		super.setBounds(250,90,900,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		img = new ImageIcon("Image/adminLogin.jpg");
		background = new JLabel(img);
		background.setBounds(0,0,900,600);
		panel.add(background);

		cursor = new Cursor(Cursor.HAND_CURSOR);
		top = new JLabel("Admin Login ");
		top.setBounds(500,60,250,50);
		topFont= new Font("Cambria",Font.BOLD,40);
		top.setFont(topFont);
		fontClr = new Color(0,0,0);
		top.setForeground(fontClr);
		panel.add(top);
		background.add(top);

		labelUserName = new JLabel("Username : ");
		labelUserName.setBounds(450,190,120,60);
		panel.add(labelUserName);
		useNmFont = new Font("Cambria",Font.BOLD,20);
		labelUserName.setFont(useNmFont);
		fontClr = new Color(0,0,0);
		//bgclr = new Color(222,22,22);
		labelUserName.setForeground(fontClr); 
		//labelUserName.setBackground(bgclr);
		background.add(labelUserName);
		userTf = new JTextField();
		userTf.setBounds(560,205,200,30);
		panel.add(userTf);
		userTfFont = new Font("Cambria",Font.BOLD,20);
		userTf.setFont(userTfFont);
		background.add(userTf);

		labelPass = new JLabel("Password : ");
		labelPass.setBounds(450,250,120,60);
		passFont= new Font("Cambria",Font.BOLD,20);
		labelPass.setFont(passFont);
		fontClr = new Color(0,0,0);
		labelPass.setForeground(fontClr);
		panel.add(labelPass);
		background.add(labelPass);
		passPf = new JPasswordField();
		passPf.setBounds(560,270,200,30);
		passPf.setEchoChar('*');
		passPfFont = new Font("Cambria",Font.BOLD,20);
		passPf.setFont(passPfFont);
		panel.add(passPf);
		background.add(passPf);
		login = new JButton("LogIn");
		login.setBounds(660,370,90,50);
		login.setForeground(fontClr);
		loginFont = new Font("Cambria",Font.BOLD,16);
		login.setFont(loginFont);
		login.addActionListener(this);
		login.setCursor(cursor);
		panel.add(login);
		background.add(login);
		back = new JButton("Back");
		back.setBounds(440,370,90,50);
		back.setForeground(fontClr);
		backFont = new Font("Cambria",Font.BOLD,16);
		back.setFont(backFont);
		back.addActionListener(this);
		back.setCursor(cursor);
		panel.add(back);
		background.add(back);

		exit = new JButton("Exit");
		exit.setBounds(770,500,90,50);
		exit.setForeground(fontClr);
		exitFont = new Font("Cambria",Font.BOLD,16);
		exit.setFont(exitFont);
		exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
		exit.addActionListener(this);
		exit.setCursor(cursor);
		panel.add(exit);
		background.add(exit);

		super.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == login)
		{
			String user=userTf.getText();
		    String pass=passPf.getText();
			//String user = "admin";
			//String pass = "admin";
 
			if(user.equals("admin") && pass.equals("admin")){
				JOptionPane.showMessageDialog(this,"Login Successfull");
				//AdminPanel obj1 = new AdminPanel();
				//obj1.setVisible(true);
				this.setVisible(false);
			}
			else 
			{
				JOptionPane.showMessageDialog(this,"Username/Passoword wrong");
			}
		}
		else if(ae.getSource() == exit){
			System.exit(0); 
		}
		else if(ae.getSource() == back){
			Login l1 = new Login();
			l1.setVisible(true);
			this.setVisible(false);
		}

	}
}