import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Administrator> adm_date = new ArrayList<>();
        ArrayList<User> use_date = new ArrayList<>();
        ArrayList<Movie> movies_date = new ArrayList<>();
        ArrayList<Manager> man_date=new ArrayList<>();
        ArrayList<Reception> rec_date=new ArrayList<>();
        ArrayList<movie_changci> changcis=new ArrayList<>();

        Administrator adm1 = new Administrator();
        movies_date.add(new Movie("a","a","a","喜剧","hhhh",120));
        movies_date.add(new Movie("b","b","b","悲剧","xxxx",123));
        movies_date.add(new Movie("c","c","c","爱情剧","llll",127));
        String[][] seats1 = new String[7][12];
        String[][] seats2 = new String[7][12];
        String[][] seats3 = new String[7][12];
        changcis.add(new movie_changci( "场次一","a","一号厅","7月12号",34,seats1));
        changcis.add(new movie_changci("场次一","b","二号厅","7月15号",23,seats2));
        changcis.add(new movie_changci("场次一","c","三号厅","7月11号",44,seats3));

        new Alldate().add_date(adm_date, adm1, "a", "a");
        Manager man1=new Manager("b","b");
        man_date.add(man1);
        use_date.add( new User(1,"a","金牌","2023.8.23",0,0,"123","123.@","b","c"));
        use_date.add( new User(2,"b","银牌","2023.8.23",0,0,"456","456.@","n","m"));
        use_date.add( new User(3,"c","铜牌","2023.8.23",0,0,"789","789.@","e","y"));
        Scanner SC = new Scanner(System.in);

        System.out.println("        =========电影售票系统=========");
        System.out.println("                请选择登录对象");
        System.out.println("                1、管理员");
        System.out.println("                2、经理");
        System.out.println("                3、前台");
        System.out.println("                4、用户");
        System.out.println("                请输入对应的数字：");
        String command = SC.next();
        show_main(command,adm_date,use_date,movies_date,man_date,changcis);

    }
    public static void show_main(String number2,ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movies_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        switch (number2) {
            case "1":
                adm_show(adm_date, use_date,movies_date,man_date,changcis);
                break;
            case "2":
                man_show(adm_date,use_date,movies_date,man_date,changcis);
                break;
            case "3":
                rec_show(adm_date,use_date,movies_date,man_date,changcis);
                break;
                case "4":
                    use_show(adm_date,use_date,movies_date,man_date,changcis);
                    break;
            default:
                anew1(adm_date,use_date,movies_date,man_date,changcis);

        }
    }
    public static void adm_show(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("        ======================");
        System.out.println("请输入管理员账号：");
        String current_accountNumber=SC.next();
        System.out.println("请输入管理员密码：");
        String current_passWord=SC.next();
        temp2_adm(current_accountNumber,current_passWord,a,b,c,d,e);
    }
    public static void temp2_adm(String current_accountNumber, String current_passWord,ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d
            ,ArrayList<movie_changci> e
    ){
        Scanner SC=new Scanner(System.in);
        if((current_passWord.equals(a.get(0).getPassword()))&&(current_accountNumber.equals(a.get(0).getAccountNumber()))) {
            System.out.println("                1、密码管理");
            System.out.println("                2、用户管理");
            System.out.println("                3、退出登录");

            temp3(a,b,c,d,e);
        }
        else{
            System.out.println("你输入的账号或密码错误，请重新输入！");
            adm_show(a,b,c,d,e);

        }

    }
    public static void temp3(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        String temp = SC.next();
        switch (temp) {
            case "1":
                System.out.println("                1、修改自身密码");
                System.out.println("                2、重置指定用户密码");
                System.out.println("                3、退出");
                String temp3=SC.next();
                switch(temp3){
                    case "1": new Alldate().changePassword(a);
                        adm_show(a,b,c,d,e);
                        break;
                    case "2":System.out.println("请输入用户的ID:");
                        int ID=SC.nextInt();
                        new User().rest_passwoed(ID,b);
                        System.out.println("                1、修改自身密码");
                        System.out.println("                2、重置指定用户密码");
                        System.out.println("                3、退出");
                        temp33(a,b,c,d,e);
                        break;
                    case "3":
                        temp2_adm(a.get(0).getAccountNumber(),a.get(0).getPassword(),a,b,c,d,e);
                        break;
                    default:
                        break;
                }

                break;
            case "2":
                temp2_adm8(a,b,c,d,e);

                break;
            case "3":
                System.out.println("        =========电影售票系统=========");
                System.out.println("                请选择登录对象");
                System.out.println("                1、管理员");
                System.out.println("                2、经理");
                System.out.println("                3、前台");
                System.out.println("                4、用户");
                System.out.println("                请输入对应的数字：");
                String command = SC.next();
                show_main(command,a,b,c,d,e);
                break;
            default:
                anew1(a,b,c,d,e);
        }
    }
    public static void temp33(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        String temp3=SC.next();
        switch(temp3){
            case "1": new Alldate().changePassword(a);
                adm_show(a,b,c,d,e);
                break;
            case "2":System.out.println("请输入用户的ID:");
                int ID=SC.nextInt();
                new User().rest_passwoed(ID,b);
                System.out.println("                1、修改自身密码");
                System.out.println("                2、重置指定用户密码");
                System.out.println("                3、退出");
                temp3(a,b,c,d,e);
                break;
            case "3":
                temp2_adm(a.get(0).getAccountNumber(),a.get(0).getPassword(),a,b,c,d,e);
                break;
            default:
                break;
        }

    }
    //管理员的用户管理界面
    public static void temp2_adm8(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("                1、列出所有用户信息");
        System.out.println("                2、删除用户信息");
        System.out.println("                3、查询用户信息");
        System.out.println("                4、退出");
        String temp4=SC.next();
        switch(temp4){
            case "1": new Alldate().show_all_users(b);
                System.out.println("        ======================");
                temp2_adm8(a,b,c,d,e);
                break;
            case "2":
                new User().delet_user(b);
                System.out.println("        ======================");
                temp2_adm8(a,b,c,d,e);
                break;
            case "3":
                System.out.println("请选择查询的方式：（用ID查询输入1，用用户名查询输入2）");
                int number =SC.nextInt();
                if(number==1) {
                    new User().search_user_Id(b);
                    temp2_adm8(a,b,c,d,e);
                }
                else{
                    new User().search_user_name(b);
                    temp2_adm8(a,b,c,d,e);
                }
                break;
            default:
                temp2_adm(a.get(0).getAccountNumber(),a.get(0).getPassword(),a,b,c,d,e);

        }
    }
    public static void man_show(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("        ======================");
        System.out.println("请输入经理账号：");
        String current_accountNumber=SC.next();
        System.out.println("请输入经理密码：");
        String current_passWord=SC.next();
        temp2_man(current_accountNumber,current_passWord,a,b,c,d,e);
    }
    public static void temp2_man(String current_accountNumber, String current_passWord,ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        if((current_passWord.equals(d.get(0).getPassword()))&&(current_accountNumber.equals(d.get(0).getAccountNumber()))) {
            System.out.println("                1、影片管理");
            System.out.println("                2、排片管理");
            System.out.println("                3、退出登录");
            temp9(a,b,c,d,e);

        }
        else{
            System.out.println("你输入的账号或密码错误，请重新输入！");
            man_show(a,b,c,d,e);

        }



    }
    public static void temp9(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e) {
        Scanner SC = new Scanner(System.in);
        String temp = SC.next();
        switch (temp) {
            case "1":
                System.out.println("                1、列出所有正在上映影片的信息");
                System.out.println("                2、添加即将上映的影片的信息");
                System.out.println("                3、修改影片的信息");
                System.out.println("                4、删除影片的信息");
                String temp3 = SC.next();
                switch (temp3) {
                    case "1":
                        fangall(a,b,c,d,e);
                        break;
                    case "2":
                        tianjia(a,b,c,d,e);
                        break;
                    case "3":
                        xiugai(a,b,c,d,e);
                        break;
                    default:
                        shanchu(a,b,c,d,e);
                }
                break;
            case "2":
                System.out.println("                1、增加场次");
                System.out.println("                2、修改场次");
                System.out.println("                3、删除场次");
                System.out.println("                4、列出所有场次信息");
                String temp4 = SC.next();
                switch (temp4) {
                    case "1":
                        add_changci(a,b,c,d,e);
                        break;
                    case "2":
                        xiugai(a,b,c,d,e);
                        break;
                    case "3":
                        sanchu(a,b,c,d,e);
                        break;
                    default:
                        showa(a,b,c,d,e);
                        ;
                }
                break;
            default:
                System.out.println("        =========电影售票系统=========");
                System.out.println("                请选择登录对象");
                System.out.println("                1、管理员");
                System.out.println("                2、经理");
                System.out.println("                3、前台");
                System.out.println("                4、用户");
                System.out.println("                请输入对应的数字：");
                String command = SC.next();
                show_main(command,a,b,c,d,e);
        }
    }
    //列出所有正在上映的影片
    public static void fangall(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        System.out.println("正在上映的电影有：");
        for (int i = 0; i < movie_date.size(); i++) {
            System.out.println("片名："+movie_date.get(i).getName()+" 导演："+movie_date.get(i).getDirector()+" 主演："+movie_date.get(i).getActor()+" 类型："+movie_date.get(i).getType()+
                    " 剧情简介："+movie_date.get(i).getSynopsis()+" 时长："+movie_date.get(i).getTime());
        }
        System.out.println("                1、影片管理");
        System.out.println("                2、排片管理");
        System.out.println("                3、退出登录");
        temp9(adm_date,use_date,movie_date,man_date,changcis);
    }
    //添加即将上映的电影信息
    public static void tianjia(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        System.out.println("请输入你要添加电影的相关信息：(按照片名，导演，主演，类型，剧情简介，时长的顺序输入)");
        Scanner SC=new Scanner(System.in);
        String a=SC.next();
        String b=SC.next();
        String c=SC.next();
        String d=SC.next();
        String e=SC.next();
        double f=SC.nextDouble();

        movie_date.add(new Movie(a,b,c,d,e,f));
        System.out.println("已添加");
        System.out.println("                1、影片管理");
        System.out.println("                2、排片管理");
        System.out.println("                3、退出登录");
        temp9(adm_date,use_date,movie_date,man_date,changcis);
    }
    //修改上映的影片的信息
    public  static void xiugai(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你要修改信息的电影的电影名:");
        String movie_name=SC.next();
        System.out.println("请选择你要修改的信息：1放映厅，2上映时间，3价格");
        int number=SC.nextInt();
        switch(number){
            case 1:

                for (int i = 0; i < changcis.size(); i++) {
                    if (changcis.get(i).getName().equals(movie_name)) {
                        System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                                " 价格：" + changcis.get(i).getPrice());

                    }
                }

                System.out.println("请输入你要修改的场次：");
                String hh=SC.next();
                System.out.println("请输入修改后的内容：");
                String tp=SC.next();
                for (int i1 = 0; i1 < changcis.size(); i1++) {
                    if(changcis.get(i1).getName().equals(movie_name)&&changcis.get(i1).getChangci().equals(hh)){
                        changcis.get(i1).setHall(tp);
                        System.out.println("修改成功！");
                        for (int i = 0; i < changcis.size(); i++) {
                            if(changcis.get(i).getName().equals(movie_name)) {
                                System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                                        " 价格：" + changcis.get(i).getPrice());
                            }
                        }
                        System.out.println("                1、影片管理");
                        System.out.println("                2、排片管理");
                        System.out.println("                3、退出登录");
                        temp9(adm_date,use_date,movie_date,man_date,changcis);
                    }
                }




                break;

            case 2:


                for (int i = 0; i < changcis.size(); i++) {
                    if (changcis.get(i).getName().equals(movie_name)) {
                        System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                                " 价格：" + changcis.get(i).getPrice());

                    }
                }

                System.out.println("请输入你要修改的场次：");
                String xx=SC.next();
                System.out.println("请输入修改后的内容：");
                String tp2=SC.next();
                for (int i1 = 0; i1 < changcis.size(); i1++) {
                    if(changcis.get(i1).getName().equals(movie_name)&&changcis.get(i1).getChangci().equals(xx)){
                        changcis.get(i1).setShow_time(tp2);
                        System.out.println("修改成功！");
                        for (int i = 0; i < changcis.size(); i++) {
                            if(changcis.get(i).getName().equals(movie_name)) {
                                System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                                        " 价格：" + changcis.get(i).getPrice());
                            }
                        }
                        System.out.println("                1、影片管理");
                        System.out.println("                2、排片管理");
                        System.out.println("                3、退出登录");
                        temp9(adm_date,use_date,movie_date,man_date,changcis);
                    }
                }




                break;
            default:

                for (int i = 0; i < changcis.size(); i++) {
                    if(changcis.get(i).getName().equals(movie_name)) {
                        System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                                " 价格：" + changcis.get(i).getPrice());
                    }
                }

                System.out.println("请输入你要修改的场次：");
                String hh2=SC.next();
                System.out.println("请输入修改后的内容：");
                double tp3=SC.nextDouble();
                for (int i1 = 0; i1 < changcis.size(); i1++) {
                    if(changcis.get(i1).getName().equals(movie_name)&&changcis.get(i1).getChangci().equals(hh2)){
                        changcis.get(i1).setPrice(tp3);
                        System.out.println("修改成功！");
                        for (int i = 0; i < changcis.size(); i++) {
                            if(changcis.get(i).getName().equals(movie_name)) {
                                System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                                        " 价格：" + changcis.get(i).getPrice());
                            }
                        }
                        System.out.println("                1、影片管理");
                        System.out.println("                2、排片管理");
                        System.out.println("                3、退出登录");
                        temp9(adm_date,use_date,movie_date,man_date,changcis);
                    }
                }




                break;
        }

    }
    //删除场次
    public static void sanchu(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你要删除场次的电影名：");
        String name=SC.next();
        for (int i = 0; i < changcis.size(); i++) {
            if (changcis.get(i).getName().equals(name)) {
                System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                        " 价格：" + changcis.get(i).getPrice());

            }
        }

        System.out.println("请输入你要删除的场次：");
        String hh=SC.next();
        for (int i = 0; i < changcis.size(); i++) {
            if(changcis.get(i).getChangci().equals(hh)&&changcis.get(i).getName().equals(name)){
                changcis.remove(i);
            }
        }
        System.out.println("该场次已成功删除！");
        for (int i = 0; i < changcis.size(); i++) {
            if (changcis.get(i).getName().equals(name)) {
                System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                        " 价格：" + changcis.get(i).getPrice());

            }
        }
        System.out.println("                1、影片管理");
        System.out.println("                2、排片管理");
        System.out.println("                3、退出登录");
        temp9(adm_date,use_date,movie_date,man_date,changcis);
    }
    //列出所有的场次信息
    public static void showa(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        for (int i = 0; i < changcis.size(); i++) {
            System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                    " 价格：" + changcis.get(i).getPrice());

        }
        System.out.println("                1、影片管理");
        System.out.println("                2、排片管理");
        System.out.println("                3、退出登录");
        temp9(adm_date,use_date,movie_date,man_date,changcis);

    }
    public static void rec_show(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("        ======================");
        System.out.println("请输入前台账号：");
        String current_accountNumber=SC.next();
        System.out.println("请输入前台密码：");
        String current_passWord=SC.next();
        temp2_qiantai(current_accountNumber,current_passWord,a,b,c,d,e);
    }
    public static void temp2_qiantai(String current_accountNumber, String current_passWord,ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e) {
        Scanner SC = new Scanner(System.in);
        if ((current_passWord.equals(new Reception().getPassword())) && (current_accountNumber.equals(new Reception().getAccountNumber()))) {
            System.out.println("                1、售片管理");
            System.out.println("                2、退出登录");
            temp9_qiantai(a, b, c, d, e);

        } else {
            System.out.println("你输入的账号或密码错误，请重新输入！");
            rec_show(a, b, c, d, e);

        }
    }
    public static void temp9_qiantai(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e) {
        Scanner SC = new Scanner(System.in);
        String temp = SC.next();
        switch (temp) {
            case "1":
                System.out.println("                1、列出所有正在上映影片的信息");
                System.out.println("                2、列出所有影片的场次信息");
                System.out.println("                3、列出指定电影和场次信息");
                System.out.println("                4、售票功能");
                System.out.println("                5、退出登录");
                String temp3 = SC.next();
                switch (temp3) {
                    case "1":
                        fangall_qiantai(a,b,c,d,e);
                        break;
                    case "2":
                        showa_qiantai(a,b,c,d,e);
                        break;
                    case "3":
                        show_zuowei(a,b,c,d,e);
                        break;
                    case "4":
                        shoupiao(a,b,c,d,e);
                    default:
                        System.out.println("                1、售片管理");
                        System.out.println("                2、退出登录");
                        temp9_qiantai(a, b, c, d, e);
                }
                break;

            default:
                System.out.println("        =========电影售票系统=========");
                System.out.println("                请选择登录对象");
                System.out.println("                1、管理员");
                System.out.println("                2、经理");
                System.out.println("                3、前台");
                System.out.println("                4、用户");
                System.out.println("                请输入对应的数字：");
                String command = SC.next();
                show_main(command,a,b,c,d,e);
        }
    }

    public static void fangall_qiantai(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        System.out.println("正在上映的电影有：");
        for (int i = 0; i < movie_date.size(); i++) {
            System.out.println("片名："+movie_date.get(i).getName()+" 导演："+movie_date.get(i).getDirector()+" 主演："+movie_date.get(i).getActor()+" 类型："+movie_date.get(i).getType()+
                    " 剧情简介："+movie_date.get(i).getSynopsis()+" 时长："+movie_date.get(i).getTime());
        }
        System.out.println("                1、售片管理");
        System.out.println("                2、退出登录");
        temp9_qiantai(adm_date,use_date,movie_date,man_date,changcis);
    }

    public static void showa_qiantai(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        for (int i = 0; i < changcis.size(); i++) {
            System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                    " 价格：" + changcis.get(i).getPrice());

        }
        System.out.println("                1、售片管理");
        System.out.println("                2、退出登录");
        temp9_qiantai(adm_date,use_date,movie_date,man_date,changcis);

    }
    public static void show_zuowei(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你要查询的电影名和场次");
        String name=SC.next();
        String changci=SC.next();
        for (int i = 0; i < e.size(); i++) {
            int temp=0;
            if(e.get(i).getName().equals(name)&&e.get(i).getChangci().equals(changci)){
                for (int i1 = 0; i1 < 7; i1++) {
                    for (int i2 = 0; i2 < 12; i2++) {
                        if(e.get(i).fun(e.get(i).getSeats(),i1,i2)=="o"){
                            temp++;
                        }
                    }
                }

                System.out.println("总座位有84个"+  "剩余座位数"+temp);
                for (int i1 = 0; i1 < 7; i1++) {
                    if(i1==0){
                        for(int k=0;k<=12;k++){
                            if(k==0){
                                System.out.print("   ");
                            }
                            else{
                                System.out.print(k+"   ");
                            }
                            if(k==12){
                                System.out.println();
                            }
                        }
                    }
                    for (int i2 = 0; i2 < 12; i2++) {

                        if(i2==0){
                            System.out.print((i1+1)+"  ");
                        }
                        System.out.print(e.get(i).fun(e.get(i).getSeats(), i1, i2)+"   ");
                        if(i2==11){
                            System.out.println();
                        }
                    }
                }
            }

        }
        System.out.println("                1、售片管理");
        System.out.println("                2、退出登录");
        temp9_qiantai(a,b,c,d,e);
    }

    public static void use_show(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("                1.登录");
        System.out.println("                2.注册");
        System.out.println("              3.忘记密码");
        System.out.println("              4.退出登录");
        int temp=SC.nextInt();
        switch(temp){
            case 1:
                denglu(a,b,c,d,e);
                break;
            case 2:
                zhuce(a,b,c,d,e);
                break;
            case 3:
                wangji(a,b,c,d,e);
                break;
            default:
                System.out.println("        =========电影售票系统=========");
                System.out.println("                请选择登录对象");
                System.out.println("                1、管理员");
                System.out.println("                2、经理");
                System.out.println("                3、前台");
                System.out.println("                4、用户");
                System.out.println("                请输入对应的数字：");
                String command = SC.next();
                show_main(command,a,b,c,d,e);

        }


    }
    public static void denglu(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你的账号：");
        String zh=SC.next();
        System.out.println("请输入你的密码：");
        String mm=SC.next();
        for (int i = 0; i < b.size(); i++) {
           if(b.get(i).getAccountNumber().equals(zh)&&b.get(i).getPassword().equals(mm)){
               System.out.println("                1.密码管理(修改自己的密码)");
               System.out.println("                2.购票");
               System.out.println("                3.退出登录");
               int temp3= SC.nextInt();
               switch(temp3){
                   case 1:

                   xiugai_yonghu(a,b,c,d,e);
                       break;
                   case 2:
                       System.out.println("                1.查询所有电影放映信息");
                       System.out.println("                2.查看指定电影的放映信息");
                       System.out.println("                3.选座购票");
                       System.out.println("                4.退出登录");
                       int temp4=SC.nextInt();
                       switch(temp4){
                           case 1:
                               fangall_yh(a,b,c,d,e);
                               break;
                           case 2:
                               show_zuowei_yh(a,b,c,d,e);
                               break;
                           case 3:
                               shoupiao_yh(a,b,c,d,e);
                               break;
                           default:
                           use_show(a,b,c,d,e);
                       }
                       break;
                   default:
                       use_show(a,b,c,d,e);

               }
               break;
           }
           if(i==b.size()-1){
               System.out.println("你输入的密码或账户错误！请重新输入：");
               denglu(a,b,c,d,e);
           }
        }
    }
    
    public static void xiugai_yonghu(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你的账号：");
        String zh=SC.next();
        System.out.println("请输入你的密码：");
        String mm=SC.next();
        for (int i = 0; i < b.size(); i++) {
            if(b.get(i).getAccountNumber().equals(zh)&&b.get(i).getPassword().equals(mm)){
                System.out.println("请输入你的新密码：");
                String mm2=SC.next();
                b.get(i).setPassword(mm2);
                System.out.println("密码修改成功！");
                use_show(a,b,c,d,e);
                break;
            }
            if(i==b.size()-1){
                System.out.println("你输入的账号或密码有误！请重新输入：");
                wangji(a,b,c,d,e);
            }

        }
    }
    public static void wangji(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你的账户：");
        String zh=SC.next();
        System.out.println("请输入的注册时所使用的邮箱：");
        String yx=SC.next();
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).getAccountNumber().equals(zh) && b.get(i).getMailbox().equals(yx)) {
                System.out.println("请输入你的新密码：");
                String mm2 = SC.next();
                b.get(i).setPassword(mm2);
                System.out.println("密码修改成功！");
                use_show(a, b, c, d, e);
                break;
            }
            if(i==b.size()-1){
                System.out.println("你输入的账号或邮箱有误！请重新输入：");
                wangji(a,b,c,d,e);
            }
        }
        

    }
    public static void zhuce(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你的账号：（用户名长度不少于5个字符）");
        String zh=SC.next();
        System.out.println("请输入你的密码：（密码长度大于8个字符，必须是大小写字母、数字和标点符号的组合）");
        String mm=SC.next();
        System.out.println("请输入的你的邮箱：");
        String yx=SC.next();
        b.add(new User(yx,zh,mm));
        System.out.println("账号注册成功！");
        use_show(a,b,c,d,e);
    }



        public static void shoupiao(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){

            Scanner SC=new Scanner(System.in);
            System.out.println("请输入你要查询的电影名和场次");
            String name=SC.next();
            String changci=SC.next();
            for (int i = 0; i < e.size(); i++) {
                int temp=0;
                if(e.get(i).getName().equals(name)&&e.get(i).getChangci().equals(changci)){
                    for (int i1 = 0; i1 < 7; i1++) {
                        for (int i2 = 0; i2 < 12; i2++) {
                            if(e.get(i).fun(e.get(i).getSeats(),i1,i2)=="o"){
                                temp++;
                            }
                        }
                    }

                    System.out.println("总座位有84个"+  "剩余座位数"+temp);
                    for (int i1 = 0; i1 < 7; i1++) {
                        if(i1==0){
                            for(int k=0;k<=12;k++){
                                if(k==0){
                                    System.out.print("   ");
                                }
                                else{
                                    System.out.print(k+"   ");
                                }
                                if(k==12){
                                    System.out.println();
                                }
                            }
                        }
                        for (int i2 = 0; i2 < 12; i2++) {

                            if(i2==0){
                                System.out.print((i1+1)+"  ");
                            }
                            System.out.print(e.get(i).fun(e.get(i).getSeats(), i1, i2)+"   ");
                            if(i2==11){
                                System.out.println();
                            }
                        }
                    }
                }

            }
            System.out.println("请输入你想买的票的行列：");
            int n=SC.nextInt();
            int m=SC.nextInt();
            for (int i = 0; i < e.size(); i++) {
                if(e.get(i).getName().equals(name)&&e.get(i).getChangci().equals(changci)){
                    e.get(i).getSeats()[n-1][m-1]="x";
                    int temp2_adm=0;
                    for (int i1 = 0; i1 < 7; i1++) {
                        for (int i2 = 0; i2 < 12; i2++) {
                            if(e.get(i).fun(e.get(i).getSeats(),i1,i2)=="o"){
                                temp2_adm++;
                            }
                        }
                    }

                    System.out.println("总座位有84个"+  "剩余座位数"+temp2_adm);
                    for (int i1 = 0; i1 < 7; i1++) {
                        if(i1==0){
                            for(int k=0;k<=12;k++){
                                if(k==0){
                                    System.out.print("   ");
                                }
                                else{
                                    System.out.print(k+"   ");
                                }
                                if(k==12){
                                    System.out.println();
                                }
                            }
                        }
                        for (int i2 = 0; i2 < 12; i2++) {

                            if(i2==0){
                                System.out.print((i1+1)+"  ");
                            }
                            System.out.print(e.get(i).fun(e.get(i).getSeats(), i1, i2)+"   ");
                            if(i2==11){
                                System.out.println();
                            }
                        }
                    }
                    System.out.println("恭喜你购票成功！");
                    }




}
            System.out.println("                1、售片管理");
            System.out.println("                2、退出登录");
            temp9_qiantai(a,b,c,d,e);

        }



    //第一步，选择对象是数字错误则退回上一步
    public static void anew1(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        System.out.println("你输入的数字有误，请重新输入：");

        Scanner SC=new Scanner(System.in);
        String temp=SC.next();
        show_main(temp,adm_date,use_date,movie_date,man_date,changcis);
    }


    //增加场次
    public static void add_changci(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你要增加场次的电影名：");
        String name=SC.next();
        System.out.println("请依次输入场次，放映厅，放映时间，价格");
        String changci=SC.next();
        String hall=SC.next();
        String show_time=SC.next();
        double price=SC.nextDouble();
        String[][] seats = new String[7][12];
        changcis.add(new movie_changci(changci,name,hall,show_time,price,seats));
        for (int i = 0; i < changcis.size(); i++) {
            if(changcis.get(i).getName().equals(name)){
                System.out.println("电影名："+changcis.get(i).getName()+" 序号：" + changcis.get(i).getChangci() + " 放映厅：" + changcis.get(i).getHall() + " 放映时间：" + changcis.get(i).getShow_time() +
                        " 价格：" + changcis.get(i).getPrice());
            }
        }
        System.out.println("添加成功！");
        System.out.println("                1、影片管理");
        System.out.println("                2、排片管理");
        System.out.println("                3、退出登录");
        temp9(adm_date,use_date,movie_date,man_date,changcis);

    }







                //删除影片的信息
    public static void shanchu(ArrayList<Administrator> adm_date,ArrayList<User> use_date,ArrayList<Movie> movie_date,ArrayList<Manager> man_date,ArrayList<movie_changci> changcis){
        Scanner SC= new Scanner(System.in);
        System.out.println("请输入你要删除的影片的名字：");
        String name=SC.next();
        for (int i = 0; i < movie_date.size(); i++) {
          if(name.equals(movie_date.get(i).getName())){
              System.out.println("请再次确认是否删除！（若要删除，请输入1。）)");
              int temp=SC.nextInt();
              if(temp==1){
                  movie_date.remove(i);
                  for (int i1 = 0; i1 < changcis.size(); i1++) {
                      if(changcis.get(i1).getName().equals(name)){
                          changcis.remove(i1);
                      }
                  }
                  System.out.println("已成功删除");
                  fangall(adm_date,use_date,movie_date,man_date,changcis);
                  temp9(adm_date,use_date,movie_date,man_date,changcis);
              }
              else{
                  System.out.println("                1、影片管理");
                  System.out.println("                2、排片管理");
                  System.out.println("                3、退出登录");
                  temp9(adm_date,use_date,movie_date,man_date,changcis);
              }
          }
          if(i==movie_date.size()-1){
              System.out.println("你输入的电影名不存在！");
              System.out.println("                1、影片管理");
              System.out.println("                2、排片管理");
              System.out.println("                3、退出登录");
              temp9(adm_date,use_date,movie_date,man_date,changcis);
          }
        }
    }
    public static void show_zuowei_yh(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){
        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你要查询的电影名和场次");
        String name=SC.next();
        String changci=SC.next();
        for (int i = 0; i < e.size(); i++) {
            int temp=0;
            if(e.get(i).getName().equals(name)&&e.get(i).getChangci().equals(changci)){
                for (int i1 = 0; i1 < 7; i1++) {
                    for (int i2 = 0; i2 < 12; i2++) {
                        if(e.get(i).fun(e.get(i).getSeats(),i1,i2)=="o"){
                            temp++;
                        }
                    }
                }

                System.out.println("总座位有84个"+  "剩余座位数"+temp);
                for (int i1 = 0; i1 < 7; i1++) {
                    if(i1==0){
                        for(int k=0;k<=12;k++){
                            if(k==0){
                                System.out.print("   ");
                            }
                            else{
                                System.out.print(k+"   ");
                            }
                            if(k==12){
                                System.out.println();
                            }
                        }
                    }
                    for (int i2 = 0; i2 < 12; i2++) {

                        if(i2==0){
                            System.out.print((i1+1)+"  ");
                        }
                        System.out.print(e.get(i).fun(e.get(i).getSeats(), i1, i2)+"   ");
                        if(i2==11){
                            System.out.println();
                        }
                    }
                }
            }

        }
        System.out.println("                1.查询所有电影放映信息");
        System.out.println("                2.查看指定电影的放映信息");
        System.out.println("                3.选座购票");
        System.out.println("                4.退出登录");
        int temp4=SC.nextInt();
        switch(temp4){
            case 1:
                fangall_yh(a,b,c,d,e);
                break;
            case 2:
                show_zuowei_yh(a,b,c,d,e);
                break;
            case 3:
                shoupiao_yh(a,b,c,d,e);
                break;
            default:
                use_show(a,b,c,d,e);
        }
    }
    public static void shoupiao_yh(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e){

        Scanner SC=new Scanner(System.in);
        System.out.println("请输入你要查询的电影名和场次");
        String name=SC.next();
        String changci=SC.next();
        for (int i = 0; i < e.size(); i++) {
            int temp=0;
            if(e.get(i).getName().equals(name)&&e.get(i).getChangci().equals(changci)){
                for (int i1 = 0; i1 < 7; i1++) {
                    for (int i2 = 0; i2 < 12; i2++) {
                        if(e.get(i).fun(e.get(i).getSeats(),i1,i2)=="o"){
                            temp++;
                        }
                    }
                }

                System.out.println("总座位有84个"+  "剩余座位数"+temp);
                for (int i1 = 0; i1 < 7; i1++) {
                    if(i1==0){
                        for(int k=0;k<=12;k++){
                            if(k==0){
                                System.out.print("   ");
                            }
                            else{
                                System.out.print(k+"   ");
                            }
                            if(k==12){
                                System.out.println();
                            }
                        }
                    }
                    for (int i2 = 0; i2 < 12; i2++) {

                        if(i2==0){
                            System.out.print((i1+1)+"  ");
                        }
                        System.out.print(e.get(i).fun(e.get(i).getSeats(), i1, i2)+"   ");
                        if(i2==11){
                            System.out.println();
                        }
                    }
                }
            }

        }
        System.out.println("请输入你想买的票的行列：");
        int n=SC.nextInt();
        int m=SC.nextInt();
        for (int i = 0; i < e.size(); i++) {
            if(e.get(i).getName().equals(name)&&e.get(i).getChangci().equals(changci)){
                e.get(i).getSeats()[n-1][m-1]="x";
                int temp2_adm=0;
                for (int i1 = 0; i1 < 7; i1++) {
                    for (int i2 = 0; i2 < 12; i2++) {
                        if(e.get(i).fun(e.get(i).getSeats(),i1,i2)=="o"){
                            temp2_adm++;
                        }
                    }
                }

                System.out.println("总座位有84个"+  "剩余座位数"+temp2_adm);
                for (int i1 = 0; i1 < 7; i1++) {
                    if(i1==0){
                        for(int k=0;k<=12;k++){
                            if(k==0){
                                System.out.print("   ");
                            }
                            else{
                                System.out.print(k+"   ");
                            }
                            if(k==12){
                                System.out.println();
                            }
                        }
                    }
                    for (int i2 = 0; i2 < 12; i2++) {

                        if(i2==0){
                            System.out.print((i1+1)+"  ");
                        }
                        System.out.print(e.get(i).fun(e.get(i).getSeats(), i1, i2)+"   ");
                        if(i2==11){
                            System.out.println();
                        }
                    }
                }
                System.out.println("恭喜你购票成功！");
            }




        }
        System.out.println("                1.查询所有电影放映信息");
        System.out.println("                2.查看指定电影的放映信息");
        System.out.println("                3.选座购票");
        System.out.println("                4.退出登录");
        int temp4=SC.nextInt();
        switch(temp4){
            case 1:
                fangall_yh(a,b,c,d,e);
                break;
            case 2:
                show_zuowei_yh(a,b,c,d,e);
                break;
            case 3:
                shoupiao_yh(a,b,c,d,e);
                break;
            default:
                use_show(a,b,c,d,e);
        }

    }

    public static void fangall_yh(ArrayList<Administrator> a,ArrayList<User> b,ArrayList<Movie> c,ArrayList<Manager> d,ArrayList<movie_changci> e) {
        Scanner SC=new Scanner(System.in);
        System.out.println("正在上映的电影有：");
        for (int i = 0; i < c.size(); i++) {
            System.out.println("片名：" + c.get(i).getName() + " 导演：" +c.get(i).getDirector() + " 主演：" +c.get(i).getActor() + " 类型：" + c.get(i).getType() +
                    " 剧情简介：" + c.get(i).getSynopsis() + " 时长：" + c.get(i).getTime());
        }
        System.out.println("                1.查询所有电影放映信息");
        System.out.println("                2.查看指定电影的放映信息");
        System.out.println("                3.选座购票");
        System.out.println("                4.退出登录");
        int temp4 = SC.nextInt();
        switch (temp4) {
            case 1:
                fangall_yh(a, b, c, d, e);
                break;
            case 2:
                show_zuowei_yh(a, b, c, d, e);
                break;
            case 3:
                shoupiao_yh(a, b, c, d, e);
                break;
            default:
                use_show(a, b, c, d, e);
        }
    }
}







