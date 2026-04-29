package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService157 {

    @EJB
    private HelperBeanA157 helperBeanA157;
    @EJB
    private HelperBeanB157 helperBeanB157;
    @EJB
    private HelperBeanC157 helperBeanC157;
    @EJB
    private HelperBeanD157 helperBeanD157;
    @EJB
    private HelperBeanE157 helperBeanE157;
    @EJB
    private HelperBeanF157 helperBeanF157;
    @EJB
    private HelperBeanG157 helperBeanG157;
    @EJB
    private HelperBeanH157 helperBeanH157;
    @EJB
    private HelperBeanI157 helperBeanI157;
    @EJB
    private HelperBeanJ157 helperBeanJ157;
    @EJB
    private HelperBeanK157 helperBeanK157;
    @EJB
    private HelperBeanL157 helperBeanL157;
    @EJB
    private HelperBeanM157 helperBeanM157;
    @EJB
    private HelperBeanN157 helperBeanN157;
    @EJB
    private HelperBeanO157 helperBeanO157;

    @EJB
    private StartupBean157 startupBean157;

    public String whoAmI() {
        return "i'm ExampleService157 "
        + helperBeanA157.identify()
        + helperBeanB157.identify()
        + helperBeanC157.identify()
        + helperBeanD157.identify()
        + helperBeanE157.identify()
        + helperBeanF157.identify()
        + helperBeanG157.identify()
        + helperBeanH157.identify()
        + helperBeanI157.identify()
        + helperBeanJ157.identify()
        + helperBeanK157.identify()
        + helperBeanL157.identify()
        + helperBeanM157.identify()
        + helperBeanN157.identify()
        + helperBeanO157.identify();
    }

}
