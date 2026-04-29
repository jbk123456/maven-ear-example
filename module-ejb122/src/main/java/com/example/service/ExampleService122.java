package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService122 {

    @EJB
    private HelperBeanA122 helperBeanA122;
    @EJB
    private HelperBeanB122 helperBeanB122;
    @EJB
    private HelperBeanC122 helperBeanC122;
    @EJB
    private HelperBeanD122 helperBeanD122;
    @EJB
    private HelperBeanE122 helperBeanE122;
    @EJB
    private HelperBeanF122 helperBeanF122;
    @EJB
    private HelperBeanG122 helperBeanG122;
    @EJB
    private HelperBeanH122 helperBeanH122;
    @EJB
    private HelperBeanI122 helperBeanI122;
    @EJB
    private HelperBeanJ122 helperBeanJ122;
    @EJB
    private HelperBeanK122 helperBeanK122;
    @EJB
    private HelperBeanL122 helperBeanL122;
    @EJB
    private HelperBeanM122 helperBeanM122;
    @EJB
    private HelperBeanN122 helperBeanN122;
    @EJB
    private HelperBeanO122 helperBeanO122;

    @EJB
    private StartupBean122 startupBean122;

    public String whoAmI() {
        return "i'm ExampleService122 "
        + helperBeanA122.identify()
        + helperBeanB122.identify()
        + helperBeanC122.identify()
        + helperBeanD122.identify()
        + helperBeanE122.identify()
        + helperBeanF122.identify()
        + helperBeanG122.identify()
        + helperBeanH122.identify()
        + helperBeanI122.identify()
        + helperBeanJ122.identify()
        + helperBeanK122.identify()
        + helperBeanL122.identify()
        + helperBeanM122.identify()
        + helperBeanN122.identify()
        + helperBeanO122.identify();
    }

}
