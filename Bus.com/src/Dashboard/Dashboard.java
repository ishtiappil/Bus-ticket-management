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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Login.Login;
 
public class Dashboard extends JFrame implements MouseListener, ActionListener{
	private JPanel panel;
	private JLabel from,to,date,person,time,background;
	private ImageIcon img;
	private JTextField dateTf;
	private JComboBox cbFrom,cbTo;
	private Font fromFont, toFont, cbFromFont, cbTOFont,exitFont,backFont,paymentFont,dateFont,dateTfFont,personFont,per1Font,per2Font,per3Font,per4Font,timeFont,time1Font,time2Font,time3Font;
	private Color fontClr;
	private JButton exit,back,payment;
	private JRadioButton per1,per2,per3,per4,time1,time2,time3;
	private ButtonGroup bg,bg1;
	private Cursor cursor;
	public Dashboard(){
		super("Dashboard");
		super.setBounds(250,90,900,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);

	    img = new ImageIcon("picture/dashboard.jpg");
		background = new JLabel(img);
		background.setBounds(0,0,900,600);
		panel.add(background);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		from = new JLabel("From City : ");
		from.setBounds(100,50,120,60);
		fromFont = new Font("Cambria",Font.BOLD,20);
		from.setFont(fromFont);
		fontClr = new Color(0,0,0);
		from.setCursor(cursor);
		from.setForeground(fontClr);
		panel.add(from);
		background.add(from);
		String fromArr[] = new String[]{" ", "Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail", "Bogra", "Joypurhat", "Naogaon", "Natore", "Nawabganj", "Pabna", "Rajshahi", "Sirajgonj", "Dinajpur", "Lalmonirhat", "Nilphamari", "Panchagarh", "Rangpur", "Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur", "Bandarban", "Brahmanbaria", "Chandpur", "Chittagong", "Comilla", "Cox's Bazar", "Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati", "Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga", "Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};
		cbFrom = new JComboBox(fromArr);
		cbFrom.setBounds(100,100,190,30);
		cbFromFont = new Font("Aptos (Body)",Font.PLAIN,18);
		cbFrom.setFont(cbFromFont);
		fontClr = new Color(0,0,0);
		cbFrom.setForeground(fontClr);
		panel.add(cbFrom);
		background.add(cbFrom);

		to = new JLabel("To City : ");
		to.setBounds(550,50,120,60);
		toFont = new Font("Cambria",Font.BOLD,20);
		to.setFont(toFont);
		fontClr = new Color(0,0,0);
		to.setForeground(fontClr);
		panel.add(to);
		background.add(to);
		String toArr[] = new String[]{" ", "Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail", "Bogra", "Joypurhat", "Naogaon", "Natore", "Nawabganj", "Pabna", "Rajshahi", "Sirajgonj", "Dinajpur", "Lalmonirhat", "Nilphamari", "Panchagarh", "Rangpur", "Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur", "Bandarban", "Brahmanbaria", "Chandpur", "Chittagong", "Comilla", "Cox's Bazar", "Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati", "Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga", "Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};
		cbTo = new JComboBox(toArr);
		cbTo.setBounds(550,100,190,30);
		cbTOFont = new Font("Aptos (Body)",Font.PLAIN,18);
		cbTo.setFont(cbTOFont);
		fontClr = new Color(0,0,0);
		cbTo.setForeground(fontClr);
		panel.add(cbTo);
		background.add(cbTo);

		date = new JLabel("Pick Up Date ");
		date.setBounds(480,210,200,30);
		dateFont = new Font ("Cambria",Font.BOLD,20);
		date.setFont(dateFont);
		fontClr = new Color(0,0,0);
		date.setForeground(fontClr);
		panel.add(date);
		background.add(date);
		dateTf = new JTextField();
		dateTf.setBounds(610,210,200,30);
		dateTfFont = new Font("Aptos (Body)",Font.PLAIN,18);
		dateTf.setFont(dateTfFont);
		fontClr = new Color(0,0,0);
		dateTf.setForeground(fontClr);
		panel.add(dateTf);
		background.add(dateTf);

		person = new JLabel("Person & Cost ");
		person.setBounds(100,220,200,30);
		personFont = new Font ("Cambria",Font.BOLD,20);
		person.setFont(personFont);
		fontClr = new Color(0,0,0);
		person.setForeground(fontClr);
		panel.add(person);
		background.add(person);

		per1 = new JRadioButton("1 Peraon 7500/- Taka ");
		per1.setBounds(180,270,300,30);
		per1Font = new Font ("Cambria",Font.BOLD,18);
		per1.setFont(per1Font);
		fontClr = new Color(0,0,0);
		per1.setForeground(fontClr);
		per1.setContentAreaFilled(false);
        per1.setBorderPainted(false);
		panel.add(per1);
		background.add(per1);

		per2 = new JRadioButton("2 Person 14000/- Taka ");
		per2.setBounds(180,320,300,30);
		per2Font = new Font ("Cambria",Font.BOLD,18);
		per2.setFont(per2Font);
		fontClr = new Color(0,0,0);
		per2.setForeground(fontClr);
		per2.setContentAreaFilled(false);
        per2.setBorderPainted(false);
		panel.add(per2);
		background.add(per2);

		per3 = new JRadioButton("3 Person 20000/- Taka ");
		per3.setBounds(180,370,300,30);
		per3Font = new Font ("Cambria",Font.BOLD,18);
		per3.setFont(per3Font);
		fontClr = new Color(0,0,0);
		per3.setForeground(fontClr);
		per3.setContentAreaFilled(false);
        per3.setBorderPainted(false);
		panel.add(per3);
		background.add(per3);

		per4 = new JRadioButton("4 Person 26000/- Taka ");
		per4.setBounds(180,420,300,30);
		per4Font = new Font ("Cambria",Font.BOLD,18);
		per4.setFont(per4Font);
		fontClr = new Color(0,0,0);
		per4.setForeground(fontClr);
		per4.setContentAreaFilled(false);
        per4.setBorderPainted(false);
		panel.add(per4);
		background.add(per4);

		bg = new ButtonGroup();
		bg.add(per1);
		bg.add(per2);
		bg.add(per3);
		bg.add(per4);

		time = new JLabel("Select Time ");
		time.setBounds(520,270,200,30);
		timeFont = new Font ("Cambria",Font.BOLD,20);
		time.setFont(timeFont);
		fontClr = new Color(0,0,0);
		time.setForeground(fontClr);
		panel.add(time);
		background.add(time);

		time1 = new JRadioButton("8 o'clock");
		time1.setBounds(610,310,100,30);
		time1Font = new Font ("Cambria",Font.BOLD,18);
		time1.setFont(time1Font);
		fontClr = new Color(0,0,0);
		time1.setForeground(fontClr);
		time1.setContentAreaFilled(false);
        time1.setBorderPainted(false);
		panel.add(time1);
		background.add(time1);

		time2 = new JRadioButton("12 o'clock");
		time2.setBounds(610,360,120,30);
		time2Font = new Font ("Cambria",Font.BOLD,18);
		time2.setFont(per2Font);
		fontClr = new Color(0,0,0);
		time2.setForeground(fontClr);
		time2.setContentAreaFilled(false);
        time2.setBorderPainted(false);
		panel.add(time2);
		background.add(time2);

		time3 = new JRadioButton("16 o'clock");
		time3.setBounds(610,410,120,30);
		time3Font = new Font ("Cambria",Font.BOLD,18);
		time3.setFont(time3Font);
		fontClr = new Color(0,0,0);
		time3.setForeground(fontClr);
		time3.setContentAreaFilled(false);
        time3.setBorderPainted(false);
		panel.add(time3);
		background.add(time3);

		bg1 = new ButtonGroup();
		bg1.add(time1);
		bg1.add(time2);
		bg1.add(time3);

		exit = new JButton("Exit");
		exit.setBounds(750,500,90,50);
		fontClr = new Color(0,0,0);
		exit.setForeground(fontClr);
		exitFont = new Font("Cambria",Font.BOLD,18);
		exit.setFont(exitFont);
		exit.setCursor(cursor);
		exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
		exit.addActionListener(this);
		panel.add(exit);
		background.add(exit);

		back = new JButton("Back");
		back.setBounds(680,500,90,50);
		fontClr = new Color(0,0,0);
		back.setForeground(fontClr);
		backFont = new Font("Cambria",Font.BOLD,18);
		back.setFont(backFont);
		back.addActionListener(this);
		back.setContentAreaFilled(false);
        back.setBorderPainted(false);
		back.setCursor(cursor);
		panel.add(back);
		background.add(back);

		payment = new JButton("Payment");
		payment.setBounds(400,470,110,40);
		fontClr = new Color(0,0,0);
		payment.setForeground(fontClr);
		paymentFont = new Font("Cambria",Font.BOLD,18);
		payment.setFont(paymentFont);
		payment.addActionListener(this);
		payment.setCursor(cursor);
		panel.add(payment);
		background.add(payment);

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
		else if(ae.getSource() == back){
			Login a1 = new Login();
			a1.setVisible(true);
			this.setVisible(false);
		}
	  /*else if(ae.getSource() == payment){
			Payment p1 = new Payment();
			p1.setVisible(true);
			this.setVisible(false);
		} */
		else if(ae.getSource() == payment){
			String s1;
			s1 = dateTf.getText(); 

			if(s1.isEmpty())
			{
				JOptionPane.showMessageDialog(this, "Please fill up all the information");
			}
			else{
			Payment p1 = new Payment();
			p1.setVisible(true);
			this.setVisible(false);
		    } 
	    }
    }
}
 