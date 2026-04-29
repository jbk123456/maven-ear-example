package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService159 {

    @EJB
    private HelperBeanA159 helperBeanA159;
    @EJB
    private HelperBeanB159 helperBeanB159;
    @EJB
    private HelperBeanC159 helperBeanC159;
    @EJB
    private HelperBeanD159 helperBeanD159;
    @EJB
    private HelperBeanE159 helperBeanE159;
    @EJB
    private HelperBeanF159 helperBeanF159;
    @EJB
    private HelperBeanG159 helperBeanG159;
    @EJB
    private HelperBeanH159 helperBeanH159;
    @EJB
    private HelperBeanI159 helperBeanI159;
    @EJB
    private HelperBeanJ159 helperBeanJ159;
    @EJB
    private HelperBeanK159 helperBeanK159;
    @EJB
    private HelperBeanL159 helperBeanL159;
    @EJB
    private HelperBeanM159 helperBeanM159;
    @EJB
    private HelperBeanN159 helperBeanN159;
    @EJB
    private HelperBeanO159 helperBeanO159;

    @EJB
    private StartupBean159 startupBean159;

    public String whoAmI() {
        return "i'm ExampleService159 "
        + helperBeanA159.identify()
        + helperBeanB159.identify()
        + helperBeanC159.identify()
        + helperBeanD159.identify()
        + helperBeanE159.identify()
        + helperBeanF159.identify()
        + helperBeanG159.identify()
        + helperBeanH159.identify()
        + helperBeanI159.identify()
        + helperBeanJ159.identify()
        + helperBeanK159.identify()
        + helperBeanL159.identify()
        + helperBeanM159.identify()
        + helperBeanN159.identify()
        + helperBeanO159.identify();
    }

}
