package com.wdf.dp.strategy;

/**
 * TODO
 *
 * @author li.chengzhen
 * @version 1.0
 * @date 2022/4/28 16:03
 **/
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}