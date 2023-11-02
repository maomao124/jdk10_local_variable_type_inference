

# JDK10

## 局部变量类型推断

### 概述

很多人抱怨Java是一种强类型，需要引入大量的样板代码。很明显类型声明往往被认为是不必要的。JDK10之前的Java代码中，声明一个变量是非常繁琐的

```java
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
```



许多流行的编程语言都已经支持某种形式的局部变量类型推断，如JS(var)



**JDK10 可以使用 var 进行局部变量类型推断**



### 使用

```java
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
```





### 局限性

不能使用的场景：

* 成员变量
* 方法参数
* 方法返回类型





### 注意事项

* var 并不是一个关键字，可以作为标识符，这意味着可以将一个变量、方法、包名写成var 。不过一般情况下不会有人这么写的，因为这本身就违反了普遍的命名规范
* var声明变量的时候必须赋值、不能用于声明多个变量的情况



