package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService148 {

    @EJB
    private HelperBeanA148 helperBeanA148;
    @EJB
    private HelperBeanB148 helperBeanB148;
    @EJB
    private HelperBeanC148 helperBeanC148;
    @EJB
    private HelperBeanD148 helperBeanD148;
    @EJB
    private HelperBeanE148 helperBeanE148;
    @EJB
    private HelperBeanF148 helperBeanF148;
    @EJB
    private HelperBeanG148 helperBeanG148;
    @EJB
    private HelperBeanH148 helperBeanH148;
    @EJB
    private HelperBeanI148 helperBeanI148;
    @EJB
    private HelperBeanJ148 helperBeanJ148;
    @EJB
    private HelperBeanK148 helperBeanK148;
    @EJB
    private HelperBeanL148 helperBeanL148;
    @EJB
    private HelperBeanM148 helperBeanM148;
    @EJB
    private HelperBeanN148 helperBeanN148;
    @EJB
    private HelperBeanO148 helperBeanO148;

    @EJB
    private StartupBean148 startupBean148;

    public String whoAmI() {
        return "i'm ExampleService148 "
        + helperBeanA148.identify()
        + helperBeanB148.identify()
        + helperBeanC148.identify()
        + helperBeanD148.identify()
        + helperBeanE148.identify()
        + helperBeanF148.identify()
        + helperBeanG148.identify()
        + helperBeanH148.identify()
        + helperBeanI148.identify()
        + helperBeanJ148.identify()
        + helperBeanK148.identify()
        + helperBeanL148.identify()
        + helperBeanM148.identify()
        + helperBeanN148.identify()
        + helperBeanO148.identify();
    }

}
