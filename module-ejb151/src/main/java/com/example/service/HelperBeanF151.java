package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF151 {

    @EJB
    private HelperBeanE151 helperBeanE151;

    public String identify() {
        return "HelperBeanF151";
    }
}
