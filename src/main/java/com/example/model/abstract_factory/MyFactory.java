package com.example.model.abstract_factory;

import com.example.model.abstract_factory.api.DoFactory;
import com.example.model.abstract_factory.api.Draw;
import com.example.model.abstract_factory.api.Write;
import com.example.model.abstract_factory.impl.BlueDrawFactory;
import com.example.model.abstract_factory.impl.BlueWriteFactory;

/**
 * @author Administrator
 */
public class MyFactory implements DoFactory {

    @Override
    public Draw getDraw() {
        return new BlueDrawFactory();
    }

    @Override
    public Write getWrite() {
        return new BlueWriteFactory();
    }

    public static void main(String[] args) {
        MyFactory myFactory = new MyFactory();
        myFactory.getDraw().draw();
        myFactory.getWrite().write();
    }
}
