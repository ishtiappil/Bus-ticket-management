package Data;
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class Datas{
    private String user;
    private String pass;
    private String phone;
    private String email;
    private String nid;
 
    public Datas() {
 
    }
 
    public Datas(String user, String nid, String pass, String phone, String email) {
        this.user = user;
        this.nid = nid;
        this.pass = pass;
        this.phone = phone;
        this.email = email;
    }

	public Datas(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
 
    public void setUser(String user) {
        this.user = user;
    }
 
    public void setNid(String nid) {
        this.nid = nid;
    }
 
    public void setPass(String pass) {
        this.pass = pass;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getUser() {
        return this.user;
    }
 
    public String getNid() {
        return this.nid;
    }
 
    public String getPass() {
        return this.pass;
    }
 
    public String getPhone() {
        return this.phone;
    }
 
    public String getEmail() {
        return this.email;
    }
 
    public void addDatas() {
        File file = new File("./info.txt");
        try (FileWriter fwriter = new FileWriter(file, true)) {
            if (!checkDuplicate(this.user, this.phone, this.email)) {
                fwriter.write(getUser() + "\t");
                fwriter.write(getPass() + "\t");
                fwriter.write(getPhone() + "\t");
                fwriter.write(getEmail() + "\n");
            } else {
                System.out.println("User with same details already exists!");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
 
    public boolean checkDuplicate(String user, String phone, String email) {
        File file = new File("./info.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value[0].equals(user) || value[2].equals(phone) || value[3].equals(email)) {
                    return true; 
                }
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        return false; 
    }
 
    public boolean checkLogin(String user, String pass) {
        File file = new File("./info.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value[0].equals(user) && value[1].equals(pass)) {
                    return true; 
                }
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        return false; 
    }
}