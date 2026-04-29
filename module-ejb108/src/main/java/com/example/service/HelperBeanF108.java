package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF108 {

    @EJB
    private HelperBeanE108 helperBeanE108;

    public String identify() {
        return "HelperBeanF108";
    }
}
