package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService4 {

    @EJB
    private HelperBeanA4 helperBeanA4;
    @EJB
    private HelperBeanB4 helperBeanB4;
    @EJB
    private HelperBeanC4 helperBeanC4;
    @EJB
    private HelperBeanD4 helperBeanD4;
    @EJB
    private HelperBeanE4 helperBeanE4;
    @EJB
    private HelperBeanF4 helperBeanF4;
    @EJB
    private HelperBeanG4 helperBeanG4;
    @EJB
    private HelperBeanH4 helperBeanH4;
    @EJB
    private HelperBeanI4 helperBeanI4;
    @EJB
    private HelperBeanJ4 helperBeanJ4;
    @EJB
    private HelperBeanK4 helperBeanK4;
    @EJB
    private HelperBeanL4 helperBeanL4;
    @EJB
    private HelperBeanM4 helperBeanM4;
    @EJB
    private HelperBeanN4 helperBeanN4;
    @EJB
    private HelperBeanO4 helperBeanO4;

    @EJB
    private StartupBean4 startupBean4;

    public String whoAmI() {
        return "i'm ExampleService4 "
        + helperBeanA4.identify()
        + helperBeanB4.identify()
        + helperBeanC4.identify()
        + helperBeanD4.identify()
        + helperBeanE4.identify()
        + helperBeanF4.identify()
        + helperBeanG4.identify()
        + helperBeanH4.identify()
        + helperBeanI4.identify()
        + helperBeanJ4.identify()
        + helperBeanK4.identify()
        + helperBeanL4.identify()
        + helperBeanM4.identify()
        + helperBeanN4.identify()
        + helperBeanO4.identify();
    }

}
