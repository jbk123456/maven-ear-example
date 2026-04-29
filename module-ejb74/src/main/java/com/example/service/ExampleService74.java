package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService74 {

    @EJB
    private HelperBeanA74 helperBeanA74;
    @EJB
    private HelperBeanB74 helperBeanB74;
    @EJB
    private HelperBeanC74 helperBeanC74;
    @EJB
    private HelperBeanD74 helperBeanD74;
    @EJB
    private HelperBeanE74 helperBeanE74;
    @EJB
    private HelperBeanF74 helperBeanF74;
    @EJB
    private HelperBeanG74 helperBeanG74;
    @EJB
    private HelperBeanH74 helperBeanH74;
    @EJB
    private HelperBeanI74 helperBeanI74;
    @EJB
    private HelperBeanJ74 helperBeanJ74;
    @EJB
    private HelperBeanK74 helperBeanK74;
    @EJB
    private HelperBeanL74 helperBeanL74;
    @EJB
    private HelperBeanM74 helperBeanM74;
    @EJB
    private HelperBeanN74 helperBeanN74;
    @EJB
    private HelperBeanO74 helperBeanO74;

    @EJB
    private StartupBean74 startupBean74;

    public String whoAmI() {
        return "i'm ExampleService74 "
        + helperBeanA74.identify()
        + helperBeanB74.identify()
        + helperBeanC74.identify()
        + helperBeanD74.identify()
        + helperBeanE74.identify()
        + helperBeanF74.identify()
        + helperBeanG74.identify()
        + helperBeanH74.identify()
        + helperBeanI74.identify()
        + helperBeanJ74.identify()
        + helperBeanK74.identify()
        + helperBeanL74.identify()
        + helperBeanM74.identify()
        + helperBeanN74.identify()
        + helperBeanO74.identify();
    }

}
