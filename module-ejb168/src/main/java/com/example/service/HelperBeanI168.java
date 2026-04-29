package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI168 {

    @EJB
    private HelperBeanH168 helperBeanH168;

    public String identify() {
        return "HelperBeanI168";
    }
}
