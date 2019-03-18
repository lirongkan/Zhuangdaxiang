/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ZhuangDaXiang
 * Author:   Administrator
 * Date:     2019-3-18 11:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import sun.applet.Main;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-3-18
 * @since 1.0.0
 */
public class ZhuangDaXiang {
    public  static  void  main(String[] args){
        DaXiang a1 = new DaXiang();
        BingXiang b1 = new BingXiang();

        a1.setName("daxiang1");
        a1.setSize(1000);
        b1.setName("bingxiang1");
        b1.setSize(10);
        b1.open(b1);
        b1.zhuangDaXiang(a1);
        b1.close(b1);

    }

}