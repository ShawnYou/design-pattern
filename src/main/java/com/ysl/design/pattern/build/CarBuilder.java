package com.ysl.design.pattern.build;

import java.util.List;

/**
 * Created by shawn_lin on 2019/2/17.
 *   汽车建造者
 */
public abstract class CarBuilder {

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}
