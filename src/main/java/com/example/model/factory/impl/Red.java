package com.example.model.factory.impl;

import com.example.model.factory.api.PaperColor;

/**
 * @author Administrator
 */
public class Red implements PaperColor {

    @Override
    public void getPenColor() {
        System.out.println("红色笔！");
    }
}
