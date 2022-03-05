package com.example.model.abstract_factory.impl;

import com.example.model.abstract_factory.api.Write;

/**
 * @author Administrator
 */
public class BlackWriteFactory implements Write {

    @Override
    public void write() {
        System.out.println("用黑色的笔写字");
    }
}
