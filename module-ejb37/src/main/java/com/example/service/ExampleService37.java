package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService37 {

    @EJB
    private HelperBeanA37 helperBeanA37;
    @EJB
    private HelperBeanB37 helperBeanB37;
    @EJB
    private HelperBeanC37 helperBeanC37;
    @EJB
    private HelperBeanD37 helperBeanD37;
    @EJB
    private HelperBeanE37 helperBeanE37;
    @EJB
    private HelperBeanF37 helperBeanF37;
    @EJB
    private HelperBeanG37 helperBeanG37;
    @EJB
    private HelperBeanH37 helperBeanH37;
    @EJB
    private HelperBeanI37 helperBeanI37;
    @EJB
    private HelperBeanJ37 helperBeanJ37;
    @EJB
    private HelperBeanK37 helperBeanK37;
    @EJB
    private HelperBeanL37 helperBeanL37;
    @EJB
    private HelperBeanM37 helperBeanM37;
    @EJB
    private HelperBeanN37 helperBeanN37;
    @EJB
    private HelperBeanO37 helperBeanO37;

    @EJB
    private StartupBean37 startupBean37;

    public String whoAmI() {
        return "i'm ExampleService37 "
        + helperBeanA37.identify()
        + helperBeanB37.identify()
        + helperBeanC37.identify()
        + helperBeanD37.identify()
        + helperBeanE37.identify()
        + helperBeanF37.identify()
        + helperBeanG37.identify()
        + helperBeanH37.identify()
        + helperBeanI37.identify()
        + helperBeanJ37.identify()
        + helperBeanK37.identify()
        + helperBeanL37.identify()
        + helperBeanM37.identify()
        + helperBeanN37.identify()
        + helperBeanO37.identify();
    }

}
