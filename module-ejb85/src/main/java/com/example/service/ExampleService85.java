package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService85 {

    @EJB
    private HelperBeanA85 helperBeanA85;
    @EJB
    private HelperBeanB85 helperBeanB85;
    @EJB
    private HelperBeanC85 helperBeanC85;
    @EJB
    private HelperBeanD85 helperBeanD85;
    @EJB
    private HelperBeanE85 helperBeanE85;
    @EJB
    private HelperBeanF85 helperBeanF85;
    @EJB
    private HelperBeanG85 helperBeanG85;
    @EJB
    private HelperBeanH85 helperBeanH85;
    @EJB
    private HelperBeanI85 helperBeanI85;
    @EJB
    private HelperBeanJ85 helperBeanJ85;
    @EJB
    private HelperBeanK85 helperBeanK85;
    @EJB
    private HelperBeanL85 helperBeanL85;
    @EJB
    private HelperBeanM85 helperBeanM85;
    @EJB
    private HelperBeanN85 helperBeanN85;
    @EJB
    private HelperBeanO85 helperBeanO85;

    @EJB
    private StartupBean85 startupBean85;

    public String whoAmI() {
        return "i'm ExampleService85 "
        + helperBeanA85.identify()
        + helperBeanB85.identify()
        + helperBeanC85.identify()
        + helperBeanD85.identify()
        + helperBeanE85.identify()
        + helperBeanF85.identify()
        + helperBeanG85.identify()
        + helperBeanH85.identify()
        + helperBeanI85.identify()
        + helperBeanJ85.identify()
        + helperBeanK85.identify()
        + helperBeanL85.identify()
        + helperBeanM85.identify()
        + helperBeanN85.identify()
        + helperBeanO85.identify();
    }

}
