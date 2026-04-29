package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService177 {

    @EJB
    private HelperBeanA177 helperBeanA177;
    @EJB
    private HelperBeanB177 helperBeanB177;
    @EJB
    private HelperBeanC177 helperBeanC177;
    @EJB
    private HelperBeanD177 helperBeanD177;
    @EJB
    private HelperBeanE177 helperBeanE177;
    @EJB
    private HelperBeanF177 helperBeanF177;
    @EJB
    private HelperBeanG177 helperBeanG177;
    @EJB
    private HelperBeanH177 helperBeanH177;
    @EJB
    private HelperBeanI177 helperBeanI177;
    @EJB
    private HelperBeanJ177 helperBeanJ177;
    @EJB
    private HelperBeanK177 helperBeanK177;
    @EJB
    private HelperBeanL177 helperBeanL177;
    @EJB
    private HelperBeanM177 helperBeanM177;
    @EJB
    private HelperBeanN177 helperBeanN177;
    @EJB
    private HelperBeanO177 helperBeanO177;

    @EJB
    private StartupBean177 startupBean177;

    public String whoAmI() {
        return "i'm ExampleService177 "
        + helperBeanA177.identify()
        + helperBeanB177.identify()
        + helperBeanC177.identify()
        + helperBeanD177.identify()
        + helperBeanE177.identify()
        + helperBeanF177.identify()
        + helperBeanG177.identify()
        + helperBeanH177.identify()
        + helperBeanI177.identify()
        + helperBeanJ177.identify()
        + helperBeanK177.identify()
        + helperBeanL177.identify()
        + helperBeanM177.identify()
        + helperBeanN177.identify()
        + helperBeanO177.identify();
    }

}
