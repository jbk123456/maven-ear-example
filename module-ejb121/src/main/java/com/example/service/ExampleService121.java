package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService121 {

    @EJB
    private HelperBeanA121 helperBeanA121;
    @EJB
    private HelperBeanB121 helperBeanB121;
    @EJB
    private HelperBeanC121 helperBeanC121;
    @EJB
    private HelperBeanD121 helperBeanD121;
    @EJB
    private HelperBeanE121 helperBeanE121;
    @EJB
    private HelperBeanF121 helperBeanF121;
    @EJB
    private HelperBeanG121 helperBeanG121;
    @EJB
    private HelperBeanH121 helperBeanH121;
    @EJB
    private HelperBeanI121 helperBeanI121;
    @EJB
    private HelperBeanJ121 helperBeanJ121;
    @EJB
    private HelperBeanK121 helperBeanK121;
    @EJB
    private HelperBeanL121 helperBeanL121;
    @EJB
    private HelperBeanM121 helperBeanM121;
    @EJB
    private HelperBeanN121 helperBeanN121;
    @EJB
    private HelperBeanO121 helperBeanO121;

    @EJB
    private StartupBean121 startupBean121;

    public String whoAmI() {
        return "i'm ExampleService121 "
        + helperBeanA121.identify()
        + helperBeanB121.identify()
        + helperBeanC121.identify()
        + helperBeanD121.identify()
        + helperBeanE121.identify()
        + helperBeanF121.identify()
        + helperBeanG121.identify()
        + helperBeanH121.identify()
        + helperBeanI121.identify()
        + helperBeanJ121.identify()
        + helperBeanK121.identify()
        + helperBeanL121.identify()
        + helperBeanM121.identify()
        + helperBeanN121.identify()
        + helperBeanO121.identify();
    }

}
