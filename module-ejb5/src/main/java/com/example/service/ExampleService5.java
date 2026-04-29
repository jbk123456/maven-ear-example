package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService5 {

    @EJB
    private HelperBeanA5 helperBeanA5;
    @EJB
    private HelperBeanB5 helperBeanB5;
    @EJB
    private HelperBeanC5 helperBeanC5;
    @EJB
    private HelperBeanD5 helperBeanD5;
    @EJB
    private HelperBeanE5 helperBeanE5;
    @EJB
    private HelperBeanF5 helperBeanF5;
    @EJB
    private HelperBeanG5 helperBeanG5;
    @EJB
    private HelperBeanH5 helperBeanH5;
    @EJB
    private HelperBeanI5 helperBeanI5;
    @EJB
    private HelperBeanJ5 helperBeanJ5;
    @EJB
    private HelperBeanK5 helperBeanK5;
    @EJB
    private HelperBeanL5 helperBeanL5;
    @EJB
    private HelperBeanM5 helperBeanM5;
    @EJB
    private HelperBeanN5 helperBeanN5;
    @EJB
    private HelperBeanO5 helperBeanO5;

    @EJB
    private StartupBean5 startupBean5;

    public String whoAmI() {
        return "i'm ExampleService5 "
        + helperBeanA5.identify()
        + helperBeanB5.identify()
        + helperBeanC5.identify()
        + helperBeanD5.identify()
        + helperBeanE5.identify()
        + helperBeanF5.identify()
        + helperBeanG5.identify()
        + helperBeanH5.identify()
        + helperBeanI5.identify()
        + helperBeanJ5.identify()
        + helperBeanK5.identify()
        + helperBeanL5.identify()
        + helperBeanM5.identify()
        + helperBeanN5.identify()
        + helperBeanO5.identify();
    }

}
