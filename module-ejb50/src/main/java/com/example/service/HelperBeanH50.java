package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH50 {

    @EJB
    private HelperBeanG50 helperBeanG50;

    public String identify() {
        return "HelperBeanH50";
    }
}
