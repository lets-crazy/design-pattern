package com.wdf.dp.strategy;

/**
 * 策略模式：就是把一个一个算法封装成类，Context 是一个使用了某种策略的类，主要实现同一接口，Strategy是活动的接口和实现了Strategy接口的是实体策略类-------
 * 具有拓展性，修改Context就可以了，如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
 *
 * @author li.chengzhen
 * @version 1.0
 * @date 2022/4/28 16:05
 **/
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

//        10 + 5 = 15
//        10 - 5 = 5
//        10 * 5 = 50
    }
}