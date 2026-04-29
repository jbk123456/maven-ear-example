package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService53 {

    @EJB
    private HelperBeanA53 helperBeanA53;
    @EJB
    private HelperBeanB53 helperBeanB53;
    @EJB
    private HelperBeanC53 helperBeanC53;
    @EJB
    private HelperBeanD53 helperBeanD53;
    @EJB
    private HelperBeanE53 helperBeanE53;
    @EJB
    private HelperBeanF53 helperBeanF53;
    @EJB
    private HelperBeanG53 helperBeanG53;
    @EJB
    private HelperBeanH53 helperBeanH53;
    @EJB
    private HelperBeanI53 helperBeanI53;
    @EJB
    private HelperBeanJ53 helperBeanJ53;
    @EJB
    private HelperBeanK53 helperBeanK53;
    @EJB
    private HelperBeanL53 helperBeanL53;
    @EJB
    private HelperBeanM53 helperBeanM53;
    @EJB
    private HelperBeanN53 helperBeanN53;
    @EJB
    private HelperBeanO53 helperBeanO53;

    @EJB
    private StartupBean53 startupBean53;

    public String whoAmI() {
        return "i'm ExampleService53 "
        + helperBeanA53.identify()
        + helperBeanB53.identify()
        + helperBeanC53.identify()
        + helperBeanD53.identify()
        + helperBeanE53.identify()
        + helperBeanF53.identify()
        + helperBeanG53.identify()
        + helperBeanH53.identify()
        + helperBeanI53.identify()
        + helperBeanJ53.identify()
        + helperBeanK53.identify()
        + helperBeanL53.identify()
        + helperBeanM53.identify()
        + helperBeanN53.identify()
        + helperBeanO53.identify();
    }

}
