package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH116 {

    @EJB
    private HelperBeanG116 helperBeanG116;

    public String identify() {
        return "HelperBeanH116";
    }
}
