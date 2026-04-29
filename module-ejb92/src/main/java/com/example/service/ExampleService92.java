package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService92 {

    @EJB
    private HelperBeanA92 helperBeanA92;
    @EJB
    private HelperBeanB92 helperBeanB92;
    @EJB
    private HelperBeanC92 helperBeanC92;
    @EJB
    private HelperBeanD92 helperBeanD92;
    @EJB
    private HelperBeanE92 helperBeanE92;
    @EJB
    private HelperBeanF92 helperBeanF92;
    @EJB
    private HelperBeanG92 helperBeanG92;
    @EJB
    private HelperBeanH92 helperBeanH92;
    @EJB
    private HelperBeanI92 helperBeanI92;
    @EJB
    private HelperBeanJ92 helperBeanJ92;
    @EJB
    private HelperBeanK92 helperBeanK92;
    @EJB
    private HelperBeanL92 helperBeanL92;
    @EJB
    private HelperBeanM92 helperBeanM92;
    @EJB
    private HelperBeanN92 helperBeanN92;
    @EJB
    private HelperBeanO92 helperBeanO92;

    @EJB
    private StartupBean92 startupBean92;

    public String whoAmI() {
        return "i'm ExampleService92 "
        + helperBeanA92.identify()
        + helperBeanB92.identify()
        + helperBeanC92.identify()
        + helperBeanD92.identify()
        + helperBeanE92.identify()
        + helperBeanF92.identify()
        + helperBeanG92.identify()
        + helperBeanH92.identify()
        + helperBeanI92.identify()
        + helperBeanJ92.identify()
        + helperBeanK92.identify()
        + helperBeanL92.identify()
        + helperBeanM92.identify()
        + helperBeanN92.identify()
        + helperBeanO92.identify();
    }

}
