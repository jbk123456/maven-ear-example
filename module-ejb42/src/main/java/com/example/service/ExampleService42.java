package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService42 {

    @EJB
    private HelperBeanA42 helperBeanA42;
    @EJB
    private HelperBeanB42 helperBeanB42;
    @EJB
    private HelperBeanC42 helperBeanC42;
    @EJB
    private HelperBeanD42 helperBeanD42;
    @EJB
    private HelperBeanE42 helperBeanE42;
    @EJB
    private HelperBeanF42 helperBeanF42;
    @EJB
    private HelperBeanG42 helperBeanG42;
    @EJB
    private HelperBeanH42 helperBeanH42;
    @EJB
    private HelperBeanI42 helperBeanI42;
    @EJB
    private HelperBeanJ42 helperBeanJ42;
    @EJB
    private HelperBeanK42 helperBeanK42;
    @EJB
    private HelperBeanL42 helperBeanL42;
    @EJB
    private HelperBeanM42 helperBeanM42;
    @EJB
    private HelperBeanN42 helperBeanN42;
    @EJB
    private HelperBeanO42 helperBeanO42;

    @EJB
    private StartupBean42 startupBean42;

    public String whoAmI() {
        return "i'm ExampleService42 "
        + helperBeanA42.identify()
        + helperBeanB42.identify()
        + helperBeanC42.identify()
        + helperBeanD42.identify()
        + helperBeanE42.identify()
        + helperBeanF42.identify()
        + helperBeanG42.identify()
        + helperBeanH42.identify()
        + helperBeanI42.identify()
        + helperBeanJ42.identify()
        + helperBeanK42.identify()
        + helperBeanL42.identify()
        + helperBeanM42.identify()
        + helperBeanN42.identify()
        + helperBeanO42.identify();
    }

}
