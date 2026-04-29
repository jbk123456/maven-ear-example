package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL130 {

    @EJB
    private HelperBeanK130 helperBeanK130;

    public String identify() {
        return "HelperBeanL130";
    }
}
