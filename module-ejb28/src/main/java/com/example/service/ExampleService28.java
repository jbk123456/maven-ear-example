package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService28 {

    @EJB
    private HelperBeanA28 helperBeanA28;
    @EJB
    private HelperBeanB28 helperBeanB28;
    @EJB
    private HelperBeanC28 helperBeanC28;
    @EJB
    private HelperBeanD28 helperBeanD28;
    @EJB
    private HelperBeanE28 helperBeanE28;
    @EJB
    private HelperBeanF28 helperBeanF28;
    @EJB
    private HelperBeanG28 helperBeanG28;
    @EJB
    private HelperBeanH28 helperBeanH28;
    @EJB
    private HelperBeanI28 helperBeanI28;
    @EJB
    private HelperBeanJ28 helperBeanJ28;
    @EJB
    private HelperBeanK28 helperBeanK28;
    @EJB
    private HelperBeanL28 helperBeanL28;
    @EJB
    private HelperBeanM28 helperBeanM28;
    @EJB
    private HelperBeanN28 helperBeanN28;
    @EJB
    private HelperBeanO28 helperBeanO28;

    @EJB
    private StartupBean28 startupBean28;

    public String whoAmI() {
        return "i'm ExampleService28 "
        + helperBeanA28.identify()
        + helperBeanB28.identify()
        + helperBeanC28.identify()
        + helperBeanD28.identify()
        + helperBeanE28.identify()
        + helperBeanF28.identify()
        + helperBeanG28.identify()
        + helperBeanH28.identify()
        + helperBeanI28.identify()
        + helperBeanJ28.identify()
        + helperBeanK28.identify()
        + helperBeanL28.identify()
        + helperBeanM28.identify()
        + helperBeanN28.identify()
        + helperBeanO28.identify();
    }

}
