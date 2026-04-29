package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN161 {

    @EJB
    private HelperBeanM161 helperBeanM161;

    public String identify() {
        return "HelperBeanN161";
    }
}
