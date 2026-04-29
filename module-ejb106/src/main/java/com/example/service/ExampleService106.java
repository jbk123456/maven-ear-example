package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService106 {

    @EJB
    private HelperBeanA106 helperBeanA106;
    @EJB
    private HelperBeanB106 helperBeanB106;
    @EJB
    private HelperBeanC106 helperBeanC106;
    @EJB
    private HelperBeanD106 helperBeanD106;
    @EJB
    private HelperBeanE106 helperBeanE106;
    @EJB
    private HelperBeanF106 helperBeanF106;
    @EJB
    private HelperBeanG106 helperBeanG106;
    @EJB
    private HelperBeanH106 helperBeanH106;
    @EJB
    private HelperBeanI106 helperBeanI106;
    @EJB
    private HelperBeanJ106 helperBeanJ106;
    @EJB
    private HelperBeanK106 helperBeanK106;
    @EJB
    private HelperBeanL106 helperBeanL106;
    @EJB
    private HelperBeanM106 helperBeanM106;
    @EJB
    private HelperBeanN106 helperBeanN106;
    @EJB
    private HelperBeanO106 helperBeanO106;

    @EJB
    private StartupBean106 startupBean106;

    public String whoAmI() {
        return "i'm ExampleService106 "
        + helperBeanA106.identify()
        + helperBeanB106.identify()
        + helperBeanC106.identify()
        + helperBeanD106.identify()
        + helperBeanE106.identify()
        + helperBeanF106.identify()
        + helperBeanG106.identify()
        + helperBeanH106.identify()
        + helperBeanI106.identify()
        + helperBeanJ106.identify()
        + helperBeanK106.identify()
        + helperBeanL106.identify()
        + helperBeanM106.identify()
        + helperBeanN106.identify()
        + helperBeanO106.identify();
    }

}
