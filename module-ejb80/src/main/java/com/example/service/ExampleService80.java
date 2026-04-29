package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService80 {

    @EJB
    private HelperBeanA80 helperBeanA80;
    @EJB
    private HelperBeanB80 helperBeanB80;
    @EJB
    private HelperBeanC80 helperBeanC80;
    @EJB
    private HelperBeanD80 helperBeanD80;
    @EJB
    private HelperBeanE80 helperBeanE80;
    @EJB
    private HelperBeanF80 helperBeanF80;
    @EJB
    private HelperBeanG80 helperBeanG80;
    @EJB
    private HelperBeanH80 helperBeanH80;
    @EJB
    private HelperBeanI80 helperBeanI80;
    @EJB
    private HelperBeanJ80 helperBeanJ80;
    @EJB
    private HelperBeanK80 helperBeanK80;
    @EJB
    private HelperBeanL80 helperBeanL80;
    @EJB
    private HelperBeanM80 helperBeanM80;
    @EJB
    private HelperBeanN80 helperBeanN80;
    @EJB
    private HelperBeanO80 helperBeanO80;

    @EJB
    private StartupBean80 startupBean80;

    public String whoAmI() {
        return "i'm ExampleService80 "
        + helperBeanA80.identify()
        + helperBeanB80.identify()
        + helperBeanC80.identify()
        + helperBeanD80.identify()
        + helperBeanE80.identify()
        + helperBeanF80.identify()
        + helperBeanG80.identify()
        + helperBeanH80.identify()
        + helperBeanI80.identify()
        + helperBeanJ80.identify()
        + helperBeanK80.identify()
        + helperBeanL80.identify()
        + helperBeanM80.identify()
        + helperBeanN80.identify()
        + helperBeanO80.identify();
    }

}
