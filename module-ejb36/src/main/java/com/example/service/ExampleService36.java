package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService36 {

    @EJB
    private HelperBeanA36 helperBeanA36;
    @EJB
    private HelperBeanB36 helperBeanB36;
    @EJB
    private HelperBeanC36 helperBeanC36;
    @EJB
    private HelperBeanD36 helperBeanD36;
    @EJB
    private HelperBeanE36 helperBeanE36;
    @EJB
    private HelperBeanF36 helperBeanF36;
    @EJB
    private HelperBeanG36 helperBeanG36;
    @EJB
    private HelperBeanH36 helperBeanH36;
    @EJB
    private HelperBeanI36 helperBeanI36;
    @EJB
    private HelperBeanJ36 helperBeanJ36;
    @EJB
    private HelperBeanK36 helperBeanK36;
    @EJB
    private HelperBeanL36 helperBeanL36;
    @EJB
    private HelperBeanM36 helperBeanM36;
    @EJB
    private HelperBeanN36 helperBeanN36;
    @EJB
    private HelperBeanO36 helperBeanO36;

    @EJB
    private StartupBean36 startupBean36;

    public String whoAmI() {
        return "i'm ExampleService36 "
        + helperBeanA36.identify()
        + helperBeanB36.identify()
        + helperBeanC36.identify()
        + helperBeanD36.identify()
        + helperBeanE36.identify()
        + helperBeanF36.identify()
        + helperBeanG36.identify()
        + helperBeanH36.identify()
        + helperBeanI36.identify()
        + helperBeanJ36.identify()
        + helperBeanK36.identify()
        + helperBeanL36.identify()
        + helperBeanM36.identify()
        + helperBeanN36.identify()
        + helperBeanO36.identify();
    }

}
