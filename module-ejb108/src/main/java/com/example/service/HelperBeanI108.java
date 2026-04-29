package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI108 {

    @EJB
    private HelperBeanH108 helperBeanH108;

    public String identify() {
        return "HelperBeanI108";
    }
}
