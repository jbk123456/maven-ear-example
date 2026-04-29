package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE108 {

    @EJB
    private HelperBeanD108 helperBeanD108;

    public String identify() {
        return "HelperBeanE108";
    }
}
