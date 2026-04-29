package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF169 {

    @EJB
    private HelperBeanE169 helperBeanE169;

    public String identify() {
        return "HelperBeanF169";
    }
}
