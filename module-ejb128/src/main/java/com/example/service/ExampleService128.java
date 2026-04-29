package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService128 {

    @EJB
    private HelperBeanA128 helperBeanA128;
    @EJB
    private HelperBeanB128 helperBeanB128;
    @EJB
    private HelperBeanC128 helperBeanC128;
    @EJB
    private HelperBeanD128 helperBeanD128;
    @EJB
    private HelperBeanE128 helperBeanE128;
    @EJB
    private HelperBeanF128 helperBeanF128;
    @EJB
    private HelperBeanG128 helperBeanG128;
    @EJB
    private HelperBeanH128 helperBeanH128;
    @EJB
    private HelperBeanI128 helperBeanI128;
    @EJB
    private HelperBeanJ128 helperBeanJ128;
    @EJB
    private HelperBeanK128 helperBeanK128;
    @EJB
    private HelperBeanL128 helperBeanL128;
    @EJB
    private HelperBeanM128 helperBeanM128;
    @EJB
    private HelperBeanN128 helperBeanN128;
    @EJB
    private HelperBeanO128 helperBeanO128;

    @EJB
    private StartupBean128 startupBean128;

    public String whoAmI() {
        return "i'm ExampleService128 "
        + helperBeanA128.identify()
        + helperBeanB128.identify()
        + helperBeanC128.identify()
        + helperBeanD128.identify()
        + helperBeanE128.identify()
        + helperBeanF128.identify()
        + helperBeanG128.identify()
        + helperBeanH128.identify()
        + helperBeanI128.identify()
        + helperBeanJ128.identify()
        + helperBeanK128.identify()
        + helperBeanL128.identify()
        + helperBeanM128.identify()
        + helperBeanN128.identify()
        + helperBeanO128.identify();
    }

}
