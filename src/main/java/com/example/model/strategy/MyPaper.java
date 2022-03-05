package com.example.model.strategy;

import com.example.model.strategy.api.PaperColor;
import com.example.model.strategy.impl.White;

/**
 * @author Administrator
 */
public class MyPaper {

    private PaperColor paperColor;

    public MyPaper(PaperColor paperColor) {
        this.paperColor = paperColor;
    }

    public PaperColor getPaperColor() {
        return this.paperColor;
    }

    public void choicePen() {
        this.paperColor.getPenColor();
    }

    public static void main(String[] args) {
        MyPaper myPaper = new MyPaper(new White());
        myPaper.choicePen();
    }
}
