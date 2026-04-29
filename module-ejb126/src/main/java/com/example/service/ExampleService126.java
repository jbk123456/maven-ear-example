package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService126 {

    @EJB
    private HelperBeanA126 helperBeanA126;
    @EJB
    private HelperBeanB126 helperBeanB126;
    @EJB
    private HelperBeanC126 helperBeanC126;
    @EJB
    private HelperBeanD126 helperBeanD126;
    @EJB
    private HelperBeanE126 helperBeanE126;
    @EJB
    private HelperBeanF126 helperBeanF126;
    @EJB
    private HelperBeanG126 helperBeanG126;
    @EJB
    private HelperBeanH126 helperBeanH126;
    @EJB
    private HelperBeanI126 helperBeanI126;
    @EJB
    private HelperBeanJ126 helperBeanJ126;
    @EJB
    private HelperBeanK126 helperBeanK126;
    @EJB
    private HelperBeanL126 helperBeanL126;
    @EJB
    private HelperBeanM126 helperBeanM126;
    @EJB
    private HelperBeanN126 helperBeanN126;
    @EJB
    private HelperBeanO126 helperBeanO126;

    @EJB
    private StartupBean126 startupBean126;

    public String whoAmI() {
        return "i'm ExampleService126 "
        + helperBeanA126.identify()
        + helperBeanB126.identify()
        + helperBeanC126.identify()
        + helperBeanD126.identify()
        + helperBeanE126.identify()
        + helperBeanF126.identify()
        + helperBeanG126.identify()
        + helperBeanH126.identify()
        + helperBeanI126.identify()
        + helperBeanJ126.identify()
        + helperBeanK126.identify()
        + helperBeanL126.identify()
        + helperBeanM126.identify()
        + helperBeanN126.identify()
        + helperBeanO126.identify();
    }

}
