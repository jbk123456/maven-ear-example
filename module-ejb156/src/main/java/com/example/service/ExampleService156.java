package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService156 {

    @EJB
    private HelperBeanA156 helperBeanA156;
    @EJB
    private HelperBeanB156 helperBeanB156;
    @EJB
    private HelperBeanC156 helperBeanC156;
    @EJB
    private HelperBeanD156 helperBeanD156;
    @EJB
    private HelperBeanE156 helperBeanE156;
    @EJB
    private HelperBeanF156 helperBeanF156;
    @EJB
    private HelperBeanG156 helperBeanG156;
    @EJB
    private HelperBeanH156 helperBeanH156;
    @EJB
    private HelperBeanI156 helperBeanI156;
    @EJB
    private HelperBeanJ156 helperBeanJ156;
    @EJB
    private HelperBeanK156 helperBeanK156;
    @EJB
    private HelperBeanL156 helperBeanL156;
    @EJB
    private HelperBeanM156 helperBeanM156;
    @EJB
    private HelperBeanN156 helperBeanN156;
    @EJB
    private HelperBeanO156 helperBeanO156;

    @EJB
    private StartupBean156 startupBean156;

    public String whoAmI() {
        return "i'm ExampleService156 "
        + helperBeanA156.identify()
        + helperBeanB156.identify()
        + helperBeanC156.identify()
        + helperBeanD156.identify()
        + helperBeanE156.identify()
        + helperBeanF156.identify()
        + helperBeanG156.identify()
        + helperBeanH156.identify()
        + helperBeanI156.identify()
        + helperBeanJ156.identify()
        + helperBeanK156.identify()
        + helperBeanL156.identify()
        + helperBeanM156.identify()
        + helperBeanN156.identify()
        + helperBeanO156.identify();
    }

}
