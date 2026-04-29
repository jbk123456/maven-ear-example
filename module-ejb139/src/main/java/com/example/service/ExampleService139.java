package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService139 {

    @EJB
    private HelperBeanA139 helperBeanA139;
    @EJB
    private HelperBeanB139 helperBeanB139;
    @EJB
    private HelperBeanC139 helperBeanC139;
    @EJB
    private HelperBeanD139 helperBeanD139;
    @EJB
    private HelperBeanE139 helperBeanE139;
    @EJB
    private HelperBeanF139 helperBeanF139;
    @EJB
    private HelperBeanG139 helperBeanG139;
    @EJB
    private HelperBeanH139 helperBeanH139;
    @EJB
    private HelperBeanI139 helperBeanI139;
    @EJB
    private HelperBeanJ139 helperBeanJ139;
    @EJB
    private HelperBeanK139 helperBeanK139;
    @EJB
    private HelperBeanL139 helperBeanL139;
    @EJB
    private HelperBeanM139 helperBeanM139;
    @EJB
    private HelperBeanN139 helperBeanN139;
    @EJB
    private HelperBeanO139 helperBeanO139;

    @EJB
    private StartupBean139 startupBean139;

    public String whoAmI() {
        return "i'm ExampleService139 "
        + helperBeanA139.identify()
        + helperBeanB139.identify()
        + helperBeanC139.identify()
        + helperBeanD139.identify()
        + helperBeanE139.identify()
        + helperBeanF139.identify()
        + helperBeanG139.identify()
        + helperBeanH139.identify()
        + helperBeanI139.identify()
        + helperBeanJ139.identify()
        + helperBeanK139.identify()
        + helperBeanL139.identify()
        + helperBeanM139.identify()
        + helperBeanN139.identify()
        + helperBeanO139.identify();
    }

}
