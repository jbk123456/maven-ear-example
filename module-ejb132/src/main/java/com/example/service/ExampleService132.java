package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService132 {

    @EJB
    private HelperBeanA132 helperBeanA132;
    @EJB
    private HelperBeanB132 helperBeanB132;
    @EJB
    private HelperBeanC132 helperBeanC132;
    @EJB
    private HelperBeanD132 helperBeanD132;
    @EJB
    private HelperBeanE132 helperBeanE132;
    @EJB
    private HelperBeanF132 helperBeanF132;
    @EJB
    private HelperBeanG132 helperBeanG132;
    @EJB
    private HelperBeanH132 helperBeanH132;
    @EJB
    private HelperBeanI132 helperBeanI132;
    @EJB
    private HelperBeanJ132 helperBeanJ132;
    @EJB
    private HelperBeanK132 helperBeanK132;
    @EJB
    private HelperBeanL132 helperBeanL132;
    @EJB
    private HelperBeanM132 helperBeanM132;
    @EJB
    private HelperBeanN132 helperBeanN132;
    @EJB
    private HelperBeanO132 helperBeanO132;

    @EJB
    private StartupBean132 startupBean132;

    public String whoAmI() {
        return "i'm ExampleService132 "
        + helperBeanA132.identify()
        + helperBeanB132.identify()
        + helperBeanC132.identify()
        + helperBeanD132.identify()
        + helperBeanE132.identify()
        + helperBeanF132.identify()
        + helperBeanG132.identify()
        + helperBeanH132.identify()
        + helperBeanI132.identify()
        + helperBeanJ132.identify()
        + helperBeanK132.identify()
        + helperBeanL132.identify()
        + helperBeanM132.identify()
        + helperBeanN132.identify()
        + helperBeanO132.identify();
    }

}
