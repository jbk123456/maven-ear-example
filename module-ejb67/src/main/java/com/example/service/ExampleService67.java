package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService67 {

    @EJB
    private HelperBeanA67 helperBeanA67;
    @EJB
    private HelperBeanB67 helperBeanB67;
    @EJB
    private HelperBeanC67 helperBeanC67;
    @EJB
    private HelperBeanD67 helperBeanD67;
    @EJB
    private HelperBeanE67 helperBeanE67;
    @EJB
    private HelperBeanF67 helperBeanF67;
    @EJB
    private HelperBeanG67 helperBeanG67;
    @EJB
    private HelperBeanH67 helperBeanH67;
    @EJB
    private HelperBeanI67 helperBeanI67;
    @EJB
    private HelperBeanJ67 helperBeanJ67;
    @EJB
    private HelperBeanK67 helperBeanK67;
    @EJB
    private HelperBeanL67 helperBeanL67;
    @EJB
    private HelperBeanM67 helperBeanM67;
    @EJB
    private HelperBeanN67 helperBeanN67;
    @EJB
    private HelperBeanO67 helperBeanO67;

    @EJB
    private StartupBean67 startupBean67;

    public String whoAmI() {
        return "i'm ExampleService67 "
        + helperBeanA67.identify()
        + helperBeanB67.identify()
        + helperBeanC67.identify()
        + helperBeanD67.identify()
        + helperBeanE67.identify()
        + helperBeanF67.identify()
        + helperBeanG67.identify()
        + helperBeanH67.identify()
        + helperBeanI67.identify()
        + helperBeanJ67.identify()
        + helperBeanK67.identify()
        + helperBeanL67.identify()
        + helperBeanM67.identify()
        + helperBeanN67.identify()
        + helperBeanO67.identify();
    }

}
