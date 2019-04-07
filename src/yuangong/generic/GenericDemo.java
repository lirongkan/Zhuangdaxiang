/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GenericDemo
 * Author:   Administrator
 * Date:     2019-3-25 22:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package yuangong.generic;
import yuangong.*;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args){
        ArrayList<ChuShi> cs = new ArrayList<ChuShi>();
        ArrayList<FuWuYuan> fwy= new ArrayList<FuWuYuan>();
        ArrayList<JinLi> jl= new ArrayList<JinLi>();

        cs.add(new ChuShi("zhangsan", 10));
        cs.add(new ChuShi("lisi", 15));
        fwy.add(new FuWuYuan("AAA", 20));
        fwy.add(new FuWuYuan("BBB", 25));
        jl.add(new JinLi("lisi", 15,1212));
        jl.add(new JinLi("lisi", 15,121212));

        iterator(cs);
        iterator(fwy);
        iterator(jl);

    }
    public static void iterator(ArrayList<? extends Employee> array){
        Iterator<? extends Employee> it = array.iterator();
        while(it.hasNext()){
            Employee ee = it.next();
            ee.work();

        }

    }

}