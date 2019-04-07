package com.ysl.design.pattern.prototype.deepClone;


import com.ysl.design.pattern.prototype.shallowClone.Thing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn_lin on 2019/4/7.
 */
public class DeepThing implements Cloneable {
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    protected DeepThing clone(){
        DeepThing thing = null;
        try {
            thing = (DeepThing)super.clone();
            this.list = (ArrayList<String>)this.list.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value){
        this.list.add(value);
    }

    public List<String> getValue(){
        return this.list;
    }
}
