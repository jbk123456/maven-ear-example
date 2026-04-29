package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService123 {

    @EJB
    private HelperBeanA123 helperBeanA123;
    @EJB
    private HelperBeanB123 helperBeanB123;
    @EJB
    private HelperBeanC123 helperBeanC123;
    @EJB
    private HelperBeanD123 helperBeanD123;
    @EJB
    private HelperBeanE123 helperBeanE123;
    @EJB
    private HelperBeanF123 helperBeanF123;
    @EJB
    private HelperBeanG123 helperBeanG123;
    @EJB
    private HelperBeanH123 helperBeanH123;
    @EJB
    private HelperBeanI123 helperBeanI123;
    @EJB
    private HelperBeanJ123 helperBeanJ123;
    @EJB
    private HelperBeanK123 helperBeanK123;
    @EJB
    private HelperBeanL123 helperBeanL123;
    @EJB
    private HelperBeanM123 helperBeanM123;
    @EJB
    private HelperBeanN123 helperBeanN123;
    @EJB
    private HelperBeanO123 helperBeanO123;

    @EJB
    private StartupBean123 startupBean123;

    public String whoAmI() {
        return "i'm ExampleService123 "
        + helperBeanA123.identify()
        + helperBeanB123.identify()
        + helperBeanC123.identify()
        + helperBeanD123.identify()
        + helperBeanE123.identify()
        + helperBeanF123.identify()
        + helperBeanG123.identify()
        + helperBeanH123.identify()
        + helperBeanI123.identify()
        + helperBeanJ123.identify()
        + helperBeanK123.identify()
        + helperBeanL123.identify()
        + helperBeanM123.identify()
        + helperBeanN123.identify()
        + helperBeanO123.identify();
    }

}
