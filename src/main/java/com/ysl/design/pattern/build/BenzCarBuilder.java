package com.ysl.design.pattern.build;

import java.util.List;

/**
 * Created by shawn_lin on 2019/2/17.
 */
public class BenzCarBuilder extends CarBuilder{
    private BenzCarModel benzCarModel = new BenzCarModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzCarModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzCarModel;
    }
}
