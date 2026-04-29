package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService39 {

    @EJB
    private HelperBeanA39 helperBeanA39;
    @EJB
    private HelperBeanB39 helperBeanB39;
    @EJB
    private HelperBeanC39 helperBeanC39;
    @EJB
    private HelperBeanD39 helperBeanD39;
    @EJB
    private HelperBeanE39 helperBeanE39;
    @EJB
    private HelperBeanF39 helperBeanF39;
    @EJB
    private HelperBeanG39 helperBeanG39;
    @EJB
    private HelperBeanH39 helperBeanH39;
    @EJB
    private HelperBeanI39 helperBeanI39;
    @EJB
    private HelperBeanJ39 helperBeanJ39;
    @EJB
    private HelperBeanK39 helperBeanK39;
    @EJB
    private HelperBeanL39 helperBeanL39;
    @EJB
    private HelperBeanM39 helperBeanM39;
    @EJB
    private HelperBeanN39 helperBeanN39;
    @EJB
    private HelperBeanO39 helperBeanO39;

    @EJB
    private StartupBean39 startupBean39;

    public String whoAmI() {
        return "i'm ExampleService39 "
        + helperBeanA39.identify()
        + helperBeanB39.identify()
        + helperBeanC39.identify()
        + helperBeanD39.identify()
        + helperBeanE39.identify()
        + helperBeanF39.identify()
        + helperBeanG39.identify()
        + helperBeanH39.identify()
        + helperBeanI39.identify()
        + helperBeanJ39.identify()
        + helperBeanK39.identify()
        + helperBeanL39.identify()
        + helperBeanM39.identify()
        + helperBeanN39.identify()
        + helperBeanO39.identify();
    }

}
