package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService12 {

    @EJB
    private HelperBeanA12 helperBeanA12;
    @EJB
    private HelperBeanB12 helperBeanB12;
    @EJB
    private HelperBeanC12 helperBeanC12;
    @EJB
    private HelperBeanD12 helperBeanD12;
    @EJB
    private HelperBeanE12 helperBeanE12;
    @EJB
    private HelperBeanF12 helperBeanF12;
    @EJB
    private HelperBeanG12 helperBeanG12;
    @EJB
    private HelperBeanH12 helperBeanH12;
    @EJB
    private HelperBeanI12 helperBeanI12;
    @EJB
    private HelperBeanJ12 helperBeanJ12;
    @EJB
    private HelperBeanK12 helperBeanK12;
    @EJB
    private HelperBeanL12 helperBeanL12;
    @EJB
    private HelperBeanM12 helperBeanM12;
    @EJB
    private HelperBeanN12 helperBeanN12;
    @EJB
    private HelperBeanO12 helperBeanO12;

    @EJB
    private StartupBean12 startupBean12;

    public String whoAmI() {
        return "i'm ExampleService12 "
        + helperBeanA12.identify()
        + helperBeanB12.identify()
        + helperBeanC12.identify()
        + helperBeanD12.identify()
        + helperBeanE12.identify()
        + helperBeanF12.identify()
        + helperBeanG12.identify()
        + helperBeanH12.identify()
        + helperBeanI12.identify()
        + helperBeanJ12.identify()
        + helperBeanK12.identify()
        + helperBeanL12.identify()
        + helperBeanM12.identify()
        + helperBeanN12.identify()
        + helperBeanO12.identify();
    }

}
