package com.ysl.design.pattern.build;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn_lin on 2019/2/17.
 */
public class Clent {
    public static void main(String[] args) {
        //生产宝马类型车
        List<String> bmwType = new ArrayList<String>();
        bmwType.add("start");
        bmwType.add("alarm");
        BmwCarBuilder bmwCarBuilder = new BmwCarBuilder();
        bmwCarBuilder.setSequence(bmwType);
        BmwCarModel bmwCarModel = (BmwCarModel)bmwCarBuilder.getCarModel();
        bmwCarModel.run();

        //生产奔驰类型车
        List<String> benzType = new ArrayList<String>();
        benzType.add("alarm");
        benzType.add("start");
        BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
        benzCarBuilder.setSequence(benzType);
        BenzCarModel benzCarModel = (BenzCarModel) benzCarBuilder.getCarModel();
        benzCarModel.run();
    }
}
