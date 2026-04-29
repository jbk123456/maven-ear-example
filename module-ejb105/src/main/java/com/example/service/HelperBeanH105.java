package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH105 {

    @EJB
    private HelperBeanG105 helperBeanG105;

    public String identify() {
        return "HelperBeanH105";
    }
}
