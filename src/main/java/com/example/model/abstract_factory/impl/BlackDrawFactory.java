package com.example.model.abstract_factory.impl;

import com.example.model.abstract_factory.api.Draw;
import com.example.model.abstract_factory.api.DoFactory;

/**
 * @author Administrator
 */
public class BlackDrawFactory implements Draw {

    @Override
    public void draw() {
        System.out.println("用黑色的笔画画");
    }
}
