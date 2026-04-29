package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService50 {

    @EJB
    private HelperBeanA50 helperBeanA50;
    @EJB
    private HelperBeanB50 helperBeanB50;
    @EJB
    private HelperBeanC50 helperBeanC50;
    @EJB
    private HelperBeanD50 helperBeanD50;
    @EJB
    private HelperBeanE50 helperBeanE50;
    @EJB
    private HelperBeanF50 helperBeanF50;
    @EJB
    private HelperBeanG50 helperBeanG50;
    @EJB
    private HelperBeanH50 helperBeanH50;
    @EJB
    private HelperBeanI50 helperBeanI50;
    @EJB
    private HelperBeanJ50 helperBeanJ50;
    @EJB
    private HelperBeanK50 helperBeanK50;
    @EJB
    private HelperBeanL50 helperBeanL50;
    @EJB
    private HelperBeanM50 helperBeanM50;
    @EJB
    private HelperBeanN50 helperBeanN50;
    @EJB
    private HelperBeanO50 helperBeanO50;

    @EJB
    private StartupBean50 startupBean50;

    public String whoAmI() {
        return "i'm ExampleService50 "
        + helperBeanA50.identify()
        + helperBeanB50.identify()
        + helperBeanC50.identify()
        + helperBeanD50.identify()
        + helperBeanE50.identify()
        + helperBeanF50.identify()
        + helperBeanG50.identify()
        + helperBeanH50.identify()
        + helperBeanI50.identify()
        + helperBeanJ50.identify()
        + helperBeanK50.identify()
        + helperBeanL50.identify()
        + helperBeanM50.identify()
        + helperBeanN50.identify()
        + helperBeanO50.identify();
    }

}
