package com.example.model.abstract_factory.impl;

import com.example.model.abstract_factory.api.Draw;

/**
 * @author Administrator
 */
public class BlueDrawFactory implements Draw {

    @Override
    public void draw() {
        System.out.println("用蓝色的笔画画");
    }
}
