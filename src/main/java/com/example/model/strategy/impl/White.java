package com.example.model.strategy.impl;

import com.example.model.strategy.api.PaperColor;

/**
 * @author Administrator
 */
public class White implements PaperColor {

    @Override
    public void getPenColor() {
        System.out.println("白色笔！");
    }
}
