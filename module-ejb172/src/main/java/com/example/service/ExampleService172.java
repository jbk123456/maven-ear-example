package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService172 {

    @EJB
    private HelperBeanA172 helperBeanA172;
    @EJB
    private HelperBeanB172 helperBeanB172;
    @EJB
    private HelperBeanC172 helperBeanC172;
    @EJB
    private HelperBeanD172 helperBeanD172;
    @EJB
    private HelperBeanE172 helperBeanE172;
    @EJB
    private HelperBeanF172 helperBeanF172;
    @EJB
    private HelperBeanG172 helperBeanG172;
    @EJB
    private HelperBeanH172 helperBeanH172;
    @EJB
    private HelperBeanI172 helperBeanI172;
    @EJB
    private HelperBeanJ172 helperBeanJ172;
    @EJB
    private HelperBeanK172 helperBeanK172;
    @EJB
    private HelperBeanL172 helperBeanL172;
    @EJB
    private HelperBeanM172 helperBeanM172;
    @EJB
    private HelperBeanN172 helperBeanN172;
    @EJB
    private HelperBeanO172 helperBeanO172;

    @EJB
    private StartupBean172 startupBean172;

    public String whoAmI() {
        return "i'm ExampleService172 "
        + helperBeanA172.identify()
        + helperBeanB172.identify()
        + helperBeanC172.identify()
        + helperBeanD172.identify()
        + helperBeanE172.identify()
        + helperBeanF172.identify()
        + helperBeanG172.identify()
        + helperBeanH172.identify()
        + helperBeanI172.identify()
        + helperBeanJ172.identify()
        + helperBeanK172.identify()
        + helperBeanL172.identify()
        + helperBeanM172.identify()
        + helperBeanN172.identify()
        + helperBeanO172.identify();
    }

}
