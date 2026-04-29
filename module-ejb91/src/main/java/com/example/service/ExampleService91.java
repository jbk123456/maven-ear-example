package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService91 {

    @EJB
    private HelperBeanA91 helperBeanA91;
    @EJB
    private HelperBeanB91 helperBeanB91;
    @EJB
    private HelperBeanC91 helperBeanC91;
    @EJB
    private HelperBeanD91 helperBeanD91;
    @EJB
    private HelperBeanE91 helperBeanE91;
    @EJB
    private HelperBeanF91 helperBeanF91;
    @EJB
    private HelperBeanG91 helperBeanG91;
    @EJB
    private HelperBeanH91 helperBeanH91;
    @EJB
    private HelperBeanI91 helperBeanI91;
    @EJB
    private HelperBeanJ91 helperBeanJ91;
    @EJB
    private HelperBeanK91 helperBeanK91;
    @EJB
    private HelperBeanL91 helperBeanL91;
    @EJB
    private HelperBeanM91 helperBeanM91;
    @EJB
    private HelperBeanN91 helperBeanN91;
    @EJB
    private HelperBeanO91 helperBeanO91;

    @EJB
    private StartupBean91 startupBean91;

    public String whoAmI() {
        return "i'm ExampleService91 "
        + helperBeanA91.identify()
        + helperBeanB91.identify()
        + helperBeanC91.identify()
        + helperBeanD91.identify()
        + helperBeanE91.identify()
        + helperBeanF91.identify()
        + helperBeanG91.identify()
        + helperBeanH91.identify()
        + helperBeanI91.identify()
        + helperBeanJ91.identify()
        + helperBeanK91.identify()
        + helperBeanL91.identify()
        + helperBeanM91.identify()
        + helperBeanN91.identify()
        + helperBeanO91.identify();
    }

}
