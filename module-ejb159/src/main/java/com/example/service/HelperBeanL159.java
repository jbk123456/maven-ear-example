package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL159 {

    @EJB
    private HelperBeanK159 helperBeanK159;

    public String identify() {
        return "HelperBeanL159";
    }
}
