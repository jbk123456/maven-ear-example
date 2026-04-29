package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService134 {

    @EJB
    private HelperBeanA134 helperBeanA134;
    @EJB
    private HelperBeanB134 helperBeanB134;
    @EJB
    private HelperBeanC134 helperBeanC134;
    @EJB
    private HelperBeanD134 helperBeanD134;
    @EJB
    private HelperBeanE134 helperBeanE134;
    @EJB
    private HelperBeanF134 helperBeanF134;
    @EJB
    private HelperBeanG134 helperBeanG134;
    @EJB
    private HelperBeanH134 helperBeanH134;
    @EJB
    private HelperBeanI134 helperBeanI134;
    @EJB
    private HelperBeanJ134 helperBeanJ134;
    @EJB
    private HelperBeanK134 helperBeanK134;
    @EJB
    private HelperBeanL134 helperBeanL134;
    @EJB
    private HelperBeanM134 helperBeanM134;
    @EJB
    private HelperBeanN134 helperBeanN134;
    @EJB
    private HelperBeanO134 helperBeanO134;

    @EJB
    private StartupBean134 startupBean134;

    public String whoAmI() {
        return "i'm ExampleService134 "
        + helperBeanA134.identify()
        + helperBeanB134.identify()
        + helperBeanC134.identify()
        + helperBeanD134.identify()
        + helperBeanE134.identify()
        + helperBeanF134.identify()
        + helperBeanG134.identify()
        + helperBeanH134.identify()
        + helperBeanI134.identify()
        + helperBeanJ134.identify()
        + helperBeanK134.identify()
        + helperBeanL134.identify()
        + helperBeanM134.identify()
        + helperBeanN134.identify()
        + helperBeanO134.identify();
    }

}
