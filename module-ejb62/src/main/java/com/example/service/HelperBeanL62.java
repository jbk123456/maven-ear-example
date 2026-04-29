package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL62 {

    @EJB
    private HelperBeanK62 helperBeanK62;

    public String identify() {
        return "HelperBeanL62";
    }
}
