package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH156 {

    @EJB
    private HelperBeanG156 helperBeanG156;

    public String identify() {
        return "HelperBeanH156";
    }
}
