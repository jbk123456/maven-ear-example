package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO74 {

    @EJB
    private HelperBeanN74 helperBeanN74;

    public String identify() {
        return "HelperBeanO74";
    }
}
