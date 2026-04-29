package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI75 {

    @EJB
    private HelperBeanH75 helperBeanH75;

    public String identify() {
        return "HelperBeanI75";
    }
}
