package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL87 {

    @EJB
    private HelperBeanK87 helperBeanK87;

    public String identify() {
        return "HelperBeanL87";
    }
}
