package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService167 {

    @EJB
    private HelperBeanA167 helperBeanA167;
    @EJB
    private HelperBeanB167 helperBeanB167;
    @EJB
    private HelperBeanC167 helperBeanC167;
    @EJB
    private HelperBeanD167 helperBeanD167;
    @EJB
    private HelperBeanE167 helperBeanE167;
    @EJB
    private HelperBeanF167 helperBeanF167;
    @EJB
    private HelperBeanG167 helperBeanG167;
    @EJB
    private HelperBeanH167 helperBeanH167;
    @EJB
    private HelperBeanI167 helperBeanI167;
    @EJB
    private HelperBeanJ167 helperBeanJ167;
    @EJB
    private HelperBeanK167 helperBeanK167;
    @EJB
    private HelperBeanL167 helperBeanL167;
    @EJB
    private HelperBeanM167 helperBeanM167;
    @EJB
    private HelperBeanN167 helperBeanN167;
    @EJB
    private HelperBeanO167 helperBeanO167;

    @EJB
    private StartupBean167 startupBean167;

    public String whoAmI() {
        return "i'm ExampleService167 "
        + helperBeanA167.identify()
        + helperBeanB167.identify()
        + helperBeanC167.identify()
        + helperBeanD167.identify()
        + helperBeanE167.identify()
        + helperBeanF167.identify()
        + helperBeanG167.identify()
        + helperBeanH167.identify()
        + helperBeanI167.identify()
        + helperBeanJ167.identify()
        + helperBeanK167.identify()
        + helperBeanL167.identify()
        + helperBeanM167.identify()
        + helperBeanN167.identify()
        + helperBeanO167.identify();
    }

}
