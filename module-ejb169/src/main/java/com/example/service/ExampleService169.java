package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService169 {

    @EJB
    private HelperBeanA169 helperBeanA169;
    @EJB
    private HelperBeanB169 helperBeanB169;
    @EJB
    private HelperBeanC169 helperBeanC169;
    @EJB
    private HelperBeanD169 helperBeanD169;
    @EJB
    private HelperBeanE169 helperBeanE169;
    @EJB
    private HelperBeanF169 helperBeanF169;
    @EJB
    private HelperBeanG169 helperBeanG169;
    @EJB
    private HelperBeanH169 helperBeanH169;
    @EJB
    private HelperBeanI169 helperBeanI169;
    @EJB
    private HelperBeanJ169 helperBeanJ169;
    @EJB
    private HelperBeanK169 helperBeanK169;
    @EJB
    private HelperBeanL169 helperBeanL169;
    @EJB
    private HelperBeanM169 helperBeanM169;
    @EJB
    private HelperBeanN169 helperBeanN169;
    @EJB
    private HelperBeanO169 helperBeanO169;

    @EJB
    private StartupBean169 startupBean169;

    public String whoAmI() {
        return "i'm ExampleService169 "
        + helperBeanA169.identify()
        + helperBeanB169.identify()
        + helperBeanC169.identify()
        + helperBeanD169.identify()
        + helperBeanE169.identify()
        + helperBeanF169.identify()
        + helperBeanG169.identify()
        + helperBeanH169.identify()
        + helperBeanI169.identify()
        + helperBeanJ169.identify()
        + helperBeanK169.identify()
        + helperBeanL169.identify()
        + helperBeanM169.identify()
        + helperBeanN169.identify()
        + helperBeanO169.identify();
    }

}
