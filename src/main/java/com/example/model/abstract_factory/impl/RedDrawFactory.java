package com.example.model.abstract_factory.impl;

import com.example.model.abstract_factory.api.Draw;

/**
 * @author Administrator
 */
public class RedDrawFactory implements Draw {

    @Override
    public void draw() {
        System.out.println("用红色的笔画画");
    }
}
