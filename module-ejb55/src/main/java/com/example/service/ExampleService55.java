package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService55 {

    @EJB
    private HelperBeanA55 helperBeanA55;
    @EJB
    private HelperBeanB55 helperBeanB55;
    @EJB
    private HelperBeanC55 helperBeanC55;
    @EJB
    private HelperBeanD55 helperBeanD55;
    @EJB
    private HelperBeanE55 helperBeanE55;
    @EJB
    private HelperBeanF55 helperBeanF55;
    @EJB
    private HelperBeanG55 helperBeanG55;
    @EJB
    private HelperBeanH55 helperBeanH55;
    @EJB
    private HelperBeanI55 helperBeanI55;
    @EJB
    private HelperBeanJ55 helperBeanJ55;
    @EJB
    private HelperBeanK55 helperBeanK55;
    @EJB
    private HelperBeanL55 helperBeanL55;
    @EJB
    private HelperBeanM55 helperBeanM55;
    @EJB
    private HelperBeanN55 helperBeanN55;
    @EJB
    private HelperBeanO55 helperBeanO55;

    @EJB
    private StartupBean55 startupBean55;

    public String whoAmI() {
        return "i'm ExampleService55 "
        + helperBeanA55.identify()
        + helperBeanB55.identify()
        + helperBeanC55.identify()
        + helperBeanD55.identify()
        + helperBeanE55.identify()
        + helperBeanF55.identify()
        + helperBeanG55.identify()
        + helperBeanH55.identify()
        + helperBeanI55.identify()
        + helperBeanJ55.identify()
        + helperBeanK55.identify()
        + helperBeanL55.identify()
        + helperBeanM55.identify()
        + helperBeanN55.identify()
        + helperBeanO55.identify();
    }

}
