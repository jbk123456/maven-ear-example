package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService110 {

    @EJB
    private HelperBeanA110 helperBeanA110;
    @EJB
    private HelperBeanB110 helperBeanB110;
    @EJB
    private HelperBeanC110 helperBeanC110;
    @EJB
    private HelperBeanD110 helperBeanD110;
    @EJB
    private HelperBeanE110 helperBeanE110;
    @EJB
    private HelperBeanF110 helperBeanF110;
    @EJB
    private HelperBeanG110 helperBeanG110;
    @EJB
    private HelperBeanH110 helperBeanH110;
    @EJB
    private HelperBeanI110 helperBeanI110;
    @EJB
    private HelperBeanJ110 helperBeanJ110;
    @EJB
    private HelperBeanK110 helperBeanK110;
    @EJB
    private HelperBeanL110 helperBeanL110;
    @EJB
    private HelperBeanM110 helperBeanM110;
    @EJB
    private HelperBeanN110 helperBeanN110;
    @EJB
    private HelperBeanO110 helperBeanO110;

    @EJB
    private StartupBean110 startupBean110;

    public String whoAmI() {
        return "i'm ExampleService110 "
        + helperBeanA110.identify()
        + helperBeanB110.identify()
        + helperBeanC110.identify()
        + helperBeanD110.identify()
        + helperBeanE110.identify()
        + helperBeanF110.identify()
        + helperBeanG110.identify()
        + helperBeanH110.identify()
        + helperBeanI110.identify()
        + helperBeanJ110.identify()
        + helperBeanK110.identify()
        + helperBeanL110.identify()
        + helperBeanM110.identify()
        + helperBeanN110.identify()
        + helperBeanO110.identify();
    }

}
