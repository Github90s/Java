package com.javaBasic.part1_fields_constractor_static;

public class FieldsDemo {
/**
    定义变量的语法：  数据类型 变量名 ；
    变量根据在类中定义的位置不同，分为两大类：
        1.成员变量： 全局变量/字段，不要称之为属性（错误）；直接定义在类中，方法之外；
            1) 类成员变量：    使用static修饰的字段；
            2) 实例成员变量：  没有使用static修饰的字段
        2.局部变量： 变量除了成员变量，其他都是成员变量；
            1) 方法内部的变量；
            2) 方法的形参；
            3) 代码块中的变量；代码块就是指的 { }
 */
/**
    变量的初始值： 初始化才能在内存中开辟空间；
        1.成员变量：默认是有初始值的；（八大基本数据类型+引用数据类型）的默认值；
        2.局部变量：没有初始值，所以必须先初始化才能使用。
 */
/**
    变量的作用域：（根据定义的位置不同，决定了各自的作用域不同，为各自所处的{}为范围）
        1.成员变量：在整个类中都有效；
        2.局部变量：在自己的{}中有效
    成员变量可以先使用再定义。
    局部变量必须先初始化才能使用。
 */
/**
    各类型变量的区别：存在位置                   生命周期开始                  生命周期结束              内存中的位置
        1.类变量：   字段；static修饰；         当所在类的字节码加载到JVM       JVM停止                  方法区
        2.实例变量： 字段；无static修饰；        当创建所属类的对象时           GC回收                   堆
        3.局部变量： 方法形参、方法内、代码块；    代码执行到初始化变量的时候      所在方法/代码块结束        所在方法的栈帧中
 */
/**
    什么时候使用成员变量和局部变量？
        1.考虑变量的生命周期，这会影响内存开始；
        2.扩大变量作用域，不利于提高程序的高内聚；
        3.应当 尽量缩小变量的作用域，如此在内存中停留的时间越短，性能更高；
        4.不可动不动就使用static修饰，一般定义工具方法时、static方法需要访问的变量、变量属于类；此时使用static修饰；
        5.不可动不动就使用成员变量，因为存在着线程不安全的情况（同一间房住着三对夫妻，房间为内存，夫妻为线程），能使用局部变量尽量使用局部变量；
 */
}
