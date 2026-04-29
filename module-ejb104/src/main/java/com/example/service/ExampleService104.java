package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService104 {

    @EJB
    private HelperBeanA104 helperBeanA104;
    @EJB
    private HelperBeanB104 helperBeanB104;
    @EJB
    private HelperBeanC104 helperBeanC104;
    @EJB
    private HelperBeanD104 helperBeanD104;
    @EJB
    private HelperBeanE104 helperBeanE104;
    @EJB
    private HelperBeanF104 helperBeanF104;
    @EJB
    private HelperBeanG104 helperBeanG104;
    @EJB
    private HelperBeanH104 helperBeanH104;
    @EJB
    private HelperBeanI104 helperBeanI104;
    @EJB
    private HelperBeanJ104 helperBeanJ104;
    @EJB
    private HelperBeanK104 helperBeanK104;
    @EJB
    private HelperBeanL104 helperBeanL104;
    @EJB
    private HelperBeanM104 helperBeanM104;
    @EJB
    private HelperBeanN104 helperBeanN104;
    @EJB
    private HelperBeanO104 helperBeanO104;

    @EJB
    private StartupBean104 startupBean104;

    public String whoAmI() {
        return "i'm ExampleService104 "
        + helperBeanA104.identify()
        + helperBeanB104.identify()
        + helperBeanC104.identify()
        + helperBeanD104.identify()
        + helperBeanE104.identify()
        + helperBeanF104.identify()
        + helperBeanG104.identify()
        + helperBeanH104.identify()
        + helperBeanI104.identify()
        + helperBeanJ104.identify()
        + helperBeanK104.identify()
        + helperBeanL104.identify()
        + helperBeanM104.identify()
        + helperBeanN104.identify()
        + helperBeanO104.identify();
    }

}
