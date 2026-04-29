package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService61 {

    @EJB
    private HelperBeanA61 helperBeanA61;
    @EJB
    private HelperBeanB61 helperBeanB61;
    @EJB
    private HelperBeanC61 helperBeanC61;
    @EJB
    private HelperBeanD61 helperBeanD61;
    @EJB
    private HelperBeanE61 helperBeanE61;
    @EJB
    private HelperBeanF61 helperBeanF61;
    @EJB
    private HelperBeanG61 helperBeanG61;
    @EJB
    private HelperBeanH61 helperBeanH61;
    @EJB
    private HelperBeanI61 helperBeanI61;
    @EJB
    private HelperBeanJ61 helperBeanJ61;
    @EJB
    private HelperBeanK61 helperBeanK61;
    @EJB
    private HelperBeanL61 helperBeanL61;
    @EJB
    private HelperBeanM61 helperBeanM61;
    @EJB
    private HelperBeanN61 helperBeanN61;
    @EJB
    private HelperBeanO61 helperBeanO61;

    @EJB
    private StartupBean61 startupBean61;

    public String whoAmI() {
        return "i'm ExampleService61 "
        + helperBeanA61.identify()
        + helperBeanB61.identify()
        + helperBeanC61.identify()
        + helperBeanD61.identify()
        + helperBeanE61.identify()
        + helperBeanF61.identify()
        + helperBeanG61.identify()
        + helperBeanH61.identify()
        + helperBeanI61.identify()
        + helperBeanJ61.identify()
        + helperBeanK61.identify()
        + helperBeanL61.identify()
        + helperBeanM61.identify()
        + helperBeanN61.identify()
        + helperBeanO61.identify();
    }

}
