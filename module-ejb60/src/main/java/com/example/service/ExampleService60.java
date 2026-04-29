package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService60 {

    @EJB
    private HelperBeanA60 helperBeanA60;
    @EJB
    private HelperBeanB60 helperBeanB60;
    @EJB
    private HelperBeanC60 helperBeanC60;
    @EJB
    private HelperBeanD60 helperBeanD60;
    @EJB
    private HelperBeanE60 helperBeanE60;
    @EJB
    private HelperBeanF60 helperBeanF60;
    @EJB
    private HelperBeanG60 helperBeanG60;
    @EJB
    private HelperBeanH60 helperBeanH60;
    @EJB
    private HelperBeanI60 helperBeanI60;
    @EJB
    private HelperBeanJ60 helperBeanJ60;
    @EJB
    private HelperBeanK60 helperBeanK60;
    @EJB
    private HelperBeanL60 helperBeanL60;
    @EJB
    private HelperBeanM60 helperBeanM60;
    @EJB
    private HelperBeanN60 helperBeanN60;
    @EJB
    private HelperBeanO60 helperBeanO60;

    @EJB
    private StartupBean60 startupBean60;

    public String whoAmI() {
        return "i'm ExampleService60 "
        + helperBeanA60.identify()
        + helperBeanB60.identify()
        + helperBeanC60.identify()
        + helperBeanD60.identify()
        + helperBeanE60.identify()
        + helperBeanF60.identify()
        + helperBeanG60.identify()
        + helperBeanH60.identify()
        + helperBeanI60.identify()
        + helperBeanJ60.identify()
        + helperBeanK60.identify()
        + helperBeanL60.identify()
        + helperBeanM60.identify()
        + helperBeanN60.identify()
        + helperBeanO60.identify();
    }

}
