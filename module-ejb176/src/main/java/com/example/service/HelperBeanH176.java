package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH176 {

    @EJB
    private HelperBeanG176 helperBeanG176;

    public String identify() {
        return "HelperBeanH176";
    }
}
