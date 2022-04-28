package com.wdf.dp.strategy;

/**
 * TODO
 *
 * @author li.chengzhen
 * @version 1.0
 * @date 2022/4/28 16:04
 **/
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}