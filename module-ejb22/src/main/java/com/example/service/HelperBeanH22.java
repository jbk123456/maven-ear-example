package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH22 {

    @EJB
    private HelperBeanG22 helperBeanG22;

    public String identify() {
        return "HelperBeanH22";
    }
}
