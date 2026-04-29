package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService18 {

    @EJB
    private HelperBeanA18 helperBeanA18;
    @EJB
    private HelperBeanB18 helperBeanB18;
    @EJB
    private HelperBeanC18 helperBeanC18;
    @EJB
    private HelperBeanD18 helperBeanD18;
    @EJB
    private HelperBeanE18 helperBeanE18;
    @EJB
    private HelperBeanF18 helperBeanF18;
    @EJB
    private HelperBeanG18 helperBeanG18;
    @EJB
    private HelperBeanH18 helperBeanH18;
    @EJB
    private HelperBeanI18 helperBeanI18;
    @EJB
    private HelperBeanJ18 helperBeanJ18;
    @EJB
    private HelperBeanK18 helperBeanK18;
    @EJB
    private HelperBeanL18 helperBeanL18;
    @EJB
    private HelperBeanM18 helperBeanM18;
    @EJB
    private HelperBeanN18 helperBeanN18;
    @EJB
    private HelperBeanO18 helperBeanO18;

    @EJB
    private StartupBean18 startupBean18;

    public String whoAmI() {
        return "i'm ExampleService18 "
        + helperBeanA18.identify()
        + helperBeanB18.identify()
        + helperBeanC18.identify()
        + helperBeanD18.identify()
        + helperBeanE18.identify()
        + helperBeanF18.identify()
        + helperBeanG18.identify()
        + helperBeanH18.identify()
        + helperBeanI18.identify()
        + helperBeanJ18.identify()
        + helperBeanK18.identify()
        + helperBeanL18.identify()
        + helperBeanM18.identify()
        + helperBeanN18.identify()
        + helperBeanO18.identify();
    }

}
