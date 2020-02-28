package cn.tjm.test;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

/**
 * 子类继承父类，父类中的无参构造会默认执行，但是
 * 如果父类中有有参构造，并且子类调用了其有参构造
 * 方法，那么父类中的无参构造就不会执行了；
 * 父类中有静态方法，静态方法只能执行一次
 */
public class Tjm extends ParentClass {

    public Tjm(){
        super(43);
//        System.out.println("in democlass constructor");
//        printStatement();
    }

    public Tjm(int a){

//        System.out.println(" ");
    }

    public void printStatement(){
        System.out.println("just one line");
    }

    public static void main(String[] args) {
        new Tjm(4);
        System.out.println("-----------------");
        new Tjm();
    }



}
