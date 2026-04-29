package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService79 {

    @EJB
    private HelperBeanA79 helperBeanA79;
    @EJB
    private HelperBeanB79 helperBeanB79;
    @EJB
    private HelperBeanC79 helperBeanC79;
    @EJB
    private HelperBeanD79 helperBeanD79;
    @EJB
    private HelperBeanE79 helperBeanE79;
    @EJB
    private HelperBeanF79 helperBeanF79;
    @EJB
    private HelperBeanG79 helperBeanG79;
    @EJB
    private HelperBeanH79 helperBeanH79;
    @EJB
    private HelperBeanI79 helperBeanI79;
    @EJB
    private HelperBeanJ79 helperBeanJ79;
    @EJB
    private HelperBeanK79 helperBeanK79;
    @EJB
    private HelperBeanL79 helperBeanL79;
    @EJB
    private HelperBeanM79 helperBeanM79;
    @EJB
    private HelperBeanN79 helperBeanN79;
    @EJB
    private HelperBeanO79 helperBeanO79;

    @EJB
    private StartupBean79 startupBean79;

    public String whoAmI() {
        return "i'm ExampleService79 "
        + helperBeanA79.identify()
        + helperBeanB79.identify()
        + helperBeanC79.identify()
        + helperBeanD79.identify()
        + helperBeanE79.identify()
        + helperBeanF79.identify()
        + helperBeanG79.identify()
        + helperBeanH79.identify()
        + helperBeanI79.identify()
        + helperBeanJ79.identify()
        + helperBeanK79.identify()
        + helperBeanL79.identify()
        + helperBeanM79.identify()
        + helperBeanN79.identify()
        + helperBeanO79.identify();
    }

}
