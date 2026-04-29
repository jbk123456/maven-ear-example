package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService111 {

    @EJB
    private HelperBeanA111 helperBeanA111;
    @EJB
    private HelperBeanB111 helperBeanB111;
    @EJB
    private HelperBeanC111 helperBeanC111;
    @EJB
    private HelperBeanD111 helperBeanD111;
    @EJB
    private HelperBeanE111 helperBeanE111;
    @EJB
    private HelperBeanF111 helperBeanF111;
    @EJB
    private HelperBeanG111 helperBeanG111;
    @EJB
    private HelperBeanH111 helperBeanH111;
    @EJB
    private HelperBeanI111 helperBeanI111;
    @EJB
    private HelperBeanJ111 helperBeanJ111;
    @EJB
    private HelperBeanK111 helperBeanK111;
    @EJB
    private HelperBeanL111 helperBeanL111;
    @EJB
    private HelperBeanM111 helperBeanM111;
    @EJB
    private HelperBeanN111 helperBeanN111;
    @EJB
    private HelperBeanO111 helperBeanO111;

    @EJB
    private StartupBean111 startupBean111;

    public String whoAmI() {
        return "i'm ExampleService111 "
        + helperBeanA111.identify()
        + helperBeanB111.identify()
        + helperBeanC111.identify()
        + helperBeanD111.identify()
        + helperBeanE111.identify()
        + helperBeanF111.identify()
        + helperBeanG111.identify()
        + helperBeanH111.identify()
        + helperBeanI111.identify()
        + helperBeanJ111.identify()
        + helperBeanK111.identify()
        + helperBeanL111.identify()
        + helperBeanM111.identify()
        + helperBeanN111.identify()
        + helperBeanO111.identify();
    }

}
