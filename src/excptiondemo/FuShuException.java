/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FuShuException
 * Author:   Administrator
 * Date:     2019-3-27 19:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package excptiondemo;

public class FuShuException extends RuntimeException {
    public FuShuException(){}
    public FuShuException(String s){
        super(s);
    }

}