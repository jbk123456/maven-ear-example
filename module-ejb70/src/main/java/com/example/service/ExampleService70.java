package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService70 {

    @EJB
    private HelperBeanA70 helperBeanA70;
    @EJB
    private HelperBeanB70 helperBeanB70;
    @EJB
    private HelperBeanC70 helperBeanC70;
    @EJB
    private HelperBeanD70 helperBeanD70;
    @EJB
    private HelperBeanE70 helperBeanE70;
    @EJB
    private HelperBeanF70 helperBeanF70;
    @EJB
    private HelperBeanG70 helperBeanG70;
    @EJB
    private HelperBeanH70 helperBeanH70;
    @EJB
    private HelperBeanI70 helperBeanI70;
    @EJB
    private HelperBeanJ70 helperBeanJ70;
    @EJB
    private HelperBeanK70 helperBeanK70;
    @EJB
    private HelperBeanL70 helperBeanL70;
    @EJB
    private HelperBeanM70 helperBeanM70;
    @EJB
    private HelperBeanN70 helperBeanN70;
    @EJB
    private HelperBeanO70 helperBeanO70;

    @EJB
    private StartupBean70 startupBean70;

    public String whoAmI() {
        return "i'm ExampleService70 "
        + helperBeanA70.identify()
        + helperBeanB70.identify()
        + helperBeanC70.identify()
        + helperBeanD70.identify()
        + helperBeanE70.identify()
        + helperBeanF70.identify()
        + helperBeanG70.identify()
        + helperBeanH70.identify()
        + helperBeanI70.identify()
        + helperBeanJ70.identify()
        + helperBeanK70.identify()
        + helperBeanL70.identify()
        + helperBeanM70.identify()
        + helperBeanN70.identify()
        + helperBeanO70.identify();
    }

}
