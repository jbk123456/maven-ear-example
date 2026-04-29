package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService115 {

    @EJB
    private HelperBeanA115 helperBeanA115;
    @EJB
    private HelperBeanB115 helperBeanB115;
    @EJB
    private HelperBeanC115 helperBeanC115;
    @EJB
    private HelperBeanD115 helperBeanD115;
    @EJB
    private HelperBeanE115 helperBeanE115;
    @EJB
    private HelperBeanF115 helperBeanF115;
    @EJB
    private HelperBeanG115 helperBeanG115;
    @EJB
    private HelperBeanH115 helperBeanH115;
    @EJB
    private HelperBeanI115 helperBeanI115;
    @EJB
    private HelperBeanJ115 helperBeanJ115;
    @EJB
    private HelperBeanK115 helperBeanK115;
    @EJB
    private HelperBeanL115 helperBeanL115;
    @EJB
    private HelperBeanM115 helperBeanM115;
    @EJB
    private HelperBeanN115 helperBeanN115;
    @EJB
    private HelperBeanO115 helperBeanO115;

    @EJB
    private StartupBean115 startupBean115;

    public String whoAmI() {
        return "i'm ExampleService115 "
        + helperBeanA115.identify()
        + helperBeanB115.identify()
        + helperBeanC115.identify()
        + helperBeanD115.identify()
        + helperBeanE115.identify()
        + helperBeanF115.identify()
        + helperBeanG115.identify()
        + helperBeanH115.identify()
        + helperBeanI115.identify()
        + helperBeanJ115.identify()
        + helperBeanK115.identify()
        + helperBeanL115.identify()
        + helperBeanM115.identify()
        + helperBeanN115.identify()
        + helperBeanO115.identify();
    }

}
