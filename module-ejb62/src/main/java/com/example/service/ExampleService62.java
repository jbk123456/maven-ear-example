package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService62 {

    @EJB
    private HelperBeanA62 helperBeanA62;
    @EJB
    private HelperBeanB62 helperBeanB62;
    @EJB
    private HelperBeanC62 helperBeanC62;
    @EJB
    private HelperBeanD62 helperBeanD62;
    @EJB
    private HelperBeanE62 helperBeanE62;
    @EJB
    private HelperBeanF62 helperBeanF62;
    @EJB
    private HelperBeanG62 helperBeanG62;
    @EJB
    private HelperBeanH62 helperBeanH62;
    @EJB
    private HelperBeanI62 helperBeanI62;
    @EJB
    private HelperBeanJ62 helperBeanJ62;
    @EJB
    private HelperBeanK62 helperBeanK62;
    @EJB
    private HelperBeanL62 helperBeanL62;
    @EJB
    private HelperBeanM62 helperBeanM62;
    @EJB
    private HelperBeanN62 helperBeanN62;
    @EJB
    private HelperBeanO62 helperBeanO62;

    @EJB
    private StartupBean62 startupBean62;

    public String whoAmI() {
        return "i'm ExampleService62 "
        + helperBeanA62.identify()
        + helperBeanB62.identify()
        + helperBeanC62.identify()
        + helperBeanD62.identify()
        + helperBeanE62.identify()
        + helperBeanF62.identify()
        + helperBeanG62.identify()
        + helperBeanH62.identify()
        + helperBeanI62.identify()
        + helperBeanJ62.identify()
        + helperBeanK62.identify()
        + helperBeanL62.identify()
        + helperBeanM62.identify()
        + helperBeanN62.identify()
        + helperBeanO62.identify();
    }

}
