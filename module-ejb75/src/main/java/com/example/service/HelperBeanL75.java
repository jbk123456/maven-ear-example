package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL75 {

    @EJB
    private HelperBeanK75 helperBeanK75;

    public String identify() {
        return "HelperBeanL75";
    }
}
