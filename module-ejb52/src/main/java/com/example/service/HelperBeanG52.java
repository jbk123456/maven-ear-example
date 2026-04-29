package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG52 {

    @EJB
    private HelperBeanF52 helperBeanF52;

    public String identify() {
        return "HelperBeanG52";
    }
}
