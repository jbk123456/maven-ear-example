package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService174 {

    @EJB
    private HelperBeanA174 helperBeanA174;
    @EJB
    private HelperBeanB174 helperBeanB174;
    @EJB
    private HelperBeanC174 helperBeanC174;
    @EJB
    private HelperBeanD174 helperBeanD174;
    @EJB
    private HelperBeanE174 helperBeanE174;
    @EJB
    private HelperBeanF174 helperBeanF174;
    @EJB
    private HelperBeanG174 helperBeanG174;
    @EJB
    private HelperBeanH174 helperBeanH174;
    @EJB
    private HelperBeanI174 helperBeanI174;
    @EJB
    private HelperBeanJ174 helperBeanJ174;
    @EJB
    private HelperBeanK174 helperBeanK174;
    @EJB
    private HelperBeanL174 helperBeanL174;
    @EJB
    private HelperBeanM174 helperBeanM174;
    @EJB
    private HelperBeanN174 helperBeanN174;
    @EJB
    private HelperBeanO174 helperBeanO174;

    @EJB
    private StartupBean174 startupBean174;

    public String whoAmI() {
        return "i'm ExampleService174 "
        + helperBeanA174.identify()
        + helperBeanB174.identify()
        + helperBeanC174.identify()
        + helperBeanD174.identify()
        + helperBeanE174.identify()
        + helperBeanF174.identify()
        + helperBeanG174.identify()
        + helperBeanH174.identify()
        + helperBeanI174.identify()
        + helperBeanJ174.identify()
        + helperBeanK174.identify()
        + helperBeanL174.identify()
        + helperBeanM174.identify()
        + helperBeanN174.identify()
        + helperBeanO174.identify();
    }

}
