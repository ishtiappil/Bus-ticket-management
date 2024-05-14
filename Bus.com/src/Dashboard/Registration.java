package Dashboard;
 
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Data.Datas;
import Login.Login;
 
 
public class Registration extends JFrame implements MouseListener, ActionListener{
	private JPanel panel;
	private JFrame RegistrationFrame;
	private JLabel lbUser, top, background, lbPass, lbConfirmPass, lbEmail, lbPhone, nid, gender;
	private JTextField userTf, emailTf, phoneTf, nidTf;
	private JPasswordField passPf,confirmPassPf;
	private Font useNmFont, passFont, confirmPassFont, emailFont, phoneFont, userTfFont, passPfFont, confirmPassPfFont, emailTfFont, phoneTfFont, nidTfFont, nidFont, genderFont, maleFont, femaleFont,exitFont,signupFont,backFont,topFont;
	private Color fontClr;
	private JRadioButton male, female;
	private ButtonGroup bgGender;
	private JButton exit,signup,back;
	private ImageIcon img;
	private Cursor cursor;

	public Registration(){
		super("Registration");
		super.setBounds(250,90,900,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);

		img = new ImageIcon("picture/registration.jpg");

		panel = new JPanel();
		panel.setLayout(null);

		background = new JLabel(img);
		background.setBounds(0,0,900,600);
		panel.add(background);
		cursor = new Cursor(Cursor.HAND_CURSOR);

		lbUser = new JLabel("Username : ");
		lbUser.setBounds(180,110,120,60);
		useNmFont = new Font("Cambria",Font.BOLD,20);
		lbUser.setFont(useNmFont);
		fontClr = new Color(0,0,0);
		lbUser.setForeground(fontClr);
		panel.add(lbUser);
		background.add(lbUser);

		userTf = new JTextField();
		userTf.setBounds(300,125,200,30);
		userTfFont = new Font("Cambria",Font.BOLD,18);
		userTf.setFont(userTfFont);
		panel.add(userTf);
		background.add(userTf);
		nid = new JLabel("NID No : ");
		nid.setBounds(180,150,120,60);
		nidFont = new Font("Cambria",Font.BOLD,20);
		nid.setFont(nidFont);
		fontClr = new Color(0,0,0);
		nid.setForeground(fontClr);
		panel.add(nid);
		background.add(nid);
		nidTf = new JTextField();
		nidTf.setBounds(300,165,200,30);
		nidTfFont = new Font("Cambria",Font.BOLD,18);
		nidTf.setFont(nidTfFont);
		panel.add(nidTf);
		background.add(nidTf);

		gender = new JLabel("Gender : ");
		gender.setBounds(180,190,120,60);
		genderFont = new Font("Cambria",Font.BOLD,20);
		gender.setFont(genderFont);
		fontClr = new Color(0,0,0);
		gender.setForeground(fontClr);
		panel.add(gender);
		background.add(gender);
		male = new JRadioButton("Male");
		male.setBounds(290,200,70,40);
		maleFont = new Font("Cambria",Font.BOLD,20);
		male.setFont(maleFont);
		fontClr = new Color(0,0,0);
		male.setForeground(fontClr);
		male.setContentAreaFilled(false);
        male.setBorderPainted(false);
		male.setCursor(cursor);
		panel.add(male);
		background.add(male);

		female = new JRadioButton("Female");
		female.setBounds(390,200,120,40);
		femaleFont = new Font("Cambria",Font.BOLD,20);
		female.setFont(femaleFont);
		fontClr = new Color(0,0,0);
		female.setCursor(cursor);
		female.setForeground(fontClr);
		female.setContentAreaFilled(false);
        female.setBorderPainted(false);
		panel.add(female);
		background.add(female);

		bgGender = new ButtonGroup();
		bgGender.add(male);
		bgGender.add(female);

		lbPass = new JLabel("Password : ");
		lbPass.setBounds(180,230,120,60);
		passFont = new Font("Cambria",Font.BOLD,20);
		lbPass.setFont(passFont);
		fontClr = new Color(0,0,0);
		lbPass.setForeground(fontClr);
		panel.add(lbPass);
		background.add(lbPass);

		passPf = new JPasswordField();
		passPf.setBounds(300,250,200,30);
		passPf.setEchoChar('*');
		passPfFont = new Font("Cambria",Font.BOLD,18);
		passPf.setFont(passPfFont);
		panel.add(passPf);
		background.add(passPf);

		lbConfirmPass = new JLabel(" Confirm Password : ");
		lbConfirmPass.setBounds(180,270,200,60);
		confirmPassFont = new Font("Cambria",Font.BOLD,20);
		lbConfirmPass.setFont(confirmPassFont);
		fontClr = new Color(0,0,0);
		lbConfirmPass.setForeground(fontClr);
		panel.add(lbConfirmPass);
		background.add(lbConfirmPass);

		confirmPassPf = new JPasswordField();
		confirmPassPf.setBounds(370,290,200,30);
		confirmPassPf.setEchoChar('*');
		confirmPassFont = new Font("Cambria",Font.BOLD,18);
		confirmPassPf.setFont(confirmPassFont);
		panel.add(confirmPassPf);
		background.add(confirmPassPf);

		lbEmail = new JLabel(" Email : ");
	    lbEmail.setBounds(180,310,200,60);
		emailFont = new Font("Cambria",Font.BOLD,20);
		lbEmail.setFont(emailFont);
		fontClr = new Color(0,0,0);
		lbEmail.setForeground(fontClr);
		panel.add(lbEmail);
		background.add(lbEmail);

		emailTf = new JTextField();
		emailTf.setBounds(280,330,200,30);
		emailTfFont = new Font("Cambria",Font.BOLD,18);
		emailTf.setFont(emailTfFont);
		panel.add(emailTf);
		background.add(emailTf);

		lbPhone = new JLabel(" Phone No : ");
	    lbPhone.setBounds(180,350,200,60);
		phoneFont = new Font("Cambria",Font.BOLD,20);
		lbPhone.setFont(phoneFont);
		fontClr = new Color(0,0,0);
		lbPhone.setForeground(fontClr);
		panel.add(lbPhone);
		background.add(lbPhone);

		phoneTf = new JTextField();
		phoneTf.setBounds(285,370,200,30);
		phoneTfFont = new Font("Cambria",Font.BOLD,18);
		phoneTf.setFont(phoneTfFont);
		panel.add(phoneTf);
		background.add(phoneTf);

		exit = new JButton("Exit");
	    exit.setBounds(750,500,100,40);
		exitFont = new Font("Cambria",Font.BOLD,18);
		exit.setFont(exitFont);
		fontClr = new Color(0,0,0);
		exit.setForeground(fontClr);
		exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
		exit.setCursor(cursor);
		panel.add(exit);
		exit.addActionListener(this);
		background.add(exit);

		back = new JButton("Back");
	    back.setBounds(180,440,100,40);
		backFont = new Font("Cambria",Font.BOLD,18);
		back.setFont(backFont);
		fontClr = new Color(0,0,0);
		back.setForeground(fontClr);
		back.setCursor(cursor);
		panel.add(back);
		back.addActionListener(this);
		background.add(back);

		signup = new JButton("SignUp");
	    signup.setBounds(320,440,100,40);
		signupFont = new Font("Cambria",Font.BOLD,18);
		signup.setFont(signupFont);
		fontClr = new Color(0,0,0);
		signup.setForeground(fontClr);
		signup.setCursor(cursor);
		panel.add(signup);
		signup.addActionListener(this);
		background.add(signup);

		super.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exit){
			System.exit(0);
		}
		else if(ae.getSource() == signup){
			String s1,s2,s3,s4,s5,s6,s7;
			s1 = userTf.getText(); 
			s2 = nidTf.getText();
			s3 = passPf.getText(); 
			s4 = confirmPassPf.getText();
			s5 = phoneTf.getText(); 
			s6 = emailTf.getText();

			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty())
			{
				JOptionPane.showMessageDialog(this, "Please fill up all the information");
			}
			else
			{
				Datas data = new Datas(s1,s2,s3,s5,s6);
				if (data.checkDuplicate(s1,s5,s6) == true)
				{
					JOptionPane.showMessageDialog(this,"Username/Phone No/Email already Exist");
				}
				else 
				{
					data.addDatas();
					JOptionPane.showMessageDialog(this,"Registration Successfull");
					userTf.setText("");
					nidTf.setText("");
					passPf.setText("");
					confirmPassPf.setText("");
					phoneTf.setText("");
					emailTf.setText("");
					Login obj1 = new Login();
					obj1.setVisible(true);
					this.setVisible(false);
				}
			}
		}
		else if(ae.getSource() == back){
			Login lo1 = new Login();
			lo1.setVisible(true);
			this.setVisible(false);
		}
		}
	}