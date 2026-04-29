package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService6 {

    @EJB
    private HelperBeanA6 helperBeanA6;
    @EJB
    private HelperBeanB6 helperBeanB6;
    @EJB
    private HelperBeanC6 helperBeanC6;
    @EJB
    private HelperBeanD6 helperBeanD6;
    @EJB
    private HelperBeanE6 helperBeanE6;
    @EJB
    private HelperBeanF6 helperBeanF6;
    @EJB
    private HelperBeanG6 helperBeanG6;
    @EJB
    private HelperBeanH6 helperBeanH6;
    @EJB
    private HelperBeanI6 helperBeanI6;
    @EJB
    private HelperBeanJ6 helperBeanJ6;
    @EJB
    private HelperBeanK6 helperBeanK6;
    @EJB
    private HelperBeanL6 helperBeanL6;
    @EJB
    private HelperBeanM6 helperBeanM6;
    @EJB
    private HelperBeanN6 helperBeanN6;
    @EJB
    private HelperBeanO6 helperBeanO6;

    @EJB
    private StartupBean6 startupBean6;

    public String whoAmI() {
        return "i'm ExampleService6 "
        + helperBeanA6.identify()
        + helperBeanB6.identify()
        + helperBeanC6.identify()
        + helperBeanD6.identify()
        + helperBeanE6.identify()
        + helperBeanF6.identify()
        + helperBeanG6.identify()
        + helperBeanH6.identify()
        + helperBeanI6.identify()
        + helperBeanJ6.identify()
        + helperBeanK6.identify()
        + helperBeanL6.identify()
        + helperBeanM6.identify()
        + helperBeanN6.identify()
        + helperBeanO6.identify();
    }

}
