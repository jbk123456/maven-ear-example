package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI66 {

    @EJB
    private HelperBeanH66 helperBeanH66;

    public String identify() {
        return "HelperBeanI66";
    }
}
