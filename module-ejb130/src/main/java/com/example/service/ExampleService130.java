package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService130 {

    @EJB
    private HelperBeanA130 helperBeanA130;
    @EJB
    private HelperBeanB130 helperBeanB130;
    @EJB
    private HelperBeanC130 helperBeanC130;
    @EJB
    private HelperBeanD130 helperBeanD130;
    @EJB
    private HelperBeanE130 helperBeanE130;
    @EJB
    private HelperBeanF130 helperBeanF130;
    @EJB
    private HelperBeanG130 helperBeanG130;
    @EJB
    private HelperBeanH130 helperBeanH130;
    @EJB
    private HelperBeanI130 helperBeanI130;
    @EJB
    private HelperBeanJ130 helperBeanJ130;
    @EJB
    private HelperBeanK130 helperBeanK130;
    @EJB
    private HelperBeanL130 helperBeanL130;
    @EJB
    private HelperBeanM130 helperBeanM130;
    @EJB
    private HelperBeanN130 helperBeanN130;
    @EJB
    private HelperBeanO130 helperBeanO130;

    @EJB
    private StartupBean130 startupBean130;

    public String whoAmI() {
        return "i'm ExampleService130 "
        + helperBeanA130.identify()
        + helperBeanB130.identify()
        + helperBeanC130.identify()
        + helperBeanD130.identify()
        + helperBeanE130.identify()
        + helperBeanF130.identify()
        + helperBeanG130.identify()
        + helperBeanH130.identify()
        + helperBeanI130.identify()
        + helperBeanJ130.identify()
        + helperBeanK130.identify()
        + helperBeanL130.identify()
        + helperBeanM130.identify()
        + helperBeanN130.identify()
        + helperBeanO130.identify();
    }

}
