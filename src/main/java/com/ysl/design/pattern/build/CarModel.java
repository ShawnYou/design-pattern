package com.ysl.design.pattern.build;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn_lin on 2019/2/17.
 *
 *  汽车模板
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        sequence.forEach(seq->{
            if(seq.equalsIgnoreCase("start")){ this.start();}

            if(seq.equalsIgnoreCase("stop")){ this.stop();}

            if(seq.equalsIgnoreCase("alarm")){ this.alarm();}

            if(seq.equalsIgnoreCase("engineBoom")){ this.engineBoom();}
        });
    }

    final public void setSequence(List<String> sequence){
        this.sequence = sequence;
    }

}
