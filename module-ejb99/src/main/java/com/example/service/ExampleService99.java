package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService99 {

    @EJB
    private HelperBeanA99 helperBeanA99;
    @EJB
    private HelperBeanB99 helperBeanB99;
    @EJB
    private HelperBeanC99 helperBeanC99;
    @EJB
    private HelperBeanD99 helperBeanD99;
    @EJB
    private HelperBeanE99 helperBeanE99;
    @EJB
    private HelperBeanF99 helperBeanF99;
    @EJB
    private HelperBeanG99 helperBeanG99;
    @EJB
    private HelperBeanH99 helperBeanH99;
    @EJB
    private HelperBeanI99 helperBeanI99;
    @EJB
    private HelperBeanJ99 helperBeanJ99;
    @EJB
    private HelperBeanK99 helperBeanK99;
    @EJB
    private HelperBeanL99 helperBeanL99;
    @EJB
    private HelperBeanM99 helperBeanM99;
    @EJB
    private HelperBeanN99 helperBeanN99;
    @EJB
    private HelperBeanO99 helperBeanO99;

    @EJB
    private StartupBean99 startupBean99;

    public String whoAmI() {
        return "i'm ExampleService99 "
        + helperBeanA99.identify()
        + helperBeanB99.identify()
        + helperBeanC99.identify()
        + helperBeanD99.identify()
        + helperBeanE99.identify()
        + helperBeanF99.identify()
        + helperBeanG99.identify()
        + helperBeanH99.identify()
        + helperBeanI99.identify()
        + helperBeanJ99.identify()
        + helperBeanK99.identify()
        + helperBeanL99.identify()
        + helperBeanM99.identify()
        + helperBeanN99.identify()
        + helperBeanO99.identify();
    }

}
