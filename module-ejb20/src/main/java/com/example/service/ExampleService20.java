package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService20 {

    @EJB
    private HelperBeanA20 helperBeanA20;
    @EJB
    private HelperBeanB20 helperBeanB20;
    @EJB
    private HelperBeanC20 helperBeanC20;
    @EJB
    private HelperBeanD20 helperBeanD20;
    @EJB
    private HelperBeanE20 helperBeanE20;
    @EJB
    private HelperBeanF20 helperBeanF20;
    @EJB
    private HelperBeanG20 helperBeanG20;
    @EJB
    private HelperBeanH20 helperBeanH20;
    @EJB
    private HelperBeanI20 helperBeanI20;
    @EJB
    private HelperBeanJ20 helperBeanJ20;
    @EJB
    private HelperBeanK20 helperBeanK20;
    @EJB
    private HelperBeanL20 helperBeanL20;
    @EJB
    private HelperBeanM20 helperBeanM20;
    @EJB
    private HelperBeanN20 helperBeanN20;
    @EJB
    private HelperBeanO20 helperBeanO20;

    @EJB
    private StartupBean20 startupBean20;

    public String whoAmI() {
        return "i'm ExampleService20 "
        + helperBeanA20.identify()
        + helperBeanB20.identify()
        + helperBeanC20.identify()
        + helperBeanD20.identify()
        + helperBeanE20.identify()
        + helperBeanF20.identify()
        + helperBeanG20.identify()
        + helperBeanH20.identify()
        + helperBeanI20.identify()
        + helperBeanJ20.identify()
        + helperBeanK20.identify()
        + helperBeanL20.identify()
        + helperBeanM20.identify()
        + helperBeanN20.identify()
        + helperBeanO20.identify();
    }

}
