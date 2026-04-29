package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO161 {

    @EJB
    private HelperBeanN161 helperBeanN161;

    public String identify() {
        return "HelperBeanO161";
    }
}
