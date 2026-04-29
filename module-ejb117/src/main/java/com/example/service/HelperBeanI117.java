package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI117 {

    @EJB
    private HelperBeanH117 helperBeanH117;

    public String identify() {
        return "HelperBeanI117";
    }
}
