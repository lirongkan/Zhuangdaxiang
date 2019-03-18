/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BingXiang
 * Author:   Administrator
 * Date:     2019-3-18 11:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-3-18
 * @since 1.0.0
 */
public class BingXiang {
    private String name;
    private  int size;

    void setName(String name){
        this.name= name;
    }
    void  setSize(int size) {
        this.size=size;
    }
    String getName(String name){
        return  name;

    }
    int getSize(int size){
        return size;
    }
    void open(BingXiang bbb){
        System.out.println(this.name + " is open!");
    }

    void zhuangDaXiang(DaXiang a){
        this.name = a.getName();
        this.size = a.getSize();
        System.out.println(this.name +"  "+ this.size + " 被装进去了！");



    }

    void close(BingXiang b){
        System.out.println(this.name + " is close!");
    }
}