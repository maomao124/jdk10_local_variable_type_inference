package mao;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Project name(项目名称)：jdk10_local_variable_type_inference
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/1
 * Time(创建时间)： 18:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        String str = "abc";
        long l = 10L;
        boolean b = true;
        ArrayList<String> list = new ArrayList();
        Stream<String> stream = list.stream();
    }

}
