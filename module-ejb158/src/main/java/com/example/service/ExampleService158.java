package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService158 {

    @EJB
    private HelperBeanA158 helperBeanA158;
    @EJB
    private HelperBeanB158 helperBeanB158;
    @EJB
    private HelperBeanC158 helperBeanC158;
    @EJB
    private HelperBeanD158 helperBeanD158;
    @EJB
    private HelperBeanE158 helperBeanE158;
    @EJB
    private HelperBeanF158 helperBeanF158;
    @EJB
    private HelperBeanG158 helperBeanG158;
    @EJB
    private HelperBeanH158 helperBeanH158;
    @EJB
    private HelperBeanI158 helperBeanI158;
    @EJB
    private HelperBeanJ158 helperBeanJ158;
    @EJB
    private HelperBeanK158 helperBeanK158;
    @EJB
    private HelperBeanL158 helperBeanL158;
    @EJB
    private HelperBeanM158 helperBeanM158;
    @EJB
    private HelperBeanN158 helperBeanN158;
    @EJB
    private HelperBeanO158 helperBeanO158;

    @EJB
    private StartupBean158 startupBean158;

    public String whoAmI() {
        return "i'm ExampleService158 "
        + helperBeanA158.identify()
        + helperBeanB158.identify()
        + helperBeanC158.identify()
        + helperBeanD158.identify()
        + helperBeanE158.identify()
        + helperBeanF158.identify()
        + helperBeanG158.identify()
        + helperBeanH158.identify()
        + helperBeanI158.identify()
        + helperBeanJ158.identify()
        + helperBeanK158.identify()
        + helperBeanL158.identify()
        + helperBeanM158.identify()
        + helperBeanN158.identify()
        + helperBeanO158.identify();
    }

}
