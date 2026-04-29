package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService29 {

    @EJB
    private HelperBeanA29 helperBeanA29;
    @EJB
    private HelperBeanB29 helperBeanB29;
    @EJB
    private HelperBeanC29 helperBeanC29;
    @EJB
    private HelperBeanD29 helperBeanD29;
    @EJB
    private HelperBeanE29 helperBeanE29;
    @EJB
    private HelperBeanF29 helperBeanF29;
    @EJB
    private HelperBeanG29 helperBeanG29;
    @EJB
    private HelperBeanH29 helperBeanH29;
    @EJB
    private HelperBeanI29 helperBeanI29;
    @EJB
    private HelperBeanJ29 helperBeanJ29;
    @EJB
    private HelperBeanK29 helperBeanK29;
    @EJB
    private HelperBeanL29 helperBeanL29;
    @EJB
    private HelperBeanM29 helperBeanM29;
    @EJB
    private HelperBeanN29 helperBeanN29;
    @EJB
    private HelperBeanO29 helperBeanO29;

    @EJB
    private StartupBean29 startupBean29;

    public String whoAmI() {
        return "i'm ExampleService29 "
        + helperBeanA29.identify()
        + helperBeanB29.identify()
        + helperBeanC29.identify()
        + helperBeanD29.identify()
        + helperBeanE29.identify()
        + helperBeanF29.identify()
        + helperBeanG29.identify()
        + helperBeanH29.identify()
        + helperBeanI29.identify()
        + helperBeanJ29.identify()
        + helperBeanK29.identify()
        + helperBeanL29.identify()
        + helperBeanM29.identify()
        + helperBeanN29.identify()
        + helperBeanO29.identify();
    }

}
