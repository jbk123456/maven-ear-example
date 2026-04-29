package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF156 {

    @EJB
    private HelperBeanE156 helperBeanE156;

    public String identify() {
        return "HelperBeanF156";
    }
}
