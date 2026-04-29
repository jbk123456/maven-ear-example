package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI105 {

    @EJB
    private HelperBeanH105 helperBeanH105;

    public String identify() {
        return "HelperBeanI105";
    }
}
