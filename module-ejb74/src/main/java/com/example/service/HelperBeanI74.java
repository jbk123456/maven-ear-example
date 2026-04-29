package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI74 {

    @EJB
    private HelperBeanH74 helperBeanH74;

    public String identify() {
        return "HelperBeanI74";
    }
}
