package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService25 {

    @EJB
    private HelperBeanA25 helperBeanA25;
    @EJB
    private HelperBeanB25 helperBeanB25;
    @EJB
    private HelperBeanC25 helperBeanC25;
    @EJB
    private HelperBeanD25 helperBeanD25;
    @EJB
    private HelperBeanE25 helperBeanE25;
    @EJB
    private HelperBeanF25 helperBeanF25;
    @EJB
    private HelperBeanG25 helperBeanG25;
    @EJB
    private HelperBeanH25 helperBeanH25;
    @EJB
    private HelperBeanI25 helperBeanI25;
    @EJB
    private HelperBeanJ25 helperBeanJ25;
    @EJB
    private HelperBeanK25 helperBeanK25;
    @EJB
    private HelperBeanL25 helperBeanL25;
    @EJB
    private HelperBeanM25 helperBeanM25;
    @EJB
    private HelperBeanN25 helperBeanN25;
    @EJB
    private HelperBeanO25 helperBeanO25;

    @EJB
    private StartupBean25 startupBean25;

    public String whoAmI() {
        return "i'm ExampleService25 "
        + helperBeanA25.identify()
        + helperBeanB25.identify()
        + helperBeanC25.identify()
        + helperBeanD25.identify()
        + helperBeanE25.identify()
        + helperBeanF25.identify()
        + helperBeanG25.identify()
        + helperBeanH25.identify()
        + helperBeanI25.identify()
        + helperBeanJ25.identify()
        + helperBeanK25.identify()
        + helperBeanL25.identify()
        + helperBeanM25.identify()
        + helperBeanN25.identify()
        + helperBeanO25.identify();
    }

}
