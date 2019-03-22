/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DateDemo
 * Author:   Administrator
 * Date:     2019-3-21 22:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(1212232322111L);
        System.out.println(date1);
        date1.setTime(1212232322111L);
        System.out.println(date1);
        System.out.println(date1.getTime());
    }

}