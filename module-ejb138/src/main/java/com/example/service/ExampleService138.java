package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService138 {

    @EJB
    private HelperBeanA138 helperBeanA138;
    @EJB
    private HelperBeanB138 helperBeanB138;
    @EJB
    private HelperBeanC138 helperBeanC138;
    @EJB
    private HelperBeanD138 helperBeanD138;
    @EJB
    private HelperBeanE138 helperBeanE138;
    @EJB
    private HelperBeanF138 helperBeanF138;
    @EJB
    private HelperBeanG138 helperBeanG138;
    @EJB
    private HelperBeanH138 helperBeanH138;
    @EJB
    private HelperBeanI138 helperBeanI138;
    @EJB
    private HelperBeanJ138 helperBeanJ138;
    @EJB
    private HelperBeanK138 helperBeanK138;
    @EJB
    private HelperBeanL138 helperBeanL138;
    @EJB
    private HelperBeanM138 helperBeanM138;
    @EJB
    private HelperBeanN138 helperBeanN138;
    @EJB
    private HelperBeanO138 helperBeanO138;

    @EJB
    private StartupBean138 startupBean138;

    public String whoAmI() {
        return "i'm ExampleService138 "
        + helperBeanA138.identify()
        + helperBeanB138.identify()
        + helperBeanC138.identify()
        + helperBeanD138.identify()
        + helperBeanE138.identify()
        + helperBeanF138.identify()
        + helperBeanG138.identify()
        + helperBeanH138.identify()
        + helperBeanI138.identify()
        + helperBeanJ138.identify()
        + helperBeanK138.identify()
        + helperBeanL138.identify()
        + helperBeanM138.identify()
        + helperBeanN138.identify()
        + helperBeanO138.identify();
    }

}
