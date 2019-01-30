package com.example.demo;

import java.math.BigDecimal;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        double xx = 18.67;
        int size = 34;
        BigDecimal b1 = new BigDecimal(Double.toString(xx));
        BigDecimal b2 = new BigDecimal(Integer.toString(size));
        double perAnyCellWholeMROIntegrity = b1.divide(b2, 2,  BigDecimal.ROUND_HALF_UP).doubleValue();// TODO 需确认是否保留两位小数
        System.out.println(perAnyCellWholeMROIntegrity);
    }
}
