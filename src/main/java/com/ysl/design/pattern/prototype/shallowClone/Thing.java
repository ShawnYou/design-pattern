package com.ysl.design.pattern.prototype.shallowClone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn_lin on 2019/4/7.
 */
public class Thing implements Cloneable {
    private List<String> list = new ArrayList<String>();

    @Override
    protected Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
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
