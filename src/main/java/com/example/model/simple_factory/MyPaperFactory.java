package com.example.model.simple_factory;

import com.example.model.strategy.api.PaperColor;
import com.example.model.strategy.impl.Black;
import com.example.model.strategy.impl.Blue;
import com.example.model.strategy.impl.Red;
import com.example.model.strategy.impl.White;

/**
 * @author Administrator
 */
public class MyPaperFactory {

    public static PaperColor getPaperColor(String name) {
        if ("black".equals(name)) {
            return new Black();
        } else if ("blue".equals(name)) {
            return new Blue();
        } else if ("red".equals(name)) {
            return new Red();
        } else if ("white".equals(name)) {
            return new White();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        PaperColor blue = getPaperColor("blue");
        blue.getPenColor();
    }
}
