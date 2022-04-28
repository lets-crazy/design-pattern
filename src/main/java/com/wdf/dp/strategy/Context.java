package com.wdf.dp.strategy;

/**
 * TODO
 *
 * @author li.chengzhen
 * @version 1.0
 * @date 2022/4/28 16:04
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}