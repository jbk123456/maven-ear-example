package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL93 {

    @EJB
    private HelperBeanK93 helperBeanK93;

    public String identify() {
        return "HelperBeanL93";
    }
}
