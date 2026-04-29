package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH162 {

    @EJB
    private HelperBeanG162 helperBeanG162;

    public String identify() {
        return "HelperBeanH162";
    }
}
