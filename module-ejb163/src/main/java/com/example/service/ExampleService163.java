package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService163 {

    @EJB
    private HelperBeanA163 helperBeanA163;
    @EJB
    private HelperBeanB163 helperBeanB163;
    @EJB
    private HelperBeanC163 helperBeanC163;
    @EJB
    private HelperBeanD163 helperBeanD163;
    @EJB
    private HelperBeanE163 helperBeanE163;
    @EJB
    private HelperBeanF163 helperBeanF163;
    @EJB
    private HelperBeanG163 helperBeanG163;
    @EJB
    private HelperBeanH163 helperBeanH163;
    @EJB
    private HelperBeanI163 helperBeanI163;
    @EJB
    private HelperBeanJ163 helperBeanJ163;
    @EJB
    private HelperBeanK163 helperBeanK163;
    @EJB
    private HelperBeanL163 helperBeanL163;
    @EJB
    private HelperBeanM163 helperBeanM163;
    @EJB
    private HelperBeanN163 helperBeanN163;
    @EJB
    private HelperBeanO163 helperBeanO163;

    @EJB
    private StartupBean163 startupBean163;

    public String whoAmI() {
        return "i'm ExampleService163 "
        + helperBeanA163.identify()
        + helperBeanB163.identify()
        + helperBeanC163.identify()
        + helperBeanD163.identify()
        + helperBeanE163.identify()
        + helperBeanF163.identify()
        + helperBeanG163.identify()
        + helperBeanH163.identify()
        + helperBeanI163.identify()
        + helperBeanJ163.identify()
        + helperBeanK163.identify()
        + helperBeanL163.identify()
        + helperBeanM163.identify()
        + helperBeanN163.identify()
        + helperBeanO163.identify();
    }

}
