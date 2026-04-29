package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK67 {

    @EJB
    private HelperBeanJ67 helperBeanJ67;

    public String identify() {
        return "HelperBeanK67";
    }
}
