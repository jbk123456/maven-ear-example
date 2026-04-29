package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH93 {

    @EJB
    private HelperBeanG93 helperBeanG93;

    public String identify() {
        return "HelperBeanH93";
    }
}
