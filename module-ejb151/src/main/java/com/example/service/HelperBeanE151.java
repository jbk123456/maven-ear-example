package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE151 {

    @EJB
    private HelperBeanD151 helperBeanD151;

    public String identify() {
        return "HelperBeanE151";
    }
}
