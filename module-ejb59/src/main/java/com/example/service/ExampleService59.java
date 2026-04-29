package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService59 {

    @EJB
    private HelperBeanA59 helperBeanA59;
    @EJB
    private HelperBeanB59 helperBeanB59;
    @EJB
    private HelperBeanC59 helperBeanC59;
    @EJB
    private HelperBeanD59 helperBeanD59;
    @EJB
    private HelperBeanE59 helperBeanE59;
    @EJB
    private HelperBeanF59 helperBeanF59;
    @EJB
    private HelperBeanG59 helperBeanG59;
    @EJB
    private HelperBeanH59 helperBeanH59;
    @EJB
    private HelperBeanI59 helperBeanI59;
    @EJB
    private HelperBeanJ59 helperBeanJ59;
    @EJB
    private HelperBeanK59 helperBeanK59;
    @EJB
    private HelperBeanL59 helperBeanL59;
    @EJB
    private HelperBeanM59 helperBeanM59;
    @EJB
    private HelperBeanN59 helperBeanN59;
    @EJB
    private HelperBeanO59 helperBeanO59;

    @EJB
    private StartupBean59 startupBean59;

    public String whoAmI() {
        return "i'm ExampleService59 "
        + helperBeanA59.identify()
        + helperBeanB59.identify()
        + helperBeanC59.identify()
        + helperBeanD59.identify()
        + helperBeanE59.identify()
        + helperBeanF59.identify()
        + helperBeanG59.identify()
        + helperBeanH59.identify()
        + helperBeanI59.identify()
        + helperBeanJ59.identify()
        + helperBeanK59.identify()
        + helperBeanL59.identify()
        + helperBeanM59.identify()
        + helperBeanN59.identify()
        + helperBeanO59.identify();
    }

}
