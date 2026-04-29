package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH118 {

    @EJB
    private HelperBeanG118 helperBeanG118;

    public String identify() {
        return "HelperBeanH118";
    }
}
