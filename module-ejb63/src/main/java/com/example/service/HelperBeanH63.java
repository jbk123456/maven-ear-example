package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH63 {

    @EJB
    private HelperBeanG63 helperBeanG63;

    public String identify() {
        return "HelperBeanH63";
    }
}
