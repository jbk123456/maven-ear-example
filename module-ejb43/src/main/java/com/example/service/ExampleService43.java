package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService43 {

    @EJB
    private HelperBeanA43 helperBeanA43;
    @EJB
    private HelperBeanB43 helperBeanB43;
    @EJB
    private HelperBeanC43 helperBeanC43;
    @EJB
    private HelperBeanD43 helperBeanD43;
    @EJB
    private HelperBeanE43 helperBeanE43;
    @EJB
    private HelperBeanF43 helperBeanF43;
    @EJB
    private HelperBeanG43 helperBeanG43;
    @EJB
    private HelperBeanH43 helperBeanH43;
    @EJB
    private HelperBeanI43 helperBeanI43;
    @EJB
    private HelperBeanJ43 helperBeanJ43;
    @EJB
    private HelperBeanK43 helperBeanK43;
    @EJB
    private HelperBeanL43 helperBeanL43;
    @EJB
    private HelperBeanM43 helperBeanM43;
    @EJB
    private HelperBeanN43 helperBeanN43;
    @EJB
    private HelperBeanO43 helperBeanO43;

    @EJB
    private StartupBean43 startupBean43;

    public String whoAmI() {
        return "i'm ExampleService43 "
        + helperBeanA43.identify()
        + helperBeanB43.identify()
        + helperBeanC43.identify()
        + helperBeanD43.identify()
        + helperBeanE43.identify()
        + helperBeanF43.identify()
        + helperBeanG43.identify()
        + helperBeanH43.identify()
        + helperBeanI43.identify()
        + helperBeanJ43.identify()
        + helperBeanK43.identify()
        + helperBeanL43.identify()
        + helperBeanM43.identify()
        + helperBeanN43.identify()
        + helperBeanO43.identify();
    }

}
