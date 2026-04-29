package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM130 {

    @EJB
    private HelperBeanL130 helperBeanL130;

    public String identify() {
        return "HelperBeanM130";
    }
}
