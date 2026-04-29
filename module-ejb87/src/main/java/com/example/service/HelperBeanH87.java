package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH87 {

    @EJB
    private HelperBeanG87 helperBeanG87;

    public String identify() {
        return "HelperBeanH87";
    }
}
