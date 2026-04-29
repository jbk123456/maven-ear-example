package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService72 {

    @EJB
    private HelperBeanA72 helperBeanA72;
    @EJB
    private HelperBeanB72 helperBeanB72;
    @EJB
    private HelperBeanC72 helperBeanC72;
    @EJB
    private HelperBeanD72 helperBeanD72;
    @EJB
    private HelperBeanE72 helperBeanE72;
    @EJB
    private HelperBeanF72 helperBeanF72;
    @EJB
    private HelperBeanG72 helperBeanG72;
    @EJB
    private HelperBeanH72 helperBeanH72;
    @EJB
    private HelperBeanI72 helperBeanI72;
    @EJB
    private HelperBeanJ72 helperBeanJ72;
    @EJB
    private HelperBeanK72 helperBeanK72;
    @EJB
    private HelperBeanL72 helperBeanL72;
    @EJB
    private HelperBeanM72 helperBeanM72;
    @EJB
    private HelperBeanN72 helperBeanN72;
    @EJB
    private HelperBeanO72 helperBeanO72;

    @EJB
    private StartupBean72 startupBean72;

    public String whoAmI() {
        return "i'm ExampleService72 "
        + helperBeanA72.identify()
        + helperBeanB72.identify()
        + helperBeanC72.identify()
        + helperBeanD72.identify()
        + helperBeanE72.identify()
        + helperBeanF72.identify()
        + helperBeanG72.identify()
        + helperBeanH72.identify()
        + helperBeanI72.identify()
        + helperBeanJ72.identify()
        + helperBeanK72.identify()
        + helperBeanL72.identify()
        + helperBeanM72.identify()
        + helperBeanN72.identify()
        + helperBeanO72.identify();
    }

}
