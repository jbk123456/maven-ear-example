package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService90 {

    @EJB
    private HelperBeanA90 helperBeanA90;
    @EJB
    private HelperBeanB90 helperBeanB90;
    @EJB
    private HelperBeanC90 helperBeanC90;
    @EJB
    private HelperBeanD90 helperBeanD90;
    @EJB
    private HelperBeanE90 helperBeanE90;
    @EJB
    private HelperBeanF90 helperBeanF90;
    @EJB
    private HelperBeanG90 helperBeanG90;
    @EJB
    private HelperBeanH90 helperBeanH90;
    @EJB
    private HelperBeanI90 helperBeanI90;
    @EJB
    private HelperBeanJ90 helperBeanJ90;
    @EJB
    private HelperBeanK90 helperBeanK90;
    @EJB
    private HelperBeanL90 helperBeanL90;
    @EJB
    private HelperBeanM90 helperBeanM90;
    @EJB
    private HelperBeanN90 helperBeanN90;
    @EJB
    private HelperBeanO90 helperBeanO90;

    @EJB
    private StartupBean90 startupBean90;

    public String whoAmI() {
        return "i'm ExampleService90 "
        + helperBeanA90.identify()
        + helperBeanB90.identify()
        + helperBeanC90.identify()
        + helperBeanD90.identify()
        + helperBeanE90.identify()
        + helperBeanF90.identify()
        + helperBeanG90.identify()
        + helperBeanH90.identify()
        + helperBeanI90.identify()
        + helperBeanJ90.identify()
        + helperBeanK90.identify()
        + helperBeanL90.identify()
        + helperBeanM90.identify()
        + helperBeanN90.identify()
        + helperBeanO90.identify();
    }

}
