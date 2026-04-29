package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService83 {

    @EJB
    private HelperBeanA83 helperBeanA83;
    @EJB
    private HelperBeanB83 helperBeanB83;
    @EJB
    private HelperBeanC83 helperBeanC83;
    @EJB
    private HelperBeanD83 helperBeanD83;
    @EJB
    private HelperBeanE83 helperBeanE83;
    @EJB
    private HelperBeanF83 helperBeanF83;
    @EJB
    private HelperBeanG83 helperBeanG83;
    @EJB
    private HelperBeanH83 helperBeanH83;
    @EJB
    private HelperBeanI83 helperBeanI83;
    @EJB
    private HelperBeanJ83 helperBeanJ83;
    @EJB
    private HelperBeanK83 helperBeanK83;
    @EJB
    private HelperBeanL83 helperBeanL83;
    @EJB
    private HelperBeanM83 helperBeanM83;
    @EJB
    private HelperBeanN83 helperBeanN83;
    @EJB
    private HelperBeanO83 helperBeanO83;

    @EJB
    private StartupBean83 startupBean83;

    public String whoAmI() {
        return "i'm ExampleService83 "
        + helperBeanA83.identify()
        + helperBeanB83.identify()
        + helperBeanC83.identify()
        + helperBeanD83.identify()
        + helperBeanE83.identify()
        + helperBeanF83.identify()
        + helperBeanG83.identify()
        + helperBeanH83.identify()
        + helperBeanI83.identify()
        + helperBeanJ83.identify()
        + helperBeanK83.identify()
        + helperBeanL83.identify()
        + helperBeanM83.identify()
        + helperBeanN83.identify()
        + helperBeanO83.identify();
    }

}
