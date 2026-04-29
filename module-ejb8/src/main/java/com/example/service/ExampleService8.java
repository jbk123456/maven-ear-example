package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService8 {

    @EJB
    private HelperBeanA8 helperBeanA8;
    @EJB
    private HelperBeanB8 helperBeanB8;
    @EJB
    private HelperBeanC8 helperBeanC8;
    @EJB
    private HelperBeanD8 helperBeanD8;
    @EJB
    private HelperBeanE8 helperBeanE8;
    @EJB
    private HelperBeanF8 helperBeanF8;
    @EJB
    private HelperBeanG8 helperBeanG8;
    @EJB
    private HelperBeanH8 helperBeanH8;
    @EJB
    private HelperBeanI8 helperBeanI8;
    @EJB
    private HelperBeanJ8 helperBeanJ8;
    @EJB
    private HelperBeanK8 helperBeanK8;
    @EJB
    private HelperBeanL8 helperBeanL8;
    @EJB
    private HelperBeanM8 helperBeanM8;
    @EJB
    private HelperBeanN8 helperBeanN8;
    @EJB
    private HelperBeanO8 helperBeanO8;

    @EJB
    private StartupBean8 startupBean8;

    public String whoAmI() {
        return "i'm ExampleService8 "
        + helperBeanA8.identify()
        + helperBeanB8.identify()
        + helperBeanC8.identify()
        + helperBeanD8.identify()
        + helperBeanE8.identify()
        + helperBeanF8.identify()
        + helperBeanG8.identify()
        + helperBeanH8.identify()
        + helperBeanI8.identify()
        + helperBeanJ8.identify()
        + helperBeanK8.identify()
        + helperBeanL8.identify()
        + helperBeanM8.identify()
        + helperBeanN8.identify()
        + helperBeanO8.identify();
    }

}
