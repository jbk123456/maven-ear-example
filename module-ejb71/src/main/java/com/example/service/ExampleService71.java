package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService71 {

    @EJB
    private HelperBeanA71 helperBeanA71;
    @EJB
    private HelperBeanB71 helperBeanB71;
    @EJB
    private HelperBeanC71 helperBeanC71;
    @EJB
    private HelperBeanD71 helperBeanD71;
    @EJB
    private HelperBeanE71 helperBeanE71;
    @EJB
    private HelperBeanF71 helperBeanF71;
    @EJB
    private HelperBeanG71 helperBeanG71;
    @EJB
    private HelperBeanH71 helperBeanH71;
    @EJB
    private HelperBeanI71 helperBeanI71;
    @EJB
    private HelperBeanJ71 helperBeanJ71;
    @EJB
    private HelperBeanK71 helperBeanK71;
    @EJB
    private HelperBeanL71 helperBeanL71;
    @EJB
    private HelperBeanM71 helperBeanM71;
    @EJB
    private HelperBeanN71 helperBeanN71;
    @EJB
    private HelperBeanO71 helperBeanO71;

    @EJB
    private StartupBean71 startupBean71;

    public String whoAmI() {
        return "i'm ExampleService71 "
        + helperBeanA71.identify()
        + helperBeanB71.identify()
        + helperBeanC71.identify()
        + helperBeanD71.identify()
        + helperBeanE71.identify()
        + helperBeanF71.identify()
        + helperBeanG71.identify()
        + helperBeanH71.identify()
        + helperBeanI71.identify()
        + helperBeanJ71.identify()
        + helperBeanK71.identify()
        + helperBeanL71.identify()
        + helperBeanM71.identify()
        + helperBeanN71.identify()
        + helperBeanO71.identify();
    }

}
