package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService78 {

    @EJB
    private HelperBeanA78 helperBeanA78;
    @EJB
    private HelperBeanB78 helperBeanB78;
    @EJB
    private HelperBeanC78 helperBeanC78;
    @EJB
    private HelperBeanD78 helperBeanD78;
    @EJB
    private HelperBeanE78 helperBeanE78;
    @EJB
    private HelperBeanF78 helperBeanF78;
    @EJB
    private HelperBeanG78 helperBeanG78;
    @EJB
    private HelperBeanH78 helperBeanH78;
    @EJB
    private HelperBeanI78 helperBeanI78;
    @EJB
    private HelperBeanJ78 helperBeanJ78;
    @EJB
    private HelperBeanK78 helperBeanK78;
    @EJB
    private HelperBeanL78 helperBeanL78;
    @EJB
    private HelperBeanM78 helperBeanM78;
    @EJB
    private HelperBeanN78 helperBeanN78;
    @EJB
    private HelperBeanO78 helperBeanO78;

    @EJB
    private StartupBean78 startupBean78;

    public String whoAmI() {
        return "i'm ExampleService78 "
        + helperBeanA78.identify()
        + helperBeanB78.identify()
        + helperBeanC78.identify()
        + helperBeanD78.identify()
        + helperBeanE78.identify()
        + helperBeanF78.identify()
        + helperBeanG78.identify()
        + helperBeanH78.identify()
        + helperBeanI78.identify()
        + helperBeanJ78.identify()
        + helperBeanK78.identify()
        + helperBeanL78.identify()
        + helperBeanM78.identify()
        + helperBeanN78.identify()
        + helperBeanO78.identify();
    }

}
