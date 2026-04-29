package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService7 {

    @EJB
    private HelperBeanA7 helperBeanA7;
    @EJB
    private HelperBeanB7 helperBeanB7;
    @EJB
    private HelperBeanC7 helperBeanC7;
    @EJB
    private HelperBeanD7 helperBeanD7;
    @EJB
    private HelperBeanE7 helperBeanE7;
    @EJB
    private HelperBeanF7 helperBeanF7;
    @EJB
    private HelperBeanG7 helperBeanG7;
    @EJB
    private HelperBeanH7 helperBeanH7;
    @EJB
    private HelperBeanI7 helperBeanI7;
    @EJB
    private HelperBeanJ7 helperBeanJ7;
    @EJB
    private HelperBeanK7 helperBeanK7;
    @EJB
    private HelperBeanL7 helperBeanL7;
    @EJB
    private HelperBeanM7 helperBeanM7;
    @EJB
    private HelperBeanN7 helperBeanN7;
    @EJB
    private HelperBeanO7 helperBeanO7;

    @EJB
    private StartupBean7 startupBean7;

    public String whoAmI() {
        return "i'm ExampleService7 "
        + helperBeanA7.identify()
        + helperBeanB7.identify()
        + helperBeanC7.identify()
        + helperBeanD7.identify()
        + helperBeanE7.identify()
        + helperBeanF7.identify()
        + helperBeanG7.identify()
        + helperBeanH7.identify()
        + helperBeanI7.identify()
        + helperBeanJ7.identify()
        + helperBeanK7.identify()
        + helperBeanL7.identify()
        + helperBeanM7.identify()
        + helperBeanN7.identify()
        + helperBeanO7.identify();
    }

}
