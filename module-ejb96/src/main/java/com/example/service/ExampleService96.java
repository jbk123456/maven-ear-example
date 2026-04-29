package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService96 {

    @EJB
    private HelperBeanA96 helperBeanA96;
    @EJB
    private HelperBeanB96 helperBeanB96;
    @EJB
    private HelperBeanC96 helperBeanC96;
    @EJB
    private HelperBeanD96 helperBeanD96;
    @EJB
    private HelperBeanE96 helperBeanE96;
    @EJB
    private HelperBeanF96 helperBeanF96;
    @EJB
    private HelperBeanG96 helperBeanG96;
    @EJB
    private HelperBeanH96 helperBeanH96;
    @EJB
    private HelperBeanI96 helperBeanI96;
    @EJB
    private HelperBeanJ96 helperBeanJ96;
    @EJB
    private HelperBeanK96 helperBeanK96;
    @EJB
    private HelperBeanL96 helperBeanL96;
    @EJB
    private HelperBeanM96 helperBeanM96;
    @EJB
    private HelperBeanN96 helperBeanN96;
    @EJB
    private HelperBeanO96 helperBeanO96;

    @EJB
    private StartupBean96 startupBean96;

    public String whoAmI() {
        return "i'm ExampleService96 "
        + helperBeanA96.identify()
        + helperBeanB96.identify()
        + helperBeanC96.identify()
        + helperBeanD96.identify()
        + helperBeanE96.identify()
        + helperBeanF96.identify()
        + helperBeanG96.identify()
        + helperBeanH96.identify()
        + helperBeanI96.identify()
        + helperBeanJ96.identify()
        + helperBeanK96.identify()
        + helperBeanL96.identify()
        + helperBeanM96.identify()
        + helperBeanN96.identify()
        + helperBeanO96.identify();
    }

}
