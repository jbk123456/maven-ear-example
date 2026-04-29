package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH82 {

    @EJB
    private HelperBeanG82 helperBeanG82;

    public String identify() {
        return "HelperBeanH82";
    }
}
