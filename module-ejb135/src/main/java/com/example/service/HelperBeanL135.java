package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL135 {

    @EJB
    private HelperBeanK135 helperBeanK135;

    public String identify() {
        return "HelperBeanL135";
    }
}
