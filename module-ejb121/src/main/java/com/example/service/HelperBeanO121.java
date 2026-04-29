package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO121 {

    @EJB
    private HelperBeanN121 helperBeanN121;

    public String identify() {
        return "HelperBeanO121";
    }
}
