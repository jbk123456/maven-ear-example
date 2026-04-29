package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService13 {

    @EJB
    private HelperBeanA13 helperBeanA13;
    @EJB
    private HelperBeanB13 helperBeanB13;
    @EJB
    private HelperBeanC13 helperBeanC13;
    @EJB
    private HelperBeanD13 helperBeanD13;
    @EJB
    private HelperBeanE13 helperBeanE13;
    @EJB
    private HelperBeanF13 helperBeanF13;
    @EJB
    private HelperBeanG13 helperBeanG13;
    @EJB
    private HelperBeanH13 helperBeanH13;
    @EJB
    private HelperBeanI13 helperBeanI13;
    @EJB
    private HelperBeanJ13 helperBeanJ13;
    @EJB
    private HelperBeanK13 helperBeanK13;
    @EJB
    private HelperBeanL13 helperBeanL13;
    @EJB
    private HelperBeanM13 helperBeanM13;
    @EJB
    private HelperBeanN13 helperBeanN13;
    @EJB
    private HelperBeanO13 helperBeanO13;

    @EJB
    private StartupBean13 startupBean13;

    public String whoAmI() {
        return "i'm ExampleService13 "
        + helperBeanA13.identify()
        + helperBeanB13.identify()
        + helperBeanC13.identify()
        + helperBeanD13.identify()
        + helperBeanE13.identify()
        + helperBeanF13.identify()
        + helperBeanG13.identify()
        + helperBeanH13.identify()
        + helperBeanI13.identify()
        + helperBeanJ13.identify()
        + helperBeanK13.identify()
        + helperBeanL13.identify()
        + helperBeanM13.identify()
        + helperBeanN13.identify()
        + helperBeanO13.identify();
    }

}
