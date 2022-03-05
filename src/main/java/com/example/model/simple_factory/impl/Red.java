package com.example.model.simple_factory.impl;

import com.example.model.simple_factory.api.PaperColor;

/**
 * @author Administrator
 */
public class Red implements PaperColor {

    @Override
    public void getPenColor() {
        System.out.println("红色笔！");
    }
}
