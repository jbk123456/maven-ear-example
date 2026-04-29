package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService2 {

    @EJB
    private HelperBeanA2 helperBeanA2;
    @EJB
    private HelperBeanB2 helperBeanB2;
    @EJB
    private HelperBeanC2 helperBeanC2;
    @EJB
    private HelperBeanD2 helperBeanD2;
    @EJB
    private HelperBeanE2 helperBeanE2;
    @EJB
    private HelperBeanF2 helperBeanF2;
    @EJB
    private HelperBeanG2 helperBeanG2;
    @EJB
    private HelperBeanH2 helperBeanH2;
    @EJB
    private HelperBeanI2 helperBeanI2;
    @EJB
    private HelperBeanJ2 helperBeanJ2;
    @EJB
    private HelperBeanK2 helperBeanK2;
    @EJB
    private HelperBeanL2 helperBeanL2;
    @EJB
    private HelperBeanM2 helperBeanM2;
    @EJB
    private HelperBeanN2 helperBeanN2;
    @EJB
    private HelperBeanO2 helperBeanO2;

    @EJB
    private StartupBean2 startupBean2;

    public String whoAmI() {
        return "i'm ExampleService2 "
        + helperBeanA2.identify()
        + helperBeanB2.identify()
        + helperBeanC2.identify()
        + helperBeanD2.identify()
        + helperBeanE2.identify()
        + helperBeanF2.identify()
        + helperBeanG2.identify()
        + helperBeanH2.identify()
        + helperBeanI2.identify()
        + helperBeanJ2.identify()
        + helperBeanK2.identify()
        + helperBeanL2.identify()
        + helperBeanM2.identify()
        + helperBeanN2.identify()
        + helperBeanO2.identify();
    }

}
