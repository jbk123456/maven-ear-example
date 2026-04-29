package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService161 {

    @EJB
    private HelperBeanA161 helperBeanA161;
    @EJB
    private HelperBeanB161 helperBeanB161;
    @EJB
    private HelperBeanC161 helperBeanC161;
    @EJB
    private HelperBeanD161 helperBeanD161;
    @EJB
    private HelperBeanE161 helperBeanE161;
    @EJB
    private HelperBeanF161 helperBeanF161;
    @EJB
    private HelperBeanG161 helperBeanG161;
    @EJB
    private HelperBeanH161 helperBeanH161;
    @EJB
    private HelperBeanI161 helperBeanI161;
    @EJB
    private HelperBeanJ161 helperBeanJ161;
    @EJB
    private HelperBeanK161 helperBeanK161;
    @EJB
    private HelperBeanL161 helperBeanL161;
    @EJB
    private HelperBeanM161 helperBeanM161;
    @EJB
    private HelperBeanN161 helperBeanN161;
    @EJB
    private HelperBeanO161 helperBeanO161;

    @EJB
    private StartupBean161 startupBean161;

    public String whoAmI() {
        return "i'm ExampleService161 "
        + helperBeanA161.identify()
        + helperBeanB161.identify()
        + helperBeanC161.identify()
        + helperBeanD161.identify()
        + helperBeanE161.identify()
        + helperBeanF161.identify()
        + helperBeanG161.identify()
        + helperBeanH161.identify()
        + helperBeanI161.identify()
        + helperBeanJ161.identify()
        + helperBeanK161.identify()
        + helperBeanL161.identify()
        + helperBeanM161.identify()
        + helperBeanN161.identify()
        + helperBeanO161.identify();
    }

}
