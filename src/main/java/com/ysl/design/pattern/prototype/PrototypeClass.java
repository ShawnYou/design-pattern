package com.ysl.design.pattern.prototype;

/**
 * Created by shawn_lin on 2019/4/7.
 */
public class PrototypeClass implements Cloneable{
    @Override
    protected PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass)super.clone();
        }catch (CloneNotSupportedException e){

        }
        return prototypeClass;
    }
}
