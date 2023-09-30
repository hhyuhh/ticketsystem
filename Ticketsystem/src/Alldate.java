import java.util.ArrayList;
import java.util.Scanner;

public class Alldate {
   /* ArrayList<Administrator> adm_date = new ArrayList<>();
    ArrayList<User> use_date=new ArrayList<>();
    ArrayList<Movie> movies_date=new ArrayList<>();*/
    /*public void initialize(){

        use_date.add( new User(1,"a","金牌","2023.8.23",0,0,"123","123.@"));
        use_date.add( new User(2,"b","银牌","2023.8.23",0,0,"456","456.@"));
        use_date.add( new User(3,"c","铜牌","2023.8.23",0,0,"789","789.@"));
    }*/

    public void add_date( ArrayList<Administrator> adm_date,Administrator administrator,String accountNumber,String password ){
        adm_date.add(administrator);
        administrator.setAccountNumber(accountNumber);
        administrator.setPassword(password);
    }
    //添加用户信息到集合中
    public void add3(ArrayList<User> use_date,User user){
        use_date.add(user);

    }
    public  Administrator getDate(ArrayList<Administrator> adm_date,int i){
        return adm_date.get(i);
    }
    public   void changePassword(ArrayList<Administrator> a){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的新密码：");
        String new_password=sc.next();
        a.get(0).setPassword(new_password);
        System.out.println("你的密码修改成功！   新密码为："+a.get(0).getPassword());
        System.out.println("密码已经修改成功，请重新登录！");

    }
    public void show_all_users(ArrayList<User> use_date){
        for (int i = 0; i < use_date.size(); i++) {
            System.out.println("ID:"+use_date.get(i).getID()+"  用户名："+use_date.get(i).getName()+"   用户级别："+use_date.get(i).getGrade()+" 注册时间："+use_date.get(i).getRegistrationTime()+
                    "   总金额："+use_date.get(i).getTotalConsumption()+"   消费次数："+use_date.get(i).getFrequency()+" 手机号："+use_date.get(i).getPhoneNumber()+
                        "邮箱："+use_date.get(i).getMailbox());
        }


    }

}
