package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG87 {

    @EJB
    private HelperBeanF87 helperBeanF87;

    public String identify() {
        return "HelperBeanG87";
    }
}
