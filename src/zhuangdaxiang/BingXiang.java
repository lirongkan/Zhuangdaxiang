package zhuangdaxiang; /**
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
 * @date 2019-3-18
 * @since 1.0.0
 */
public class BingXiang {
    private String name ;
    private  int size;

    void setName(String name){
        this.name= name;
    }
    void  setSize(int size) {
        this.size=size;
    }
    String getName(){
        return  name;

    }
    private int getSize(){
        return size;
    }
    void open(){
        System.out.println(this.getName() + "   " +this.getSize()  +"+ is open!");
    }

    void zhuangDaXiang(DaXiang bbb){
      /*  this.name = a.getName();//因为name，private是私有类型，不可再赋值，因此直接调用get函数解决
        this.size = a.getSize();*/

        System.out.println(bbb.getName() +"  "+ bbb.getSize() + " 被装进去了！");

    }

    void close(BingXiang b){
        System.out.println(b.getName() + " is close!");
    }
}