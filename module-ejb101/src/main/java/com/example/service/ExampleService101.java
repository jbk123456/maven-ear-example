package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService101 {

    @EJB
    private HelperBeanA101 helperBeanA101;
    @EJB
    private HelperBeanB101 helperBeanB101;
    @EJB
    private HelperBeanC101 helperBeanC101;
    @EJB
    private HelperBeanD101 helperBeanD101;
    @EJB
    private HelperBeanE101 helperBeanE101;
    @EJB
    private HelperBeanF101 helperBeanF101;
    @EJB
    private HelperBeanG101 helperBeanG101;
    @EJB
    private HelperBeanH101 helperBeanH101;
    @EJB
    private HelperBeanI101 helperBeanI101;
    @EJB
    private HelperBeanJ101 helperBeanJ101;
    @EJB
    private HelperBeanK101 helperBeanK101;
    @EJB
    private HelperBeanL101 helperBeanL101;
    @EJB
    private HelperBeanM101 helperBeanM101;
    @EJB
    private HelperBeanN101 helperBeanN101;
    @EJB
    private HelperBeanO101 helperBeanO101;

    @EJB
    private StartupBean101 startupBean101;

    public String whoAmI() {
        return "i'm ExampleService101 "
        + helperBeanA101.identify()
        + helperBeanB101.identify()
        + helperBeanC101.identify()
        + helperBeanD101.identify()
        + helperBeanE101.identify()
        + helperBeanF101.identify()
        + helperBeanG101.identify()
        + helperBeanH101.identify()
        + helperBeanI101.identify()
        + helperBeanJ101.identify()
        + helperBeanK101.identify()
        + helperBeanL101.identify()
        + helperBeanM101.identify()
        + helperBeanN101.identify()
        + helperBeanO101.identify();
    }

}
