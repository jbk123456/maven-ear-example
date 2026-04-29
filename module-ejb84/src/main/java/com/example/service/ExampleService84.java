package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService84 {

    @EJB
    private HelperBeanA84 helperBeanA84;
    @EJB
    private HelperBeanB84 helperBeanB84;
    @EJB
    private HelperBeanC84 helperBeanC84;
    @EJB
    private HelperBeanD84 helperBeanD84;
    @EJB
    private HelperBeanE84 helperBeanE84;
    @EJB
    private HelperBeanF84 helperBeanF84;
    @EJB
    private HelperBeanG84 helperBeanG84;
    @EJB
    private HelperBeanH84 helperBeanH84;
    @EJB
    private HelperBeanI84 helperBeanI84;
    @EJB
    private HelperBeanJ84 helperBeanJ84;
    @EJB
    private HelperBeanK84 helperBeanK84;
    @EJB
    private HelperBeanL84 helperBeanL84;
    @EJB
    private HelperBeanM84 helperBeanM84;
    @EJB
    private HelperBeanN84 helperBeanN84;
    @EJB
    private HelperBeanO84 helperBeanO84;

    @EJB
    private StartupBean84 startupBean84;

    public String whoAmI() {
        return "i'm ExampleService84 "
        + helperBeanA84.identify()
        + helperBeanB84.identify()
        + helperBeanC84.identify()
        + helperBeanD84.identify()
        + helperBeanE84.identify()
        + helperBeanF84.identify()
        + helperBeanG84.identify()
        + helperBeanH84.identify()
        + helperBeanI84.identify()
        + helperBeanJ84.identify()
        + helperBeanK84.identify()
        + helperBeanL84.identify()
        + helperBeanM84.identify()
        + helperBeanN84.identify()
        + helperBeanO84.identify();
    }

}
