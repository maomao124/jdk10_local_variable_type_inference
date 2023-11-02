package mao;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Project name(项目名称)：jdk10_local_variable_type_inference
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/1
 * Time(创建时间)： 18:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        var str = "abc";
        var l = 10L;
        var b = true;
        var list = new ArrayList();
        var stream = list.stream();
        System.out.println(str);
        System.out.println(l);
        System.out.println(b);
        System.out.println(list);
        System.out.println(stream);
    }
}
