package com.ysl.design.pattern.decorate;

/**
 * Created by shawn_lin on 2019/2/20.
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportSort(){
        System.out.println("只汇报排名");
    }

    @Override
    public void report() {
        this.reportSort();
        super.report();
    }
}
