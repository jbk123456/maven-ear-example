package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService107 {

    @EJB
    private HelperBeanA107 helperBeanA107;
    @EJB
    private HelperBeanB107 helperBeanB107;
    @EJB
    private HelperBeanC107 helperBeanC107;
    @EJB
    private HelperBeanD107 helperBeanD107;
    @EJB
    private HelperBeanE107 helperBeanE107;
    @EJB
    private HelperBeanF107 helperBeanF107;
    @EJB
    private HelperBeanG107 helperBeanG107;
    @EJB
    private HelperBeanH107 helperBeanH107;
    @EJB
    private HelperBeanI107 helperBeanI107;
    @EJB
    private HelperBeanJ107 helperBeanJ107;
    @EJB
    private HelperBeanK107 helperBeanK107;
    @EJB
    private HelperBeanL107 helperBeanL107;
    @EJB
    private HelperBeanM107 helperBeanM107;
    @EJB
    private HelperBeanN107 helperBeanN107;
    @EJB
    private HelperBeanO107 helperBeanO107;

    @EJB
    private StartupBean107 startupBean107;

    public String whoAmI() {
        return "i'm ExampleService107 "
        + helperBeanA107.identify()
        + helperBeanB107.identify()
        + helperBeanC107.identify()
        + helperBeanD107.identify()
        + helperBeanE107.identify()
        + helperBeanF107.identify()
        + helperBeanG107.identify()
        + helperBeanH107.identify()
        + helperBeanI107.identify()
        + helperBeanJ107.identify()
        + helperBeanK107.identify()
        + helperBeanL107.identify()
        + helperBeanM107.identify()
        + helperBeanN107.identify()
        + helperBeanO107.identify();
    }

}
