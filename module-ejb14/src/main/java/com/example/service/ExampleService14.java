package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService14 {

    @EJB
    private HelperBeanA14 helperBeanA14;
    @EJB
    private HelperBeanB14 helperBeanB14;
    @EJB
    private HelperBeanC14 helperBeanC14;
    @EJB
    private HelperBeanD14 helperBeanD14;
    @EJB
    private HelperBeanE14 helperBeanE14;
    @EJB
    private HelperBeanF14 helperBeanF14;
    @EJB
    private HelperBeanG14 helperBeanG14;
    @EJB
    private HelperBeanH14 helperBeanH14;
    @EJB
    private HelperBeanI14 helperBeanI14;
    @EJB
    private HelperBeanJ14 helperBeanJ14;
    @EJB
    private HelperBeanK14 helperBeanK14;
    @EJB
    private HelperBeanL14 helperBeanL14;
    @EJB
    private HelperBeanM14 helperBeanM14;
    @EJB
    private HelperBeanN14 helperBeanN14;
    @EJB
    private HelperBeanO14 helperBeanO14;

    @EJB
    private StartupBean14 startupBean14;

    public String whoAmI() {
        return "i'm ExampleService14 "
        + helperBeanA14.identify()
        + helperBeanB14.identify()
        + helperBeanC14.identify()
        + helperBeanD14.identify()
        + helperBeanE14.identify()
        + helperBeanF14.identify()
        + helperBeanG14.identify()
        + helperBeanH14.identify()
        + helperBeanI14.identify()
        + helperBeanJ14.identify()
        + helperBeanK14.identify()
        + helperBeanL14.identify()
        + helperBeanM14.identify()
        + helperBeanN14.identify()
        + helperBeanO14.identify();
    }

}
