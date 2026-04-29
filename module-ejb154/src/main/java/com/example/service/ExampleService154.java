package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService154 {

    @EJB
    private HelperBeanA154 helperBeanA154;
    @EJB
    private HelperBeanB154 helperBeanB154;
    @EJB
    private HelperBeanC154 helperBeanC154;
    @EJB
    private HelperBeanD154 helperBeanD154;
    @EJB
    private HelperBeanE154 helperBeanE154;
    @EJB
    private HelperBeanF154 helperBeanF154;
    @EJB
    private HelperBeanG154 helperBeanG154;
    @EJB
    private HelperBeanH154 helperBeanH154;
    @EJB
    private HelperBeanI154 helperBeanI154;
    @EJB
    private HelperBeanJ154 helperBeanJ154;
    @EJB
    private HelperBeanK154 helperBeanK154;
    @EJB
    private HelperBeanL154 helperBeanL154;
    @EJB
    private HelperBeanM154 helperBeanM154;
    @EJB
    private HelperBeanN154 helperBeanN154;
    @EJB
    private HelperBeanO154 helperBeanO154;

    @EJB
    private StartupBean154 startupBean154;

    public String whoAmI() {
        return "i'm ExampleService154 "
        + helperBeanA154.identify()
        + helperBeanB154.identify()
        + helperBeanC154.identify()
        + helperBeanD154.identify()
        + helperBeanE154.identify()
        + helperBeanF154.identify()
        + helperBeanG154.identify()
        + helperBeanH154.identify()
        + helperBeanI154.identify()
        + helperBeanJ154.identify()
        + helperBeanK154.identify()
        + helperBeanL154.identify()
        + helperBeanM154.identify()
        + helperBeanN154.identify()
        + helperBeanO154.identify();
    }

}
