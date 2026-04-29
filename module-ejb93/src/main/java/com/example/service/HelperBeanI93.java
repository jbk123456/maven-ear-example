package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI93 {

    @EJB
    private HelperBeanH93 helperBeanH93;

    public String identify() {
        return "HelperBeanI93";
    }
}
