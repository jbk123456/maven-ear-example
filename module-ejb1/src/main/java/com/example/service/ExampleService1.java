package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService1 {

    @EJB
    private HelperBeanA1 helperBeanA1;
    @EJB
    private HelperBeanB1 helperBeanB1;
    @EJB
    private HelperBeanC1 helperBeanC1;
    @EJB
    private HelperBeanD1 helperBeanD1;
    @EJB
    private HelperBeanE1 helperBeanE1;
    @EJB
    private HelperBeanF1 helperBeanF1;
    @EJB
    private HelperBeanG1 helperBeanG1;
    @EJB
    private HelperBeanH1 helperBeanH1;
    @EJB
    private HelperBeanI1 helperBeanI1;
    @EJB
    private HelperBeanJ1 helperBeanJ1;
    @EJB
    private HelperBeanK1 helperBeanK1;
    @EJB
    private HelperBeanL1 helperBeanL1;
    @EJB
    private HelperBeanM1 helperBeanM1;
    @EJB
    private HelperBeanN1 helperBeanN1;
    @EJB
    private HelperBeanO1 helperBeanO1;

    @EJB
    private StartupBean1 startupBean1;

    public String whoAmI() {
        return "i'm ExampleService1 "
        + helperBeanA1.identify()
        + helperBeanB1.identify()
        + helperBeanC1.identify()
        + helperBeanD1.identify()
        + helperBeanE1.identify()
        + helperBeanF1.identify()
        + helperBeanG1.identify()
        + helperBeanH1.identify()
        + helperBeanI1.identify()
        + helperBeanJ1.identify()
        + helperBeanK1.identify()
        + helperBeanL1.identify()
        + helperBeanM1.identify()
        + helperBeanN1.identify()
        + helperBeanO1.identify();
    }

}
