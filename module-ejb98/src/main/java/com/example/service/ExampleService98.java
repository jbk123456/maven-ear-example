package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService98 {

    @EJB
    private HelperBeanA98 helperBeanA98;
    @EJB
    private HelperBeanB98 helperBeanB98;
    @EJB
    private HelperBeanC98 helperBeanC98;
    @EJB
    private HelperBeanD98 helperBeanD98;
    @EJB
    private HelperBeanE98 helperBeanE98;
    @EJB
    private HelperBeanF98 helperBeanF98;
    @EJB
    private HelperBeanG98 helperBeanG98;
    @EJB
    private HelperBeanH98 helperBeanH98;
    @EJB
    private HelperBeanI98 helperBeanI98;
    @EJB
    private HelperBeanJ98 helperBeanJ98;
    @EJB
    private HelperBeanK98 helperBeanK98;
    @EJB
    private HelperBeanL98 helperBeanL98;
    @EJB
    private HelperBeanM98 helperBeanM98;
    @EJB
    private HelperBeanN98 helperBeanN98;
    @EJB
    private HelperBeanO98 helperBeanO98;

    @EJB
    private StartupBean98 startupBean98;

    public String whoAmI() {
        return "i'm ExampleService98 "
        + helperBeanA98.identify()
        + helperBeanB98.identify()
        + helperBeanC98.identify()
        + helperBeanD98.identify()
        + helperBeanE98.identify()
        + helperBeanF98.identify()
        + helperBeanG98.identify()
        + helperBeanH98.identify()
        + helperBeanI98.identify()
        + helperBeanJ98.identify()
        + helperBeanK98.identify()
        + helperBeanL98.identify()
        + helperBeanM98.identify()
        + helperBeanN98.identify()
        + helperBeanO98.identify();
    }

}
