package gjp.view;

import gjp.controller.ZhangWuController;
import gjp.domain.ZhangWu;

import java.util.List;
import java.util.Scanner;

/**
 * 创建controller类对象
 *
 * @author: lrk
 * 2019/4/5 12:37
 */
public class MainView {
    private ZhangWuController controller = new ZhangWuController();
    public void run(){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------记账软件----------------");
            System.out.println("1.添加事物 2.编辑账务 3.删除事物 4.查询账务 5.退出系统");
            System.out.println("请输入要操作的功能序号[1-5]");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                //选择添加账务
                    addZhangWu();
                    break;
                case 2:
                //选择编辑账务
                    editZhangHu();
                    break;
                case 3:
                //选择删除账务
                    deleteZhangWu();
                    break;
                case 4:
                //选择查询账务
                    selectZhangWu();
                    break;
                case 5:
                //选择添加账务
                    System.exit(0);
                    break;
                    default:


            }
        }
    }
    public void selectZhangWu(){
        System.out.println("1查询所有  2条件查询");
        Scanner sc =new Scanner(System.in);
        int choose2 = sc.nextInt();
        switch (choose2){
            case 1:
                selectAll();
                break;
            case 2:
                select();
                break;
            default:

        }
    }
    public void select(){
        System.out.println("选择条件查询,输入日期格式XXXX-XX-XX");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入开始日期:");
        String startDate = sc.nextLine();
        System.out.print("请输入结果日期:");
        String endDate = sc.nextLine();
        List<ZhangWu> list = controller.select(startDate,endDate);
        if(list != null) {
            print(list);
        }else{
            System.out.println("没有查询到数据！");
        }
    }


    public void selectAll(){
      List<ZhangWu> list =   controller.selectAll();
      if(list != null) {
          print(list);
      }else{
          System.out.println("查询所有失败！");
      }
    }

    private void print(List<ZhangWu> list) {
        System.out.println("ID\t\t类别\t\t账户\t\t金额\t\t时间\t\t说明");
        for (ZhangWu zw : list) {
            //遍历集合,结果输出控制台
            System.out.println(zw.getZwid() + "\t\t" + zw.getFlname() + "\t\t" + zw.getZhanghu() + "\t\t" +
                    zw.getMoney() + "\t\t" + zw.getCreatetime() + "\t" + zw.getDescription());

        }
    }

    public void addZhangWu() {
        System.out.println("选择的添加账务功能，请输入以下内容:");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分类名称:");
        String flname = sc.next();
        System.out.println("输入金额:");
        double money = sc.nextDouble();
        System.out.println("输入账户:");
        String zhanghu = sc.next();
        System.out.println("输入日期：格式XXXX-XX-xx");
        String createtime = sc.next();
        System.out.println("输入具体描述:");
        String description = sc.next();
        ZhangWu zw = new ZhangWu(0,flname,money,zhanghu,createtime,description);
        controller.addZhangWu(zw);
        System.out.println("账务添加成功！");
    }

    public void editZhangHu(){
        selectAll();
        System.out.println("选择的是编辑功能，请输入数据:");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入ID:");
        int zwid = sc.nextInt();
        System.out.println("输入分类名称:");
        String flname = sc.next();
        System.out.println("输入金额:");
        double money = sc.nextDouble();
        System.out.println("输入账户:");
        String zhanghu = sc.next();
        System.out.println("输入日期：格式XXXX-XX-xx");
        String createtime = sc.next();
        System.out.println("输入具体描述:");
        String description = sc.next();
        //将用户输入的数据，封装到ZhangWu对象中
        //用户输入的ID，必须封装到到对象中
        ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
        //调用controller层中的方法，实现编辑账务
        controller.editZhangWu(zw);
        System.out.println("账务编辑成功!");
    }
    public void deleteZhangWu() {
        //调用查询所有账务数据的功能，显示出来
        //看到所有数据，从中选择一项，进行修改
        selectAll();
        System.out.println("选择的是删除功能，请输入序号即可");
        int zwid = new Scanner(System.in).nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.print("确定删除？(y/n)");

        if(new Scanner(System.in).nextLine().equals("y")){
        //调用控制层方法，传递主键id即可
        controller.deleteZhangWu(zwid);
        System.out.println("删除账务成功!");
        }else{
            System.out.println("删除失败！");
        }
    }


}
