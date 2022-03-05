package com.example.model.abstract_factory.api;

/**
 * @author Administrator
 */
public interface DoFactory {

    /**
     * 获得画画接口
     *
     * @return
     */
    Draw getDraw();

    /**
     * 获得写字接口
     *
     * @return
     */
    Write getWrite();


}
