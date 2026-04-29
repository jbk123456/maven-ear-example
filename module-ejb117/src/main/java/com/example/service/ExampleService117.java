package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService117 {

    @EJB
    private HelperBeanA117 helperBeanA117;
    @EJB
    private HelperBeanB117 helperBeanB117;
    @EJB
    private HelperBeanC117 helperBeanC117;
    @EJB
    private HelperBeanD117 helperBeanD117;
    @EJB
    private HelperBeanE117 helperBeanE117;
    @EJB
    private HelperBeanF117 helperBeanF117;
    @EJB
    private HelperBeanG117 helperBeanG117;
    @EJB
    private HelperBeanH117 helperBeanH117;
    @EJB
    private HelperBeanI117 helperBeanI117;
    @EJB
    private HelperBeanJ117 helperBeanJ117;
    @EJB
    private HelperBeanK117 helperBeanK117;
    @EJB
    private HelperBeanL117 helperBeanL117;
    @EJB
    private HelperBeanM117 helperBeanM117;
    @EJB
    private HelperBeanN117 helperBeanN117;
    @EJB
    private HelperBeanO117 helperBeanO117;

    @EJB
    private StartupBean117 startupBean117;

    public String whoAmI() {
        return "i'm ExampleService117 "
        + helperBeanA117.identify()
        + helperBeanB117.identify()
        + helperBeanC117.identify()
        + helperBeanD117.identify()
        + helperBeanE117.identify()
        + helperBeanF117.identify()
        + helperBeanG117.identify()
        + helperBeanH117.identify()
        + helperBeanI117.identify()
        + helperBeanJ117.identify()
        + helperBeanK117.identify()
        + helperBeanL117.identify()
        + helperBeanM117.identify()
        + helperBeanN117.identify()
        + helperBeanO117.identify();
    }

}
