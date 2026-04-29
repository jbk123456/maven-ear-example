package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI18 {

    @EJB
    private HelperBeanH18 helperBeanH18;

    public String identify() {
        return "HelperBeanI18";
    }
}
