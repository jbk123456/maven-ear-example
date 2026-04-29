package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService41 {

    @EJB
    private HelperBeanA41 helperBeanA41;
    @EJB
    private HelperBeanB41 helperBeanB41;
    @EJB
    private HelperBeanC41 helperBeanC41;
    @EJB
    private HelperBeanD41 helperBeanD41;
    @EJB
    private HelperBeanE41 helperBeanE41;
    @EJB
    private HelperBeanF41 helperBeanF41;
    @EJB
    private HelperBeanG41 helperBeanG41;
    @EJB
    private HelperBeanH41 helperBeanH41;
    @EJB
    private HelperBeanI41 helperBeanI41;
    @EJB
    private HelperBeanJ41 helperBeanJ41;
    @EJB
    private HelperBeanK41 helperBeanK41;
    @EJB
    private HelperBeanL41 helperBeanL41;
    @EJB
    private HelperBeanM41 helperBeanM41;
    @EJB
    private HelperBeanN41 helperBeanN41;
    @EJB
    private HelperBeanO41 helperBeanO41;

    @EJB
    private StartupBean41 startupBean41;

    public String whoAmI() {
        return "i'm ExampleService41 "
        + helperBeanA41.identify()
        + helperBeanB41.identify()
        + helperBeanC41.identify()
        + helperBeanD41.identify()
        + helperBeanE41.identify()
        + helperBeanF41.identify()
        + helperBeanG41.identify()
        + helperBeanH41.identify()
        + helperBeanI41.identify()
        + helperBeanJ41.identify()
        + helperBeanK41.identify()
        + helperBeanL41.identify()
        + helperBeanM41.identify()
        + helperBeanN41.identify()
        + helperBeanO41.identify();
    }

}
