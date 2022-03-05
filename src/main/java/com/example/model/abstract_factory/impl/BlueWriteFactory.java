package com.example.model.abstract_factory.impl;

import com.example.model.abstract_factory.api.Write;

/**
 * @author Administrator
 */
public class BlueWriteFactory implements Write {

    @Override
    public void write() {
        System.out.println("用蓝色的笔写字");
    }
}
