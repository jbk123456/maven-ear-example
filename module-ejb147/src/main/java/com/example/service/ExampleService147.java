package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService147 {

    @EJB
    private HelperBeanA147 helperBeanA147;
    @EJB
    private HelperBeanB147 helperBeanB147;
    @EJB
    private HelperBeanC147 helperBeanC147;
    @EJB
    private HelperBeanD147 helperBeanD147;
    @EJB
    private HelperBeanE147 helperBeanE147;
    @EJB
    private HelperBeanF147 helperBeanF147;
    @EJB
    private HelperBeanG147 helperBeanG147;
    @EJB
    private HelperBeanH147 helperBeanH147;
    @EJB
    private HelperBeanI147 helperBeanI147;
    @EJB
    private HelperBeanJ147 helperBeanJ147;
    @EJB
    private HelperBeanK147 helperBeanK147;
    @EJB
    private HelperBeanL147 helperBeanL147;
    @EJB
    private HelperBeanM147 helperBeanM147;
    @EJB
    private HelperBeanN147 helperBeanN147;
    @EJB
    private HelperBeanO147 helperBeanO147;

    @EJB
    private StartupBean147 startupBean147;

    public String whoAmI() {
        return "i'm ExampleService147 "
        + helperBeanA147.identify()
        + helperBeanB147.identify()
        + helperBeanC147.identify()
        + helperBeanD147.identify()
        + helperBeanE147.identify()
        + helperBeanF147.identify()
        + helperBeanG147.identify()
        + helperBeanH147.identify()
        + helperBeanI147.identify()
        + helperBeanJ147.identify()
        + helperBeanK147.identify()
        + helperBeanL147.identify()
        + helperBeanM147.identify()
        + helperBeanN147.identify()
        + helperBeanO147.identify();
    }

}
