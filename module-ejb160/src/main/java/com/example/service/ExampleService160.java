package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService160 {

    @EJB
    private HelperBeanA160 helperBeanA160;
    @EJB
    private HelperBeanB160 helperBeanB160;
    @EJB
    private HelperBeanC160 helperBeanC160;
    @EJB
    private HelperBeanD160 helperBeanD160;
    @EJB
    private HelperBeanE160 helperBeanE160;
    @EJB
    private HelperBeanF160 helperBeanF160;
    @EJB
    private HelperBeanG160 helperBeanG160;
    @EJB
    private HelperBeanH160 helperBeanH160;
    @EJB
    private HelperBeanI160 helperBeanI160;
    @EJB
    private HelperBeanJ160 helperBeanJ160;
    @EJB
    private HelperBeanK160 helperBeanK160;
    @EJB
    private HelperBeanL160 helperBeanL160;
    @EJB
    private HelperBeanM160 helperBeanM160;
    @EJB
    private HelperBeanN160 helperBeanN160;
    @EJB
    private HelperBeanO160 helperBeanO160;

    @EJB
    private StartupBean160 startupBean160;

    public String whoAmI() {
        return "i'm ExampleService160 "
        + helperBeanA160.identify()
        + helperBeanB160.identify()
        + helperBeanC160.identify()
        + helperBeanD160.identify()
        + helperBeanE160.identify()
        + helperBeanF160.identify()
        + helperBeanG160.identify()
        + helperBeanH160.identify()
        + helperBeanI160.identify()
        + helperBeanJ160.identify()
        + helperBeanK160.identify()
        + helperBeanL160.identify()
        + helperBeanM160.identify()
        + helperBeanN160.identify()
        + helperBeanO160.identify();
    }

}
