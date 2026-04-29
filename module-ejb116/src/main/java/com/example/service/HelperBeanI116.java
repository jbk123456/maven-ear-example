package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI116 {

    @EJB
    private HelperBeanH116 helperBeanH116;

    public String identify() {
        return "HelperBeanI116";
    }
}
