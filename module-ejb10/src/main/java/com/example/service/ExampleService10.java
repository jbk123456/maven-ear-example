package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService10 {

    @EJB
    private HelperBeanA10 helperBeanA10;
    @EJB
    private HelperBeanB10 helperBeanB10;
    @EJB
    private HelperBeanC10 helperBeanC10;
    @EJB
    private HelperBeanD10 helperBeanD10;
    @EJB
    private HelperBeanE10 helperBeanE10;
    @EJB
    private HelperBeanF10 helperBeanF10;
    @EJB
    private HelperBeanG10 helperBeanG10;
    @EJB
    private HelperBeanH10 helperBeanH10;
    @EJB
    private HelperBeanI10 helperBeanI10;
    @EJB
    private HelperBeanJ10 helperBeanJ10;
    @EJB
    private HelperBeanK10 helperBeanK10;
    @EJB
    private HelperBeanL10 helperBeanL10;
    @EJB
    private HelperBeanM10 helperBeanM10;
    @EJB
    private HelperBeanN10 helperBeanN10;
    @EJB
    private HelperBeanO10 helperBeanO10;

    @EJB
    private StartupBean10 startupBean10;

    public String whoAmI() {
        return "i'm ExampleService10 "
        + helperBeanA10.identify()
        + helperBeanB10.identify()
        + helperBeanC10.identify()
        + helperBeanD10.identify()
        + helperBeanE10.identify()
        + helperBeanF10.identify()
        + helperBeanG10.identify()
        + helperBeanH10.identify()
        + helperBeanI10.identify()
        + helperBeanJ10.identify()
        + helperBeanK10.identify()
        + helperBeanL10.identify()
        + helperBeanM10.identify()
        + helperBeanN10.identify()
        + helperBeanO10.identify();
    }

}
