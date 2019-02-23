package com.ysl.design.pattern.decorate;

/**
 * Created by shawn_lin on 2019/2/20.
 */
public abstract class Decorator extends SchoolReport{

    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign() {
        this.schoolReport.sign();
    }
}
