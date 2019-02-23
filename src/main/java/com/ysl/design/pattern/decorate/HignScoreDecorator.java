package com.ysl.design.pattern.decorate;

/**
 * Created by shawn_lin on 2019/2/20.
 */
public class HignScoreDecorator extends Decorator {

    public HignScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHignScore(){
        System.out.println("只汇报最高的分数");
    }

    @Override
    public void report() {
        reportHignScore();
        super.report();
    }
}
