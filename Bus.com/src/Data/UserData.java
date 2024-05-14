package Data;
 
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
 
public class UserData extends JFrame implements MouseListener, ActionListener{
 
    private Container c;
    private ImageIcon icon,img;
    private JLabel label1,background;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    private Cursor cursor;
 
    private String[] column = { "User Name", "Password","NID", "Email", "Phone No" };
    private String[] rows = new String[7];
 
   public UserData() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("User Data");
        this.setBounds(250,90,900,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));
 
	   
	    img = new ImageIcon("Image/reg.jpg");
		background = new JLabel(img);
		background.setBounds(0,0,900,600);
		c.add(background);
 
    
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Cambria", Font.BOLD, 20);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
 
       
        cursor = new Cursor(Cursor.HAND_CURSOR);
 
       
        label1 = new JLabel();
        label1.setText("User Data");
        label1.setBounds(300, 10, 400, 80);
        label1.setFont(f1);
        c.add(label1);
		background.add(label1);
 
        
 
        btn2 = new JButton("Delete");
        btn2.setBounds(154, 418, 184, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.BLACK);
        c.add(btn2);
		background.add(btn2);
 
        btn3 = new JButton("Add");
        btn3.setBounds(542, 418, 184, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        c.add(btn3);
		background.add(btn3);
 
        btn4 = new JButton("Exit");
        btn4.setBounds(20, 520, 100, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
		btn4.setContentAreaFilled(false);
        btn4.setBorderPainted(false);
        btn4.setForeground(Color.BLACK);
		btn4.addActionListener(this);
        c.add(btn4);
		background.add(btn4);
 
        btn5 = new JButton("Back");
        btn5.setBounds(740, 520, 100, 50);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
		btn5.setContentAreaFilled(false);
        btn5.setBorderPainted(false);
        btn5.setForeground(Color.BLACK);
		btn5.addActionListener(this);
        c.add(btn5);
		background.add(btn5);
 
      
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
 
        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        //table.getColumnModel().getColumn(5).setPreferredWidth(220);
 
        scroll = new JScrollPane(table);
        scroll.setBounds(200, 110, 460, 240);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);
		background.add(scroll);
 
        //String file = ".\\Data\\user_data.txt";
		String file = "./info.txt";
        String temp = ".\\Data\\temp.txt";
 
        // To input data in the table
        try {
 
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();
 
            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); 
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); 
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); 
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(20); 
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(9); 
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); 
                    model.addRow(rows);
                }
            }
 
        } catch (Exception ex) {
            return;
        }
 
        

 
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
 
                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();
 
                    File oldFile = new File(file);
                    File newFile = new File(temp);
 
                    int q = 0;
 
                    try {
 
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();
 
                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }
 
                    try {
 
                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);
 
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
 
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();
 
                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);
 
                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();
 
                    } catch (Exception ex) {
                        System.out.print(ex);
                    }
 
                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);
 
                    setVisible(false);
                    UserData frame = new UserData();
                    frame.setVisible(true);
                }
 
            }
        });
    }
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == btn4){
			System.exit(0);
		}
		else if(ae.getSource() == btn5){
			AdminPanel ap1 = new AdminPanel();
			ap1.setVisible(true);
			this.setVisible(false);
		}
	}}
