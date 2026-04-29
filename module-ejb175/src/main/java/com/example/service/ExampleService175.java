package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService175 {

    @EJB
    private HelperBeanA175 helperBeanA175;
    @EJB
    private HelperBeanB175 helperBeanB175;
    @EJB
    private HelperBeanC175 helperBeanC175;
    @EJB
    private HelperBeanD175 helperBeanD175;
    @EJB
    private HelperBeanE175 helperBeanE175;
    @EJB
    private HelperBeanF175 helperBeanF175;
    @EJB
    private HelperBeanG175 helperBeanG175;
    @EJB
    private HelperBeanH175 helperBeanH175;
    @EJB
    private HelperBeanI175 helperBeanI175;
    @EJB
    private HelperBeanJ175 helperBeanJ175;
    @EJB
    private HelperBeanK175 helperBeanK175;
    @EJB
    private HelperBeanL175 helperBeanL175;
    @EJB
    private HelperBeanM175 helperBeanM175;
    @EJB
    private HelperBeanN175 helperBeanN175;
    @EJB
    private HelperBeanO175 helperBeanO175;

    @EJB
    private StartupBean175 startupBean175;

    public String whoAmI() {
        return "i'm ExampleService175 "
        + helperBeanA175.identify()
        + helperBeanB175.identify()
        + helperBeanC175.identify()
        + helperBeanD175.identify()
        + helperBeanE175.identify()
        + helperBeanF175.identify()
        + helperBeanG175.identify()
        + helperBeanH175.identify()
        + helperBeanI175.identify()
        + helperBeanJ175.identify()
        + helperBeanK175.identify()
        + helperBeanL175.identify()
        + helperBeanM175.identify()
        + helperBeanN175.identify()
        + helperBeanO175.identify();
    }

}
