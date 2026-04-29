package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH151 {

    @EJB
    private HelperBeanG151 helperBeanG151;

    public String identify() {
        return "HelperBeanH151";
    }
}
