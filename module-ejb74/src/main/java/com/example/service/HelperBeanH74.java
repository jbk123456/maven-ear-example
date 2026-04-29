package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH74 {

    @EJB
    private HelperBeanG74 helperBeanG74;

    public String identify() {
        return "HelperBeanH74";
    }
}
