package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG151 {

    @EJB
    private HelperBeanF151 helperBeanF151;

    public String identify() {
        return "HelperBeanG151";
    }
}
