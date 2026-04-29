package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH117 {

    @EJB
    private HelperBeanG117 helperBeanG117;

    public String identify() {
        return "HelperBeanH117";
    }
}
