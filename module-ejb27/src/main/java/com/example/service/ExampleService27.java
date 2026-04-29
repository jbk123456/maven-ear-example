package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService27 {

    @EJB
    private HelperBeanA27 helperBeanA27;
    @EJB
    private HelperBeanB27 helperBeanB27;
    @EJB
    private HelperBeanC27 helperBeanC27;
    @EJB
    private HelperBeanD27 helperBeanD27;
    @EJB
    private HelperBeanE27 helperBeanE27;
    @EJB
    private HelperBeanF27 helperBeanF27;
    @EJB
    private HelperBeanG27 helperBeanG27;
    @EJB
    private HelperBeanH27 helperBeanH27;
    @EJB
    private HelperBeanI27 helperBeanI27;
    @EJB
    private HelperBeanJ27 helperBeanJ27;
    @EJB
    private HelperBeanK27 helperBeanK27;
    @EJB
    private HelperBeanL27 helperBeanL27;
    @EJB
    private HelperBeanM27 helperBeanM27;
    @EJB
    private HelperBeanN27 helperBeanN27;
    @EJB
    private HelperBeanO27 helperBeanO27;

    @EJB
    private StartupBean27 startupBean27;

    public String whoAmI() {
        return "i'm ExampleService27 "
        + helperBeanA27.identify()
        + helperBeanB27.identify()
        + helperBeanC27.identify()
        + helperBeanD27.identify()
        + helperBeanE27.identify()
        + helperBeanF27.identify()
        + helperBeanG27.identify()
        + helperBeanH27.identify()
        + helperBeanI27.identify()
        + helperBeanJ27.identify()
        + helperBeanK27.identify()
        + helperBeanL27.identify()
        + helperBeanM27.identify()
        + helperBeanN27.identify()
        + helperBeanO27.identify();
    }

}
