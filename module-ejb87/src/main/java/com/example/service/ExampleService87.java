package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService87 {

    @EJB
    private HelperBeanA87 helperBeanA87;
    @EJB
    private HelperBeanB87 helperBeanB87;
    @EJB
    private HelperBeanC87 helperBeanC87;
    @EJB
    private HelperBeanD87 helperBeanD87;
    @EJB
    private HelperBeanE87 helperBeanE87;
    @EJB
    private HelperBeanF87 helperBeanF87;
    @EJB
    private HelperBeanG87 helperBeanG87;
    @EJB
    private HelperBeanH87 helperBeanH87;
    @EJB
    private HelperBeanI87 helperBeanI87;
    @EJB
    private HelperBeanJ87 helperBeanJ87;
    @EJB
    private HelperBeanK87 helperBeanK87;
    @EJB
    private HelperBeanL87 helperBeanL87;
    @EJB
    private HelperBeanM87 helperBeanM87;
    @EJB
    private HelperBeanN87 helperBeanN87;
    @EJB
    private HelperBeanO87 helperBeanO87;

    @EJB
    private StartupBean87 startupBean87;

    public String whoAmI() {
        return "i'm ExampleService87 "
        + helperBeanA87.identify()
        + helperBeanB87.identify()
        + helperBeanC87.identify()
        + helperBeanD87.identify()
        + helperBeanE87.identify()
        + helperBeanF87.identify()
        + helperBeanG87.identify()
        + helperBeanH87.identify()
        + helperBeanI87.identify()
        + helperBeanJ87.identify()
        + helperBeanK87.identify()
        + helperBeanL87.identify()
        + helperBeanM87.identify()
        + helperBeanN87.identify()
        + helperBeanO87.identify();
    }

}
