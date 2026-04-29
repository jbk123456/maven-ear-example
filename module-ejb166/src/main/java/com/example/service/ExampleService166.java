package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService166 {

    @EJB
    private HelperBeanA166 helperBeanA166;
    @EJB
    private HelperBeanB166 helperBeanB166;
    @EJB
    private HelperBeanC166 helperBeanC166;
    @EJB
    private HelperBeanD166 helperBeanD166;
    @EJB
    private HelperBeanE166 helperBeanE166;
    @EJB
    private HelperBeanF166 helperBeanF166;
    @EJB
    private HelperBeanG166 helperBeanG166;
    @EJB
    private HelperBeanH166 helperBeanH166;
    @EJB
    private HelperBeanI166 helperBeanI166;
    @EJB
    private HelperBeanJ166 helperBeanJ166;
    @EJB
    private HelperBeanK166 helperBeanK166;
    @EJB
    private HelperBeanL166 helperBeanL166;
    @EJB
    private HelperBeanM166 helperBeanM166;
    @EJB
    private HelperBeanN166 helperBeanN166;
    @EJB
    private HelperBeanO166 helperBeanO166;

    @EJB
    private StartupBean166 startupBean166;

    public String whoAmI() {
        return "i'm ExampleService166 "
        + helperBeanA166.identify()
        + helperBeanB166.identify()
        + helperBeanC166.identify()
        + helperBeanD166.identify()
        + helperBeanE166.identify()
        + helperBeanF166.identify()
        + helperBeanG166.identify()
        + helperBeanH166.identify()
        + helperBeanI166.identify()
        + helperBeanJ166.identify()
        + helperBeanK166.identify()
        + helperBeanL166.identify()
        + helperBeanM166.identify()
        + helperBeanN166.identify()
        + helperBeanO166.identify();
    }

}
