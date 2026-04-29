package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE111 {

    @EJB
    private HelperBeanD111 helperBeanD111;

    public String identify() {
        return "HelperBeanE111";
    }
}
