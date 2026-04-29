package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService24 {

    @EJB
    private HelperBeanA24 helperBeanA24;
    @EJB
    private HelperBeanB24 helperBeanB24;
    @EJB
    private HelperBeanC24 helperBeanC24;
    @EJB
    private HelperBeanD24 helperBeanD24;
    @EJB
    private HelperBeanE24 helperBeanE24;
    @EJB
    private HelperBeanF24 helperBeanF24;
    @EJB
    private HelperBeanG24 helperBeanG24;
    @EJB
    private HelperBeanH24 helperBeanH24;
    @EJB
    private HelperBeanI24 helperBeanI24;
    @EJB
    private HelperBeanJ24 helperBeanJ24;
    @EJB
    private HelperBeanK24 helperBeanK24;
    @EJB
    private HelperBeanL24 helperBeanL24;
    @EJB
    private HelperBeanM24 helperBeanM24;
    @EJB
    private HelperBeanN24 helperBeanN24;
    @EJB
    private HelperBeanO24 helperBeanO24;

    @EJB
    private StartupBean24 startupBean24;

    public String whoAmI() {
        return "i'm ExampleService24 "
        + helperBeanA24.identify()
        + helperBeanB24.identify()
        + helperBeanC24.identify()
        + helperBeanD24.identify()
        + helperBeanE24.identify()
        + helperBeanF24.identify()
        + helperBeanG24.identify()
        + helperBeanH24.identify()
        + helperBeanI24.identify()
        + helperBeanJ24.identify()
        + helperBeanK24.identify()
        + helperBeanL24.identify()
        + helperBeanM24.identify()
        + helperBeanN24.identify()
        + helperBeanO24.identify();
    }

}
