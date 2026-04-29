package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService22 {

    @EJB
    private HelperBeanA22 helperBeanA22;
    @EJB
    private HelperBeanB22 helperBeanB22;
    @EJB
    private HelperBeanC22 helperBeanC22;
    @EJB
    private HelperBeanD22 helperBeanD22;
    @EJB
    private HelperBeanE22 helperBeanE22;
    @EJB
    private HelperBeanF22 helperBeanF22;
    @EJB
    private HelperBeanG22 helperBeanG22;
    @EJB
    private HelperBeanH22 helperBeanH22;
    @EJB
    private HelperBeanI22 helperBeanI22;
    @EJB
    private HelperBeanJ22 helperBeanJ22;
    @EJB
    private HelperBeanK22 helperBeanK22;
    @EJB
    private HelperBeanL22 helperBeanL22;
    @EJB
    private HelperBeanM22 helperBeanM22;
    @EJB
    private HelperBeanN22 helperBeanN22;
    @EJB
    private HelperBeanO22 helperBeanO22;

    @EJB
    private StartupBean22 startupBean22;

    public String whoAmI() {
        return "i'm ExampleService22 "
        + helperBeanA22.identify()
        + helperBeanB22.identify()
        + helperBeanC22.identify()
        + helperBeanD22.identify()
        + helperBeanE22.identify()
        + helperBeanF22.identify()
        + helperBeanG22.identify()
        + helperBeanH22.identify()
        + helperBeanI22.identify()
        + helperBeanJ22.identify()
        + helperBeanK22.identify()
        + helperBeanL22.identify()
        + helperBeanM22.identify()
        + helperBeanN22.identify()
        + helperBeanO22.identify();
    }

}
