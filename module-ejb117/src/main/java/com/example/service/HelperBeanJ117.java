package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ117 {

    @EJB
    private HelperBeanI117 helperBeanI117;

    public String identify() {
        return "HelperBeanJ117";
    }
}
