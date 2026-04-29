package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService109 {

    @EJB
    private HelperBeanA109 helperBeanA109;
    @EJB
    private HelperBeanB109 helperBeanB109;
    @EJB
    private HelperBeanC109 helperBeanC109;
    @EJB
    private HelperBeanD109 helperBeanD109;
    @EJB
    private HelperBeanE109 helperBeanE109;
    @EJB
    private HelperBeanF109 helperBeanF109;
    @EJB
    private HelperBeanG109 helperBeanG109;
    @EJB
    private HelperBeanH109 helperBeanH109;
    @EJB
    private HelperBeanI109 helperBeanI109;
    @EJB
    private HelperBeanJ109 helperBeanJ109;
    @EJB
    private HelperBeanK109 helperBeanK109;
    @EJB
    private HelperBeanL109 helperBeanL109;
    @EJB
    private HelperBeanM109 helperBeanM109;
    @EJB
    private HelperBeanN109 helperBeanN109;
    @EJB
    private HelperBeanO109 helperBeanO109;

    @EJB
    private StartupBean109 startupBean109;

    public String whoAmI() {
        return "i'm ExampleService109 "
        + helperBeanA109.identify()
        + helperBeanB109.identify()
        + helperBeanC109.identify()
        + helperBeanD109.identify()
        + helperBeanE109.identify()
        + helperBeanF109.identify()
        + helperBeanG109.identify()
        + helperBeanH109.identify()
        + helperBeanI109.identify()
        + helperBeanJ109.identify()
        + helperBeanK109.identify()
        + helperBeanL109.identify()
        + helperBeanM109.identify()
        + helperBeanN109.identify()
        + helperBeanO109.identify();
    }

}
