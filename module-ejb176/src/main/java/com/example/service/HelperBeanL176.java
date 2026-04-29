package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL176 {

    @EJB
    private HelperBeanK176 helperBeanK176;

    public String identify() {
        return "HelperBeanL176";
    }
}
