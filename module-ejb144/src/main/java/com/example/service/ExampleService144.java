package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService144 {

    @EJB
    private HelperBeanA144 helperBeanA144;
    @EJB
    private HelperBeanB144 helperBeanB144;
    @EJB
    private HelperBeanC144 helperBeanC144;
    @EJB
    private HelperBeanD144 helperBeanD144;
    @EJB
    private HelperBeanE144 helperBeanE144;
    @EJB
    private HelperBeanF144 helperBeanF144;
    @EJB
    private HelperBeanG144 helperBeanG144;
    @EJB
    private HelperBeanH144 helperBeanH144;
    @EJB
    private HelperBeanI144 helperBeanI144;
    @EJB
    private HelperBeanJ144 helperBeanJ144;
    @EJB
    private HelperBeanK144 helperBeanK144;
    @EJB
    private HelperBeanL144 helperBeanL144;
    @EJB
    private HelperBeanM144 helperBeanM144;
    @EJB
    private HelperBeanN144 helperBeanN144;
    @EJB
    private HelperBeanO144 helperBeanO144;

    @EJB
    private StartupBean144 startupBean144;

    public String whoAmI() {
        return "i'm ExampleService144 "
        + helperBeanA144.identify()
        + helperBeanB144.identify()
        + helperBeanC144.identify()
        + helperBeanD144.identify()
        + helperBeanE144.identify()
        + helperBeanF144.identify()
        + helperBeanG144.identify()
        + helperBeanH144.identify()
        + helperBeanI144.identify()
        + helperBeanJ144.identify()
        + helperBeanK144.identify()
        + helperBeanL144.identify()
        + helperBeanM144.identify()
        + helperBeanN144.identify()
        + helperBeanO144.identify();
    }

}
