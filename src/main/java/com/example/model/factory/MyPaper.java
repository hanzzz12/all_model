package com.example.model.factory;

import com.example.model.factory.impl.BlueFactory;
import com.example.model.strategy.api.PaperColor;
import com.example.model.strategy.impl.Black;
import com.example.model.strategy.impl.Blue;
import com.example.model.strategy.impl.Red;
import com.example.model.strategy.impl.White;

/**
 * @author Administrator
 */
public class MyPaper {

    public static void main(String[] args) {

        BlueFactory blueFactory = new BlueFactory();
        blueFactory.getPaperColor().getPenColor();
    }
}
