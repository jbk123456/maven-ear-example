package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF111 {

    @EJB
    private HelperBeanE111 helperBeanE111;

    public String identify() {
        return "HelperBeanF111";
    }
}
