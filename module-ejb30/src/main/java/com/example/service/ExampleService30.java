package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService30 {

    @EJB
    private HelperBeanA30 helperBeanA30;
    @EJB
    private HelperBeanB30 helperBeanB30;
    @EJB
    private HelperBeanC30 helperBeanC30;
    @EJB
    private HelperBeanD30 helperBeanD30;
    @EJB
    private HelperBeanE30 helperBeanE30;
    @EJB
    private HelperBeanF30 helperBeanF30;
    @EJB
    private HelperBeanG30 helperBeanG30;
    @EJB
    private HelperBeanH30 helperBeanH30;
    @EJB
    private HelperBeanI30 helperBeanI30;
    @EJB
    private HelperBeanJ30 helperBeanJ30;
    @EJB
    private HelperBeanK30 helperBeanK30;
    @EJB
    private HelperBeanL30 helperBeanL30;
    @EJB
    private HelperBeanM30 helperBeanM30;
    @EJB
    private HelperBeanN30 helperBeanN30;
    @EJB
    private HelperBeanO30 helperBeanO30;

    @EJB
    private StartupBean30 startupBean30;

    public String whoAmI() {
        return "i'm ExampleService30 "
        + helperBeanA30.identify()
        + helperBeanB30.identify()
        + helperBeanC30.identify()
        + helperBeanD30.identify()
        + helperBeanE30.identify()
        + helperBeanF30.identify()
        + helperBeanG30.identify()
        + helperBeanH30.identify()
        + helperBeanI30.identify()
        + helperBeanJ30.identify()
        + helperBeanK30.identify()
        + helperBeanL30.identify()
        + helperBeanM30.identify()
        + helperBeanN30.identify()
        + helperBeanO30.identify();
    }

}
