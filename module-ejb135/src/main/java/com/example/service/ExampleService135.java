package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService135 {

    @EJB
    private HelperBeanA135 helperBeanA135;
    @EJB
    private HelperBeanB135 helperBeanB135;
    @EJB
    private HelperBeanC135 helperBeanC135;
    @EJB
    private HelperBeanD135 helperBeanD135;
    @EJB
    private HelperBeanE135 helperBeanE135;
    @EJB
    private HelperBeanF135 helperBeanF135;
    @EJB
    private HelperBeanG135 helperBeanG135;
    @EJB
    private HelperBeanH135 helperBeanH135;
    @EJB
    private HelperBeanI135 helperBeanI135;
    @EJB
    private HelperBeanJ135 helperBeanJ135;
    @EJB
    private HelperBeanK135 helperBeanK135;
    @EJB
    private HelperBeanL135 helperBeanL135;
    @EJB
    private HelperBeanM135 helperBeanM135;
    @EJB
    private HelperBeanN135 helperBeanN135;
    @EJB
    private HelperBeanO135 helperBeanO135;

    @EJB
    private StartupBean135 startupBean135;

    public String whoAmI() {
        return "i'm ExampleService135 "
        + helperBeanA135.identify()
        + helperBeanB135.identify()
        + helperBeanC135.identify()
        + helperBeanD135.identify()
        + helperBeanE135.identify()
        + helperBeanF135.identify()
        + helperBeanG135.identify()
        + helperBeanH135.identify()
        + helperBeanI135.identify()
        + helperBeanJ135.identify()
        + helperBeanK135.identify()
        + helperBeanL135.identify()
        + helperBeanM135.identify()
        + helperBeanN135.identify()
        + helperBeanO135.identify();
    }

}
