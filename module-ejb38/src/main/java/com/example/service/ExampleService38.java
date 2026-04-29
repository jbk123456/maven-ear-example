package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService38 {

    @EJB
    private HelperBeanA38 helperBeanA38;
    @EJB
    private HelperBeanB38 helperBeanB38;
    @EJB
    private HelperBeanC38 helperBeanC38;
    @EJB
    private HelperBeanD38 helperBeanD38;
    @EJB
    private HelperBeanE38 helperBeanE38;
    @EJB
    private HelperBeanF38 helperBeanF38;
    @EJB
    private HelperBeanG38 helperBeanG38;
    @EJB
    private HelperBeanH38 helperBeanH38;
    @EJB
    private HelperBeanI38 helperBeanI38;
    @EJB
    private HelperBeanJ38 helperBeanJ38;
    @EJB
    private HelperBeanK38 helperBeanK38;
    @EJB
    private HelperBeanL38 helperBeanL38;
    @EJB
    private HelperBeanM38 helperBeanM38;
    @EJB
    private HelperBeanN38 helperBeanN38;
    @EJB
    private HelperBeanO38 helperBeanO38;

    @EJB
    private StartupBean38 startupBean38;

    public String whoAmI() {
        return "i'm ExampleService38 "
        + helperBeanA38.identify()
        + helperBeanB38.identify()
        + helperBeanC38.identify()
        + helperBeanD38.identify()
        + helperBeanE38.identify()
        + helperBeanF38.identify()
        + helperBeanG38.identify()
        + helperBeanH38.identify()
        + helperBeanI38.identify()
        + helperBeanJ38.identify()
        + helperBeanK38.identify()
        + helperBeanL38.identify()
        + helperBeanM38.identify()
        + helperBeanN38.identify()
        + helperBeanO38.identify();
    }

}
