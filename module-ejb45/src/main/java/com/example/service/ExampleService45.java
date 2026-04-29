package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService45 {

    @EJB
    private HelperBeanA45 helperBeanA45;
    @EJB
    private HelperBeanB45 helperBeanB45;
    @EJB
    private HelperBeanC45 helperBeanC45;
    @EJB
    private HelperBeanD45 helperBeanD45;
    @EJB
    private HelperBeanE45 helperBeanE45;
    @EJB
    private HelperBeanF45 helperBeanF45;
    @EJB
    private HelperBeanG45 helperBeanG45;
    @EJB
    private HelperBeanH45 helperBeanH45;
    @EJB
    private HelperBeanI45 helperBeanI45;
    @EJB
    private HelperBeanJ45 helperBeanJ45;
    @EJB
    private HelperBeanK45 helperBeanK45;
    @EJB
    private HelperBeanL45 helperBeanL45;
    @EJB
    private HelperBeanM45 helperBeanM45;
    @EJB
    private HelperBeanN45 helperBeanN45;
    @EJB
    private HelperBeanO45 helperBeanO45;

    @EJB
    private StartupBean45 startupBean45;

    public String whoAmI() {
        return "i'm ExampleService45 "
        + helperBeanA45.identify()
        + helperBeanB45.identify()
        + helperBeanC45.identify()
        + helperBeanD45.identify()
        + helperBeanE45.identify()
        + helperBeanF45.identify()
        + helperBeanG45.identify()
        + helperBeanH45.identify()
        + helperBeanI45.identify()
        + helperBeanJ45.identify()
        + helperBeanK45.identify()
        + helperBeanL45.identify()
        + helperBeanM45.identify()
        + helperBeanN45.identify()
        + helperBeanO45.identify();
    }

}
