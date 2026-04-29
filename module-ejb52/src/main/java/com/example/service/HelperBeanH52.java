package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH52 {

    @EJB
    private HelperBeanG52 helperBeanG52;

    public String identify() {
        return "HelperBeanH52";
    }
}
