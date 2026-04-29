package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService3 {

    @EJB
    private HelperBeanA3 helperBeanA3;
    @EJB
    private HelperBeanB3 helperBeanB3;
    @EJB
    private HelperBeanC3 helperBeanC3;
    @EJB
    private HelperBeanD3 helperBeanD3;
    @EJB
    private HelperBeanE3 helperBeanE3;
    @EJB
    private HelperBeanF3 helperBeanF3;
    @EJB
    private HelperBeanG3 helperBeanG3;
    @EJB
    private HelperBeanH3 helperBeanH3;
    @EJB
    private HelperBeanI3 helperBeanI3;
    @EJB
    private HelperBeanJ3 helperBeanJ3;
    @EJB
    private HelperBeanK3 helperBeanK3;
    @EJB
    private HelperBeanL3 helperBeanL3;
    @EJB
    private HelperBeanM3 helperBeanM3;
    @EJB
    private HelperBeanN3 helperBeanN3;
    @EJB
    private HelperBeanO3 helperBeanO3;

    @EJB
    private StartupBean3 startupBean3;

    public String whoAmI() {
        return "i'm ExampleService3 "
        + helperBeanA3.identify()
        + helperBeanB3.identify()
        + helperBeanC3.identify()
        + helperBeanD3.identify()
        + helperBeanE3.identify()
        + helperBeanF3.identify()
        + helperBeanG3.identify()
        + helperBeanH3.identify()
        + helperBeanI3.identify()
        + helperBeanJ3.identify()
        + helperBeanK3.identify()
        + helperBeanL3.identify()
        + helperBeanM3.identify()
        + helperBeanN3.identify()
        + helperBeanO3.identify();
    }

}
