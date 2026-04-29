package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG162 {

    @EJB
    private HelperBeanF162 helperBeanF162;

    public String identify() {
        return "HelperBeanG162";
    }
}
