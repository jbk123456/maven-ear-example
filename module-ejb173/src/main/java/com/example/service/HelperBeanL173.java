package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL173 {

    @EJB
    private HelperBeanK173 helperBeanK173;

    public String identify() {
        return "HelperBeanL173";
    }
}
