package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService145 {

    @EJB
    private HelperBeanA145 helperBeanA145;
    @EJB
    private HelperBeanB145 helperBeanB145;
    @EJB
    private HelperBeanC145 helperBeanC145;
    @EJB
    private HelperBeanD145 helperBeanD145;
    @EJB
    private HelperBeanE145 helperBeanE145;
    @EJB
    private HelperBeanF145 helperBeanF145;
    @EJB
    private HelperBeanG145 helperBeanG145;
    @EJB
    private HelperBeanH145 helperBeanH145;
    @EJB
    private HelperBeanI145 helperBeanI145;
    @EJB
    private HelperBeanJ145 helperBeanJ145;
    @EJB
    private HelperBeanK145 helperBeanK145;
    @EJB
    private HelperBeanL145 helperBeanL145;
    @EJB
    private HelperBeanM145 helperBeanM145;
    @EJB
    private HelperBeanN145 helperBeanN145;
    @EJB
    private HelperBeanO145 helperBeanO145;

    @EJB
    private StartupBean145 startupBean145;

    public String whoAmI() {
        return "i'm ExampleService145 "
        + helperBeanA145.identify()
        + helperBeanB145.identify()
        + helperBeanC145.identify()
        + helperBeanD145.identify()
        + helperBeanE145.identify()
        + helperBeanF145.identify()
        + helperBeanG145.identify()
        + helperBeanH145.identify()
        + helperBeanI145.identify()
        + helperBeanJ145.identify()
        + helperBeanK145.identify()
        + helperBeanL145.identify()
        + helperBeanM145.identify()
        + helperBeanN145.identify()
        + helperBeanO145.identify();
    }

}
