package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService52 {

    @EJB
    private HelperBeanA52 helperBeanA52;
    @EJB
    private HelperBeanB52 helperBeanB52;
    @EJB
    private HelperBeanC52 helperBeanC52;
    @EJB
    private HelperBeanD52 helperBeanD52;
    @EJB
    private HelperBeanE52 helperBeanE52;
    @EJB
    private HelperBeanF52 helperBeanF52;
    @EJB
    private HelperBeanG52 helperBeanG52;
    @EJB
    private HelperBeanH52 helperBeanH52;
    @EJB
    private HelperBeanI52 helperBeanI52;
    @EJB
    private HelperBeanJ52 helperBeanJ52;
    @EJB
    private HelperBeanK52 helperBeanK52;
    @EJB
    private HelperBeanL52 helperBeanL52;
    @EJB
    private HelperBeanM52 helperBeanM52;
    @EJB
    private HelperBeanN52 helperBeanN52;
    @EJB
    private HelperBeanO52 helperBeanO52;

    @EJB
    private StartupBean52 startupBean52;

    public String whoAmI() {
        return "i'm ExampleService52 "
        + helperBeanA52.identify()
        + helperBeanB52.identify()
        + helperBeanC52.identify()
        + helperBeanD52.identify()
        + helperBeanE52.identify()
        + helperBeanF52.identify()
        + helperBeanG52.identify()
        + helperBeanH52.identify()
        + helperBeanI52.identify()
        + helperBeanJ52.identify()
        + helperBeanK52.identify()
        + helperBeanL52.identify()
        + helperBeanM52.identify()
        + helperBeanN52.identify()
        + helperBeanO52.identify();
    }

}
