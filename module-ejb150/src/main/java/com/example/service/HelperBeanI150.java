package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI150 {

    @EJB
    private HelperBeanH150 helperBeanH150;

    public String identify() {
        return "HelperBeanI150";
    }
}
