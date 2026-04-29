package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService124 {

    @EJB
    private HelperBeanA124 helperBeanA124;
    @EJB
    private HelperBeanB124 helperBeanB124;
    @EJB
    private HelperBeanC124 helperBeanC124;
    @EJB
    private HelperBeanD124 helperBeanD124;
    @EJB
    private HelperBeanE124 helperBeanE124;
    @EJB
    private HelperBeanF124 helperBeanF124;
    @EJB
    private HelperBeanG124 helperBeanG124;
    @EJB
    private HelperBeanH124 helperBeanH124;
    @EJB
    private HelperBeanI124 helperBeanI124;
    @EJB
    private HelperBeanJ124 helperBeanJ124;
    @EJB
    private HelperBeanK124 helperBeanK124;
    @EJB
    private HelperBeanL124 helperBeanL124;
    @EJB
    private HelperBeanM124 helperBeanM124;
    @EJB
    private HelperBeanN124 helperBeanN124;
    @EJB
    private HelperBeanO124 helperBeanO124;

    @EJB
    private StartupBean124 startupBean124;

    public String whoAmI() {
        return "i'm ExampleService124 "
        + helperBeanA124.identify()
        + helperBeanB124.identify()
        + helperBeanC124.identify()
        + helperBeanD124.identify()
        + helperBeanE124.identify()
        + helperBeanF124.identify()
        + helperBeanG124.identify()
        + helperBeanH124.identify()
        + helperBeanI124.identify()
        + helperBeanJ124.identify()
        + helperBeanK124.identify()
        + helperBeanL124.identify()
        + helperBeanM124.identify()
        + helperBeanN124.identify()
        + helperBeanO124.identify();
    }

}
