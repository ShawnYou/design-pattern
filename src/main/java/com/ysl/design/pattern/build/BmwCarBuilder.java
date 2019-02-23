package com.ysl.design.pattern.build;

import java.util.List;

/**
 * Created by shawn_lin on 2019/2/17.
 */
public class BmwCarBuilder extends CarBuilder {
    private BmwCarModel bmwCarModel = new BmwCarModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmwCarModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwCarModel;
    }
}
