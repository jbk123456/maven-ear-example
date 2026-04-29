package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM168 {

    @EJB
    private HelperBeanL168 helperBeanL168;

    public String identify() {
        return "HelperBeanM168";
    }
}
