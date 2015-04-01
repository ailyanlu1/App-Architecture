package com.android.app.framework.controller;

/**
 * 用于UI的mvp模式中的m
 * 在model中可以发起任何的cmd任务
 *
 *
 * Created by frodo on 2015/4/1.
 */
public interface IModel extends IController {
    public static String MODEL_UNKNOWN = "model_unknown";

    String name();

    MainController getMainController();
}