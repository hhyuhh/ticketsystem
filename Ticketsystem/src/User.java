import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private int ID;
    private String name;
    private String grade;
    private String registrationTime;
    private int totalConsumption;
    private int frequency;
    private String phoneNumber;
    private String mailbox;
    private String accountNumber;
    private String password;


    public User() {
    }
    public User( String mailbox, String accountNumber, String password){
        this.mailbox = mailbox;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public User(int ID, String name, String grade, String registrationTime, int totalConsumption, int frequency, String phoneNumber, String mailbox, String accountNumber, String password) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.registrationTime = registrationTime;
        this.totalConsumption = totalConsumption;
        this.frequency = frequency;
        this.phoneNumber = phoneNumber;
        this.mailbox = mailbox;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public User(int ID, String name, String grade, String registrationTime, int totalConsumption, int frequency, String phoneNumber, String mailbox) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.registrationTime = registrationTime;
        this.totalConsumption = totalConsumption;
        this.frequency = frequency;
        this.phoneNumber = phoneNumber;
        this.mailbox = mailbox;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    public int getTotalConsumption() {
        return totalConsumption;
    }

    public void setTotalConsumption(int totalConsumption) {
        this.totalConsumption = totalConsumption;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //重置用户的密码
    public void rest_passwoed(int ID, ArrayList<User> use_date) {
        Scanner SC = new Scanner(System.in);
        System.out.println("请输入新密码：");
        String new_password = SC.next();
        for (int i = 0; i < use_date.size(); i++) {
            if (use_date.get(i).getID() == ID) {

                use_date.get(ID - 1).setPassword(new_password);
                System.out.println("密码修改成功！新密码为：    " + new_password);
            }
        }

    }

    //管理员删除用户信息的步骤
    public void delet_user(ArrayList<User> use_date) {
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入想要删除用户的ID：");
        int ID=SC.nextInt();
        int temp=0;
        for (int i = 0; i < use_date.size(); i++) {
        if(use_date.get(i).getID()==ID){
            temp=i;
            System.out.println("请再次确认是否要删除该用户的全部信息！（回答T或则F）");
            System.out.println("ID:"+use_date.get(temp).getID()+"  用户名："+use_date.get(temp).getName()+"   用户级别："+use_date.get(temp).getGrade()+" 注册时间："+use_date.get(temp).getRegistrationTime()+
                    "   总金额："+use_date.get(temp).getTotalConsumption()+"   消费次数："+use_date.get(temp).getFrequency()+" 手机号："+use_date.get(temp).getPhoneNumber()+
                    "邮箱："+use_date.get(temp).getMailbox());
            String temp2=SC.next();
            if(temp2.equals("T")){
                use_date.remove(temp);
                System.out.println("该用户信息已成功删除！");
            }
            else{
                System.out.println("该操作已撤回！");
            }
            break;
        }
        if(i==use_date.size()-1){
            System.out.println("没有找到ID为："+ID+"的用户");
        }

        }


    }
    //查询用户的信息
    public void search_user_Id(ArrayList<User> use_date){
        Scanner SC=new Scanner(System.in);

        System.out.println("请输入想要查询用户的ID：");
        int ID=SC.nextInt();
        int temp=0;
        for (int i = 0; i < use_date.size(); i++) {
            if(use_date.get(i).getID()==ID){
                temp=i;
                System.out.println("ID:"+use_date.get(temp).getID()+"  用户名："+use_date.get(temp).getName()+"   用户级别："+use_date.get(temp).getGrade()+" 注册时间："+use_date.get(temp).getRegistrationTime()+
                        "   总金额："+use_date.get(temp).getTotalConsumption()+"   消费次数："+use_date.get(temp).getFrequency()+" 手机号："+use_date.get(temp).getPhoneNumber()+
                        "邮箱："+use_date.get(temp).getMailbox());
                break;
            }
            if(i==use_date.size()-1){
                System.out.println("没有找到ID为："+ID+"的用户");
            }
        }


    }
    public void search_user_name(ArrayList<User> use_date){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入想要查询用户的用户名：");
        String name=SC.next();
        int temp=0;
        for (int i = 0; i < use_date.size(); i++) {
            if(use_date.get(i).getName().equals(name)){
                temp=i;
                System.out.println("ID:"+use_date.get(temp).getID()+"  用户名："+use_date.get(temp).getName()+"   用户级别："+use_date.get(temp).getGrade()+" 注册时间："+use_date.get(temp).getRegistrationTime()+
                        "   总金额："+use_date.get(temp).getTotalConsumption()+"   消费次数："+use_date.get(temp).getFrequency()+" 手机号："+use_date.get(temp).getPhoneNumber()+
                        "邮箱："+use_date.get(temp).getMailbox());
                break;
            }
            if(i==use_date.size()-1){
                System.out.println("没有找到name为："+name+"的用户");
            }
        }


    }

}
    /*哈希加密import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHashingExample {
    public static void main(String[] args) {
        String password = "my_password";
        String hashedPassword = hashPassword(password);

        System.out.println("Original password: " + password);
        System.out.println("Hashed password: " + hashedPassword);
    }

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());

            // 将字节数组转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }
}*/

