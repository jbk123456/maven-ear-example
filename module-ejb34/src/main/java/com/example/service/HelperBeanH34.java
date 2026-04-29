package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH34 {

    @EJB
    private HelperBeanG34 helperBeanG34;

    public String identify() {
        return "HelperBeanH34";
    }
}
