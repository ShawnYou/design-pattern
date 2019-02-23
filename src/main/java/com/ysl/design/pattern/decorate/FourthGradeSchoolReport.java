package com.ysl.design.pattern.decorate;

/**
 * Created by shawn_lin on 2019/2/20.
 */
public class FourthGradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        System.out.println("成绩汇报");
    }

    @Override
    public void sign() {
        System.out.println("家长签名");
    }
}
