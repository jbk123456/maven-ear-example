package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL85 {

    @EJB
    private HelperBeanK85 helperBeanK85;

    public String identify() {
        return "HelperBeanL85";
    }
}
