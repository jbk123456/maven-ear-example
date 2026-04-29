package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL162 {

    @EJB
    private HelperBeanK162 helperBeanK162;

    public String identify() {
        return "HelperBeanL162";
    }
}
