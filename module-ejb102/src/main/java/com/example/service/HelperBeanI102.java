package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI102 {

    @EJB
    private HelperBeanH102 helperBeanH102;

    public String identify() {
        return "HelperBeanI102";
    }
}
