package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH139 {

    @EJB
    private HelperBeanG139 helperBeanG139;

    public String identify() {
        return "HelperBeanH139";
    }
}
