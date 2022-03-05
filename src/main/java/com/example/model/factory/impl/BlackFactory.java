package com.example.model.factory.impl;

import com.example.model.factory.api.PaperColor;
import com.example.model.factory.api.PaperColorFactory;

/**
 * @author Administrator
 */
public class BlackFactory implements PaperColorFactory {

    @Override
    public PaperColor getPaperColor() {
        return new Black();
    }
}
