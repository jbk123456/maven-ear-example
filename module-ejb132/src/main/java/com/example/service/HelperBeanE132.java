package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE132 {

    @EJB
    private HelperBeanD132 helperBeanD132;

    public String identify() {
        return "HelperBeanE132";
    }
}
