package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService9 {

    @EJB
    private HelperBeanA9 helperBeanA9;
    @EJB
    private HelperBeanB9 helperBeanB9;
    @EJB
    private HelperBeanC9 helperBeanC9;
    @EJB
    private HelperBeanD9 helperBeanD9;
    @EJB
    private HelperBeanE9 helperBeanE9;
    @EJB
    private HelperBeanF9 helperBeanF9;
    @EJB
    private HelperBeanG9 helperBeanG9;
    @EJB
    private HelperBeanH9 helperBeanH9;
    @EJB
    private HelperBeanI9 helperBeanI9;
    @EJB
    private HelperBeanJ9 helperBeanJ9;
    @EJB
    private HelperBeanK9 helperBeanK9;
    @EJB
    private HelperBeanL9 helperBeanL9;
    @EJB
    private HelperBeanM9 helperBeanM9;
    @EJB
    private HelperBeanN9 helperBeanN9;
    @EJB
    private HelperBeanO9 helperBeanO9;

    @EJB
    private StartupBean9 startupBean9;

    public String whoAmI() {
        return "i'm ExampleService9 "
        + helperBeanA9.identify()
        + helperBeanB9.identify()
        + helperBeanC9.identify()
        + helperBeanD9.identify()
        + helperBeanE9.identify()
        + helperBeanF9.identify()
        + helperBeanG9.identify()
        + helperBeanH9.identify()
        + helperBeanI9.identify()
        + helperBeanJ9.identify()
        + helperBeanK9.identify()
        + helperBeanL9.identify()
        + helperBeanM9.identify()
        + helperBeanN9.identify()
        + helperBeanO9.identify();
    }

}
