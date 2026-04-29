package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService51 {

    @EJB
    private HelperBeanA51 helperBeanA51;
    @EJB
    private HelperBeanB51 helperBeanB51;
    @EJB
    private HelperBeanC51 helperBeanC51;
    @EJB
    private HelperBeanD51 helperBeanD51;
    @EJB
    private HelperBeanE51 helperBeanE51;
    @EJB
    private HelperBeanF51 helperBeanF51;
    @EJB
    private HelperBeanG51 helperBeanG51;
    @EJB
    private HelperBeanH51 helperBeanH51;
    @EJB
    private HelperBeanI51 helperBeanI51;
    @EJB
    private HelperBeanJ51 helperBeanJ51;
    @EJB
    private HelperBeanK51 helperBeanK51;
    @EJB
    private HelperBeanL51 helperBeanL51;
    @EJB
    private HelperBeanM51 helperBeanM51;
    @EJB
    private HelperBeanN51 helperBeanN51;
    @EJB
    private HelperBeanO51 helperBeanO51;

    @EJB
    private StartupBean51 startupBean51;

    public String whoAmI() {
        return "i'm ExampleService51 "
        + helperBeanA51.identify()
        + helperBeanB51.identify()
        + helperBeanC51.identify()
        + helperBeanD51.identify()
        + helperBeanE51.identify()
        + helperBeanF51.identify()
        + helperBeanG51.identify()
        + helperBeanH51.identify()
        + helperBeanI51.identify()
        + helperBeanJ51.identify()
        + helperBeanK51.identify()
        + helperBeanL51.identify()
        + helperBeanM51.identify()
        + helperBeanN51.identify()
        + helperBeanO51.identify();
    }

}
