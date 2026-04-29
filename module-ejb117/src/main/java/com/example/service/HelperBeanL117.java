package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL117 {

    @EJB
    private HelperBeanK117 helperBeanK117;

    public String identify() {
        return "HelperBeanL117";
    }
}
