package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService120 {

    @EJB
    private HelperBeanA120 helperBeanA120;
    @EJB
    private HelperBeanB120 helperBeanB120;
    @EJB
    private HelperBeanC120 helperBeanC120;
    @EJB
    private HelperBeanD120 helperBeanD120;
    @EJB
    private HelperBeanE120 helperBeanE120;
    @EJB
    private HelperBeanF120 helperBeanF120;
    @EJB
    private HelperBeanG120 helperBeanG120;
    @EJB
    private HelperBeanH120 helperBeanH120;
    @EJB
    private HelperBeanI120 helperBeanI120;
    @EJB
    private HelperBeanJ120 helperBeanJ120;
    @EJB
    private HelperBeanK120 helperBeanK120;
    @EJB
    private HelperBeanL120 helperBeanL120;
    @EJB
    private HelperBeanM120 helperBeanM120;
    @EJB
    private HelperBeanN120 helperBeanN120;
    @EJB
    private HelperBeanO120 helperBeanO120;

    @EJB
    private StartupBean120 startupBean120;

    public String whoAmI() {
        return "i'm ExampleService120 "
        + helperBeanA120.identify()
        + helperBeanB120.identify()
        + helperBeanC120.identify()
        + helperBeanD120.identify()
        + helperBeanE120.identify()
        + helperBeanF120.identify()
        + helperBeanG120.identify()
        + helperBeanH120.identify()
        + helperBeanI120.identify()
        + helperBeanJ120.identify()
        + helperBeanK120.identify()
        + helperBeanL120.identify()
        + helperBeanM120.identify()
        + helperBeanN120.identify()
        + helperBeanO120.identify();
    }

}
