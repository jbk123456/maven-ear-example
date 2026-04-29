package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM135 {

    @EJB
    private HelperBeanL135 helperBeanL135;

    public String identify() {
        return "HelperBeanM135";
    }
}
