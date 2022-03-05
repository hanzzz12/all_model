package com.example.model.strategy.impl;

import com.example.model.strategy.api.PaperColor;

/**
 * @author Administrator
 */
public class Blue implements PaperColor {

    @Override
    public void getPenColor() {
        System.out.println("蓝色笔！");
    }
}
