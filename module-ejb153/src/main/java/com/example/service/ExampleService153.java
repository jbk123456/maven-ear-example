package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService153 {

    @EJB
    private HelperBeanA153 helperBeanA153;
    @EJB
    private HelperBeanB153 helperBeanB153;
    @EJB
    private HelperBeanC153 helperBeanC153;
    @EJB
    private HelperBeanD153 helperBeanD153;
    @EJB
    private HelperBeanE153 helperBeanE153;
    @EJB
    private HelperBeanF153 helperBeanF153;
    @EJB
    private HelperBeanG153 helperBeanG153;
    @EJB
    private HelperBeanH153 helperBeanH153;
    @EJB
    private HelperBeanI153 helperBeanI153;
    @EJB
    private HelperBeanJ153 helperBeanJ153;
    @EJB
    private HelperBeanK153 helperBeanK153;
    @EJB
    private HelperBeanL153 helperBeanL153;
    @EJB
    private HelperBeanM153 helperBeanM153;
    @EJB
    private HelperBeanN153 helperBeanN153;
    @EJB
    private HelperBeanO153 helperBeanO153;

    @EJB
    private StartupBean153 startupBean153;

    public String whoAmI() {
        return "i'm ExampleService153 "
        + helperBeanA153.identify()
        + helperBeanB153.identify()
        + helperBeanC153.identify()
        + helperBeanD153.identify()
        + helperBeanE153.identify()
        + helperBeanF153.identify()
        + helperBeanG153.identify()
        + helperBeanH153.identify()
        + helperBeanI153.identify()
        + helperBeanJ153.identify()
        + helperBeanK153.identify()
        + helperBeanL153.identify()
        + helperBeanM153.identify()
        + helperBeanN153.identify()
        + helperBeanO153.identify();
    }

}
