package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH173 {

    @EJB
    private HelperBeanG173 helperBeanG173;

    public String identify() {
        return "HelperBeanH173";
    }
}
