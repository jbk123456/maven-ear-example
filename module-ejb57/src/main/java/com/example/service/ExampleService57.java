package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService57 {

    @EJB
    private HelperBeanA57 helperBeanA57;
    @EJB
    private HelperBeanB57 helperBeanB57;
    @EJB
    private HelperBeanC57 helperBeanC57;
    @EJB
    private HelperBeanD57 helperBeanD57;
    @EJB
    private HelperBeanE57 helperBeanE57;
    @EJB
    private HelperBeanF57 helperBeanF57;
    @EJB
    private HelperBeanG57 helperBeanG57;
    @EJB
    private HelperBeanH57 helperBeanH57;
    @EJB
    private HelperBeanI57 helperBeanI57;
    @EJB
    private HelperBeanJ57 helperBeanJ57;
    @EJB
    private HelperBeanK57 helperBeanK57;
    @EJB
    private HelperBeanL57 helperBeanL57;
    @EJB
    private HelperBeanM57 helperBeanM57;
    @EJB
    private HelperBeanN57 helperBeanN57;
    @EJB
    private HelperBeanO57 helperBeanO57;

    @EJB
    private StartupBean57 startupBean57;

    public String whoAmI() {
        return "i'm ExampleService57 "
        + helperBeanA57.identify()
        + helperBeanB57.identify()
        + helperBeanC57.identify()
        + helperBeanD57.identify()
        + helperBeanE57.identify()
        + helperBeanF57.identify()
        + helperBeanG57.identify()
        + helperBeanH57.identify()
        + helperBeanI57.identify()
        + helperBeanJ57.identify()
        + helperBeanK57.identify()
        + helperBeanL57.identify()
        + helperBeanM57.identify()
        + helperBeanN57.identify()
        + helperBeanO57.identify();
    }

}
