package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService112 {

    @EJB
    private HelperBeanA112 helperBeanA112;
    @EJB
    private HelperBeanB112 helperBeanB112;
    @EJB
    private HelperBeanC112 helperBeanC112;
    @EJB
    private HelperBeanD112 helperBeanD112;
    @EJB
    private HelperBeanE112 helperBeanE112;
    @EJB
    private HelperBeanF112 helperBeanF112;
    @EJB
    private HelperBeanG112 helperBeanG112;
    @EJB
    private HelperBeanH112 helperBeanH112;
    @EJB
    private HelperBeanI112 helperBeanI112;
    @EJB
    private HelperBeanJ112 helperBeanJ112;
    @EJB
    private HelperBeanK112 helperBeanK112;
    @EJB
    private HelperBeanL112 helperBeanL112;
    @EJB
    private HelperBeanM112 helperBeanM112;
    @EJB
    private HelperBeanN112 helperBeanN112;
    @EJB
    private HelperBeanO112 helperBeanO112;

    @EJB
    private StartupBean112 startupBean112;

    public String whoAmI() {
        return "i'm ExampleService112 "
        + helperBeanA112.identify()
        + helperBeanB112.identify()
        + helperBeanC112.identify()
        + helperBeanD112.identify()
        + helperBeanE112.identify()
        + helperBeanF112.identify()
        + helperBeanG112.identify()
        + helperBeanH112.identify()
        + helperBeanI112.identify()
        + helperBeanJ112.identify()
        + helperBeanK112.identify()
        + helperBeanL112.identify()
        + helperBeanM112.identify()
        + helperBeanN112.identify()
        + helperBeanO112.identify();
    }

}
