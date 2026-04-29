package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService82 {

    @EJB
    private HelperBeanA82 helperBeanA82;
    @EJB
    private HelperBeanB82 helperBeanB82;
    @EJB
    private HelperBeanC82 helperBeanC82;
    @EJB
    private HelperBeanD82 helperBeanD82;
    @EJB
    private HelperBeanE82 helperBeanE82;
    @EJB
    private HelperBeanF82 helperBeanF82;
    @EJB
    private HelperBeanG82 helperBeanG82;
    @EJB
    private HelperBeanH82 helperBeanH82;
    @EJB
    private HelperBeanI82 helperBeanI82;
    @EJB
    private HelperBeanJ82 helperBeanJ82;
    @EJB
    private HelperBeanK82 helperBeanK82;
    @EJB
    private HelperBeanL82 helperBeanL82;
    @EJB
    private HelperBeanM82 helperBeanM82;
    @EJB
    private HelperBeanN82 helperBeanN82;
    @EJB
    private HelperBeanO82 helperBeanO82;

    @EJB
    private StartupBean82 startupBean82;

    public String whoAmI() {
        return "i'm ExampleService82 "
        + helperBeanA82.identify()
        + helperBeanB82.identify()
        + helperBeanC82.identify()
        + helperBeanD82.identify()
        + helperBeanE82.identify()
        + helperBeanF82.identify()
        + helperBeanG82.identify()
        + helperBeanH82.identify()
        + helperBeanI82.identify()
        + helperBeanJ82.identify()
        + helperBeanK82.identify()
        + helperBeanL82.identify()
        + helperBeanM82.identify()
        + helperBeanN82.identify()
        + helperBeanO82.identify();
    }

}
