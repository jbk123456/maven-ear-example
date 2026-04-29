package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK117 {

    @EJB
    private HelperBeanJ117 helperBeanJ117;

    public String identify() {
        return "HelperBeanK117";
    }
}
