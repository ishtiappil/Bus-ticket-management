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

import Dashboard.Dashboard;
import Dashboard.Registration;
import Data.Datas;
 
 
public class Login extends JFrame implements MouseListener,ActionListener{
	private JPanel panel;
	private JLabel labelUserName, labelPass, background,top,top1;
	private JTextField userTf;
	private JPasswordField passPf;
	private Font useNmFont, passFont, loginFont, signupFont, userTfFont, passPfFont,adminFont,forgetFont,exitFont,top1Font,topFont;
	private JButton Login, signup, forget, admin,exit;
	private Color fontClr, bgclr;
	private ImageIcon img;
	private Cursor cursor;
	public Login(){
		super(" Login ");
		super.setBounds(250,90,900,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		img = new ImageIcon("picture/Login1.jpg");
		panel = new JPanel();
		panel.setLayout(null);
		background = new JLabel(img);
		background.setBounds(0,0,900,600);
		panel.add(background);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		top = new JLabel("Online Bus Ticket");
		top.setBounds(500,35,320,60);
		topFont= new Font("Forte",Font.BOLD,30);
		top.setFont(topFont);
		fontClr = new Color(0,0,0);
		top.setForeground(fontClr);
		panel.add(top);
		background.add(top);

		top1 = new JLabel("Sign in with your valid Username & Passoword.");
		top1.setBounds(450,120,320,60);
		top1Font= new Font("Cambria",Font.ITALIC,16);
		top1.setFont(top1Font);
		fontClr = new Color(0,0,0);
		top1.setForeground(fontClr);
		panel.add(top1);
		background.add(top1);
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
		userTfFont = new Font("Times New Roman",Font.BOLD,18);
		userTf.setFont(userTfFont);
		background.add(userTf);
		labelPass = new JLabel("Password : ");
		labelPass.setBounds(450,250,120,60);
		passFont= new Font("Times New Roman",Font.BOLD,20);
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
		Login = new JButton("LogIn");
		Login.setBounds(660,370,90,35);
		fontClr = new Color(0,0,0);
		Login.setForeground(fontClr);
		loginFont = new Font("Cambria",Font.BOLD,16);
		Login.setFont(loginFont);
		Login.addActionListener(this);
		Login.setCursor(cursor);
		panel.add(Login);
		background.add(Login);
		signup = new JButton("SignUp");
		signup.setBounds(440,370,90,35);
		signup.setForeground(fontClr);
		signupFont = new Font("Cambria",Font.BOLD,16);
		signup.setFont(signupFont);
		signup.addActionListener(this);
		signup.setCursor(cursor);
		panel.add(signup);
		background.add(signup);

		admin = new JButton("*Administrator portal");
		admin.setBounds(20,500,190,50);
		fontClr = new Color(0,0,0);
		admin.setForeground(fontClr);
		adminFont = new Font("Cambria",Font.BOLD,14);
		admin.setFont(adminFont);
		admin.setContentAreaFilled(false);
        admin.setBorderPainted(false);
		admin.addActionListener(this);
		admin.setCursor(cursor);
		panel.add(admin);
		background.add(admin);

		forget = new JButton("Forget Password?");
		forget.setBounds(400,300,190,50);
		fontClr = new Color(0,0,0);
		forget.setForeground(fontClr);
		forgetFont = new Font("Cambria",Font.ITALIC,14);
		forget.setFont(forgetFont);
		forget.setContentAreaFilled(false);
        forget.setBorderPainted(false);
		forget.addActionListener(this);
		forget.setCursor(cursor);
		panel.add(forget);
		background.add(forget);
		exit = new JButton("Exit");
		exit.setBounds(800,500,70,50);
		fontClr = new Color(0,0,0);
		exit.setForeground(fontClr);
		exitFont = new Font("Cambria",Font.BOLD,14);
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
		if(ae.getSource() == Login)
		{
			String user=userTf.getText();
			String pass=passPf.getText();
			Datas data = new Datas(user, pass);
			if(data.checkLogin(user, pass) == true)
			{
				JOptionPane.showMessageDialog(this,"Login Successfull");
				Dashboard obj1 = new Dashboard();
				obj1.setVisible(true);
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
		else if(ae.getSource() == signup){
			Registration r1 =new Registration();
			r1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == admin){
			AdminLogin a1 =new AdminLogin();
			a1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == forget){
			JOptionPane.showMessageDialog(this, "You forget,thats not my fault. Try to remeber -_-");
		}
	}
}