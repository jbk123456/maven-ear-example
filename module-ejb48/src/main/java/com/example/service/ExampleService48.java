package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService48 {

    @EJB
    private HelperBeanA48 helperBeanA48;
    @EJB
    private HelperBeanB48 helperBeanB48;
    @EJB
    private HelperBeanC48 helperBeanC48;
    @EJB
    private HelperBeanD48 helperBeanD48;
    @EJB
    private HelperBeanE48 helperBeanE48;
    @EJB
    private HelperBeanF48 helperBeanF48;
    @EJB
    private HelperBeanG48 helperBeanG48;
    @EJB
    private HelperBeanH48 helperBeanH48;
    @EJB
    private HelperBeanI48 helperBeanI48;
    @EJB
    private HelperBeanJ48 helperBeanJ48;
    @EJB
    private HelperBeanK48 helperBeanK48;
    @EJB
    private HelperBeanL48 helperBeanL48;
    @EJB
    private HelperBeanM48 helperBeanM48;
    @EJB
    private HelperBeanN48 helperBeanN48;
    @EJB
    private HelperBeanO48 helperBeanO48;

    @EJB
    private StartupBean48 startupBean48;

    public String whoAmI() {
        return "i'm ExampleService48 "
        + helperBeanA48.identify()
        + helperBeanB48.identify()
        + helperBeanC48.identify()
        + helperBeanD48.identify()
        + helperBeanE48.identify()
        + helperBeanF48.identify()
        + helperBeanG48.identify()
        + helperBeanH48.identify()
        + helperBeanI48.identify()
        + helperBeanJ48.identify()
        + helperBeanK48.identify()
        + helperBeanL48.identify()
        + helperBeanM48.identify()
        + helperBeanN48.identify()
        + helperBeanO48.identify();
    }

}
