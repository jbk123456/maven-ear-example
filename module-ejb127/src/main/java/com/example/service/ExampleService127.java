package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService127 {

    @EJB
    private HelperBeanA127 helperBeanA127;
    @EJB
    private HelperBeanB127 helperBeanB127;
    @EJB
    private HelperBeanC127 helperBeanC127;
    @EJB
    private HelperBeanD127 helperBeanD127;
    @EJB
    private HelperBeanE127 helperBeanE127;
    @EJB
    private HelperBeanF127 helperBeanF127;
    @EJB
    private HelperBeanG127 helperBeanG127;
    @EJB
    private HelperBeanH127 helperBeanH127;
    @EJB
    private HelperBeanI127 helperBeanI127;
    @EJB
    private HelperBeanJ127 helperBeanJ127;
    @EJB
    private HelperBeanK127 helperBeanK127;
    @EJB
    private HelperBeanL127 helperBeanL127;
    @EJB
    private HelperBeanM127 helperBeanM127;
    @EJB
    private HelperBeanN127 helperBeanN127;
    @EJB
    private HelperBeanO127 helperBeanO127;

    @EJB
    private StartupBean127 startupBean127;

    public String whoAmI() {
        return "i'm ExampleService127 "
        + helperBeanA127.identify()
        + helperBeanB127.identify()
        + helperBeanC127.identify()
        + helperBeanD127.identify()
        + helperBeanE127.identify()
        + helperBeanF127.identify()
        + helperBeanG127.identify()
        + helperBeanH127.identify()
        + helperBeanI127.identify()
        + helperBeanJ127.identify()
        + helperBeanK127.identify()
        + helperBeanL127.identify()
        + helperBeanM127.identify()
        + helperBeanN127.identify()
        + helperBeanO127.identify();
    }

}
