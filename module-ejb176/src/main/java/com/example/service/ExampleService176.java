package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService176 {

    @EJB
    private HelperBeanA176 helperBeanA176;
    @EJB
    private HelperBeanB176 helperBeanB176;
    @EJB
    private HelperBeanC176 helperBeanC176;
    @EJB
    private HelperBeanD176 helperBeanD176;
    @EJB
    private HelperBeanE176 helperBeanE176;
    @EJB
    private HelperBeanF176 helperBeanF176;
    @EJB
    private HelperBeanG176 helperBeanG176;
    @EJB
    private HelperBeanH176 helperBeanH176;
    @EJB
    private HelperBeanI176 helperBeanI176;
    @EJB
    private HelperBeanJ176 helperBeanJ176;
    @EJB
    private HelperBeanK176 helperBeanK176;
    @EJB
    private HelperBeanL176 helperBeanL176;
    @EJB
    private HelperBeanM176 helperBeanM176;
    @EJB
    private HelperBeanN176 helperBeanN176;
    @EJB
    private HelperBeanO176 helperBeanO176;

    @EJB
    private StartupBean176 startupBean176;

    public String whoAmI() {
        return "i'm ExampleService176 "
        + helperBeanA176.identify()
        + helperBeanB176.identify()
        + helperBeanC176.identify()
        + helperBeanD176.identify()
        + helperBeanE176.identify()
        + helperBeanF176.identify()
        + helperBeanG176.identify()
        + helperBeanH176.identify()
        + helperBeanI176.identify()
        + helperBeanJ176.identify()
        + helperBeanK176.identify()
        + helperBeanL176.identify()
        + helperBeanM176.identify()
        + helperBeanN176.identify()
        + helperBeanO176.identify();
    }

}
