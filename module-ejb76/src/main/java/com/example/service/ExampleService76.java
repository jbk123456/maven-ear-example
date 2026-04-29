package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService76 {

    @EJB
    private HelperBeanA76 helperBeanA76;
    @EJB
    private HelperBeanB76 helperBeanB76;
    @EJB
    private HelperBeanC76 helperBeanC76;
    @EJB
    private HelperBeanD76 helperBeanD76;
    @EJB
    private HelperBeanE76 helperBeanE76;
    @EJB
    private HelperBeanF76 helperBeanF76;
    @EJB
    private HelperBeanG76 helperBeanG76;
    @EJB
    private HelperBeanH76 helperBeanH76;
    @EJB
    private HelperBeanI76 helperBeanI76;
    @EJB
    private HelperBeanJ76 helperBeanJ76;
    @EJB
    private HelperBeanK76 helperBeanK76;
    @EJB
    private HelperBeanL76 helperBeanL76;
    @EJB
    private HelperBeanM76 helperBeanM76;
    @EJB
    private HelperBeanN76 helperBeanN76;
    @EJB
    private HelperBeanO76 helperBeanO76;

    @EJB
    private StartupBean76 startupBean76;

    public String whoAmI() {
        return "i'm ExampleService76 "
        + helperBeanA76.identify()
        + helperBeanB76.identify()
        + helperBeanC76.identify()
        + helperBeanD76.identify()
        + helperBeanE76.identify()
        + helperBeanF76.identify()
        + helperBeanG76.identify()
        + helperBeanH76.identify()
        + helperBeanI76.identify()
        + helperBeanJ76.identify()
        + helperBeanK76.identify()
        + helperBeanL76.identify()
        + helperBeanM76.identify()
        + helperBeanN76.identify()
        + helperBeanO76.identify();
    }

}
