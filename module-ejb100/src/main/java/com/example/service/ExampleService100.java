package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService100 {

    @EJB
    private HelperBeanA100 helperBeanA100;
    @EJB
    private HelperBeanB100 helperBeanB100;
    @EJB
    private HelperBeanC100 helperBeanC100;
    @EJB
    private HelperBeanD100 helperBeanD100;
    @EJB
    private HelperBeanE100 helperBeanE100;
    @EJB
    private HelperBeanF100 helperBeanF100;
    @EJB
    private HelperBeanG100 helperBeanG100;
    @EJB
    private HelperBeanH100 helperBeanH100;
    @EJB
    private HelperBeanI100 helperBeanI100;
    @EJB
    private HelperBeanJ100 helperBeanJ100;
    @EJB
    private HelperBeanK100 helperBeanK100;
    @EJB
    private HelperBeanL100 helperBeanL100;
    @EJB
    private HelperBeanM100 helperBeanM100;
    @EJB
    private HelperBeanN100 helperBeanN100;
    @EJB
    private HelperBeanO100 helperBeanO100;

    @EJB
    private StartupBean100 startupBean100;

    public String whoAmI() {
        return "i'm ExampleService100 "
        + helperBeanA100.identify()
        + helperBeanB100.identify()
        + helperBeanC100.identify()
        + helperBeanD100.identify()
        + helperBeanE100.identify()
        + helperBeanF100.identify()
        + helperBeanG100.identify()
        + helperBeanH100.identify()
        + helperBeanI100.identify()
        + helperBeanJ100.identify()
        + helperBeanK100.identify()
        + helperBeanL100.identify()
        + helperBeanM100.identify()
        + helperBeanN100.identify()
        + helperBeanO100.identify();
    }

}
