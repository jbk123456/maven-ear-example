package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH55 {

    @EJB
    private HelperBeanG55 helperBeanG55;

    public String identify() {
        return "HelperBeanH55";
    }
}
