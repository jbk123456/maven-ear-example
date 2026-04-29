package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService58 {

    @EJB
    private HelperBeanA58 helperBeanA58;
    @EJB
    private HelperBeanB58 helperBeanB58;
    @EJB
    private HelperBeanC58 helperBeanC58;
    @EJB
    private HelperBeanD58 helperBeanD58;
    @EJB
    private HelperBeanE58 helperBeanE58;
    @EJB
    private HelperBeanF58 helperBeanF58;
    @EJB
    private HelperBeanG58 helperBeanG58;
    @EJB
    private HelperBeanH58 helperBeanH58;
    @EJB
    private HelperBeanI58 helperBeanI58;
    @EJB
    private HelperBeanJ58 helperBeanJ58;
    @EJB
    private HelperBeanK58 helperBeanK58;
    @EJB
    private HelperBeanL58 helperBeanL58;
    @EJB
    private HelperBeanM58 helperBeanM58;
    @EJB
    private HelperBeanN58 helperBeanN58;
    @EJB
    private HelperBeanO58 helperBeanO58;

    @EJB
    private StartupBean58 startupBean58;

    public String whoAmI() {
        return "i'm ExampleService58 "
        + helperBeanA58.identify()
        + helperBeanB58.identify()
        + helperBeanC58.identify()
        + helperBeanD58.identify()
        + helperBeanE58.identify()
        + helperBeanF58.identify()
        + helperBeanG58.identify()
        + helperBeanH58.identify()
        + helperBeanI58.identify()
        + helperBeanJ58.identify()
        + helperBeanK58.identify()
        + helperBeanL58.identify()
        + helperBeanM58.identify()
        + helperBeanN58.identify()
        + helperBeanO58.identify();
    }

}
