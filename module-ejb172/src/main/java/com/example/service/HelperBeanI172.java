package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI172 {

    @EJB
    private HelperBeanH172 helperBeanH172;

    public String identify() {
        return "HelperBeanI172";
    }
}
