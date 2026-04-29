package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService15 {

    @EJB
    private HelperBeanA15 helperBeanA15;
    @EJB
    private HelperBeanB15 helperBeanB15;
    @EJB
    private HelperBeanC15 helperBeanC15;
    @EJB
    private HelperBeanD15 helperBeanD15;
    @EJB
    private HelperBeanE15 helperBeanE15;
    @EJB
    private HelperBeanF15 helperBeanF15;
    @EJB
    private HelperBeanG15 helperBeanG15;
    @EJB
    private HelperBeanH15 helperBeanH15;
    @EJB
    private HelperBeanI15 helperBeanI15;
    @EJB
    private HelperBeanJ15 helperBeanJ15;
    @EJB
    private HelperBeanK15 helperBeanK15;
    @EJB
    private HelperBeanL15 helperBeanL15;
    @EJB
    private HelperBeanM15 helperBeanM15;
    @EJB
    private HelperBeanN15 helperBeanN15;
    @EJB
    private HelperBeanO15 helperBeanO15;

    @EJB
    private StartupBean15 startupBean15;

    public String whoAmI() {
        return "i'm ExampleService15 "
        + helperBeanA15.identify()
        + helperBeanB15.identify()
        + helperBeanC15.identify()
        + helperBeanD15.identify()
        + helperBeanE15.identify()
        + helperBeanF15.identify()
        + helperBeanG15.identify()
        + helperBeanH15.identify()
        + helperBeanI15.identify()
        + helperBeanJ15.identify()
        + helperBeanK15.identify()
        + helperBeanL15.identify()
        + helperBeanM15.identify()
        + helperBeanN15.identify()
        + helperBeanO15.identify();
    }

}
