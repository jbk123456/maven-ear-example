package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService93 {

    @EJB
    private HelperBeanA93 helperBeanA93;
    @EJB
    private HelperBeanB93 helperBeanB93;
    @EJB
    private HelperBeanC93 helperBeanC93;
    @EJB
    private HelperBeanD93 helperBeanD93;
    @EJB
    private HelperBeanE93 helperBeanE93;
    @EJB
    private HelperBeanF93 helperBeanF93;
    @EJB
    private HelperBeanG93 helperBeanG93;
    @EJB
    private HelperBeanH93 helperBeanH93;
    @EJB
    private HelperBeanI93 helperBeanI93;
    @EJB
    private HelperBeanJ93 helperBeanJ93;
    @EJB
    private HelperBeanK93 helperBeanK93;
    @EJB
    private HelperBeanL93 helperBeanL93;
    @EJB
    private HelperBeanM93 helperBeanM93;
    @EJB
    private HelperBeanN93 helperBeanN93;
    @EJB
    private HelperBeanO93 helperBeanO93;

    @EJB
    private StartupBean93 startupBean93;

    public String whoAmI() {
        return "i'm ExampleService93 "
        + helperBeanA93.identify()
        + helperBeanB93.identify()
        + helperBeanC93.identify()
        + helperBeanD93.identify()
        + helperBeanE93.identify()
        + helperBeanF93.identify()
        + helperBeanG93.identify()
        + helperBeanH93.identify()
        + helperBeanI93.identify()
        + helperBeanJ93.identify()
        + helperBeanK93.identify()
        + helperBeanL93.identify()
        + helperBeanM93.identify()
        + helperBeanN93.identify()
        + helperBeanO93.identify();
    }

}
