package com.ysl.design.pattern.decorate;

/**
 * Created by shawn_lin on 2019/2/20.
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport report;

        report = new FourthGradeSchoolReport();

        report = new HignScoreDecorator(report);

        report = new SortDecorator(report);

        report.report();

        report.sign();

    }
}
