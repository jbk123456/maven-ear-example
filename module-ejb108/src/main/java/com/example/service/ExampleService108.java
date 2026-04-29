package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService108 {

    @EJB
    private HelperBeanA108 helperBeanA108;
    @EJB
    private HelperBeanB108 helperBeanB108;
    @EJB
    private HelperBeanC108 helperBeanC108;
    @EJB
    private HelperBeanD108 helperBeanD108;
    @EJB
    private HelperBeanE108 helperBeanE108;
    @EJB
    private HelperBeanF108 helperBeanF108;
    @EJB
    private HelperBeanG108 helperBeanG108;
    @EJB
    private HelperBeanH108 helperBeanH108;
    @EJB
    private HelperBeanI108 helperBeanI108;
    @EJB
    private HelperBeanJ108 helperBeanJ108;
    @EJB
    private HelperBeanK108 helperBeanK108;
    @EJB
    private HelperBeanL108 helperBeanL108;
    @EJB
    private HelperBeanM108 helperBeanM108;
    @EJB
    private HelperBeanN108 helperBeanN108;
    @EJB
    private HelperBeanO108 helperBeanO108;

    @EJB
    private StartupBean108 startupBean108;

    public String whoAmI() {
        return "i'm ExampleService108 "
        + helperBeanA108.identify()
        + helperBeanB108.identify()
        + helperBeanC108.identify()
        + helperBeanD108.identify()
        + helperBeanE108.identify()
        + helperBeanF108.identify()
        + helperBeanG108.identify()
        + helperBeanH108.identify()
        + helperBeanI108.identify()
        + helperBeanJ108.identify()
        + helperBeanK108.identify()
        + helperBeanL108.identify()
        + helperBeanM108.identify()
        + helperBeanN108.identify()
        + helperBeanO108.identify();
    }

}
