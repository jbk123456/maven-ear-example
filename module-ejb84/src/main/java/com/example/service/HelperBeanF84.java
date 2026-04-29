package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF84 {

    @EJB
    private HelperBeanE84 helperBeanE84;

    public String identify() {
        return "HelperBeanF84";
    }
}
