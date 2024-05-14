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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Payment extends JFrame implements MouseListener, ActionListener{
	private JPanel panel;
	private JLabel background, cardNm, cardNo, top, top2, validity, cvc, visa, master, amx;
	private ImageIcon img, visaImg, masterImg, anxImg;
	private JTextField cardNmTf, cardNoTf, validityTf, cvcTf;
	private Font cardNmFont, cardNoFont, topFont,top2Font, validityFont, cvcFont, cardNmTfFont, CardNoTfFont, validityTfFont, cvcTfFont, cancelFont, confirmFont,exitFont;
	private Color fontClr;
	private JButton cancel, confirm, exit;
	private Cursor cursor;

	public Payment(){
		super("Payment");
		super.setBounds(250,90,900,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		img = new ImageIcon("Image/payment.jpg");
		background = new JLabel(img);
		background.setBounds(0,0,900,600);
		panel.add(background);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		top = new JLabel("Make Your Payment");
		top.setBounds(250,0,500,100);
		topFont = new Font ("Cambria",Font.BOLD,40);
		top.setFont(topFont);
		fontClr = new Color(0,0,0);
		top.setForeground(fontClr);
		panel.add(top);
		background.add(top);
		top2 = new JLabel("We Accept Only");
		top2.setBounds(30,120,500,80);
		top2Font = new Font ("Cambria",Font.BOLD,30);
		top2.setFont(top2Font);
		fontClr = new Color(0,0,0);
		top2.setForeground(fontClr);
		panel.add(top2);
		background.add(top2);
		cardNm = new JLabel("Card Holder Name ");
		cardNm.setBounds(30,220,500,80);
		cardNmFont = new Font ("Cambria",Font.BOLD,20);
		cardNm.setFont(cardNmFont);
		fontClr = new Color(0,0,0);
		cardNm.setForeground(fontClr);
		panel.add(cardNm);
		background.add(cardNm);
		cardNmTf = new JTextField();
		cardNmTf.setBounds(220,250,200,30);
		cardNmTfFont = new Font("Aptos (Body)",Font.PLAIN,18);
		cardNmTf.setFont(cardNmTfFont);
		fontClr = new Color(0,0,0);
		cardNmTf.setForeground(fontClr);
		panel.add(cardNmTf);
		background.add(cardNmTf);
		cardNo = new JLabel("Card Number ");
		cardNo.setBounds(30,270,500,80);
		cardNoFont = new Font ("Cambria",Font.BOLD,20);
		cardNo.setFont(cardNmFont);
		fontClr = new Color(0,0,0);
		cardNo.setForeground(fontClr);
		panel.add(cardNo);
		background.add(cardNo);
		cardNoTf = new JTextField();
		cardNoTf.setBounds(220,290,200,30);
		cardNmTfFont = new Font("Aptos (Body)",Font.PLAIN,18);
		cardNoTf.setFont(cardNmTfFont);
		fontClr = new Color(0,0,0);
		cardNoTf.setForeground(fontClr);
		panel.add(cardNoTf);
		background.add(cardNoTf);
		validity = new JLabel("Valid Thru ");
		validity.setBounds(30,320,120,80);
		validityFont = new Font ("Cambria",Font.BOLD,20);
		validity.setFont(cardNmFont);
		fontClr = new Color(0,0,0);
		validity.setForeground(fontClr);
		panel.add(validity);
		background.add(validity);
		validityTf = new JTextField();
		validityTf.setBounds(160,345,100,30);
		validityTfFont = new Font("Aptos (Body)",Font.PLAIN,18);
		validityTf.setFont(validityTfFont);
		fontClr = new Color(0,0,0);
		validityTf.setForeground(fontClr);
		panel.add(validityTf);
		background.add(validityTf);
		cvc = new JLabel("CVC/CVV ");
		cvc.setBounds(280,320,120,80);
		cvcFont = new Font ("Cambria",Font.BOLD,20);
		cvc.setFont(cardNmFont);
		fontClr = new Color(0,0,0);
		cvc.setForeground(fontClr);
		panel.add(cvc);
		background.add(cvc);
		cvcTf = new JTextField();
		cvcTf.setBounds(380,345,100,30);
		cvcTfFont = new Font("Aptos (Body)",Font.PLAIN,18);
		cvcTf.setFont(cvcTfFont);
		fontClr = new Color(0,0,0);
		cvcTf.setForeground(fontClr);
		panel.add(cvcTf);
		background.add(cvcTf);
		cancel = new JButton("Cancel Payment");
		cancel.setBounds(40,450,190,40);
		cancelFont = new Font("Cambria",Font.BOLD,20);
		cancel.setFont(cancelFont);
		fontClr = new Color(0,0,0);
		cancel.setForeground(fontClr);
		cancel.addActionListener(this);
		cancel.setCursor(cursor);
		panel.add(cancel);
		background.add(cancel);
		confirm = new JButton("Confirm Payment");
		confirm.setBounds(280,450,200,40);
		confirmFont = new Font("Cambria",Font.BOLD,20);
		confirm.setFont(confirmFont);
		fontClr = new Color(0,0,0);
		confirm.setForeground(fontClr);
		confirm.addActionListener(this);
		confirm.setCursor(cursor);
		panel.add(confirm);
		background.add(confirm);
		visaImg = new ImageIcon("Image/visa.png");
		visa = new JLabel(visaImg);
		visa.setBounds(260,137,80,51);
		panel.add(visa);
		background.add(visa);
		masterImg = new ImageIcon("Image/master.png");
		master = new JLabel(masterImg);
		master.setBounds(440,137,80,51);
		panel.add(master);
		background.add(master);
		anxImg = new ImageIcon("picture/fine.jpg");
		amx = new JLabel(anxImg);
		amx.setBounds(0,0,900,600);
		panel.add(amx);
		background.add(amx);
		exit = new JButton("Exit");
		exit.setBounds(750,500,70,50);
		fontClr = new Color(0,0,0);
		exit.setForeground(fontClr);
		exitFont = new Font("Cambria",Font.BOLD,20);
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
		if(ae.getSource() == cancel){
			JOptionPane.showMessageDialog(this,"Your Payment is Cancel");
			Dashboard obj1 = new Dashboard();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == confirm){
			String s1,s2,s3,s4;
			s1 = cardNmTf.getText(); 
			s2 = cardNoTf.getText();
			s3 = validityTf.getText(); 
			s4 = cvcTf.getText();

			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty()){
				JOptionPane.showMessageDialog(this, "Please fill up all the information");
			}
		    else {
			JOptionPane.showMessageDialog(this,"Your Payment is Confirmed");
			Dashboard d1 = new Dashboard();
			d1.setVisible(true);
			this.setVisible(false);
		    }
		}
		else if(ae.getSource() == exit){
			System.exit(0); 
		}

    }
}