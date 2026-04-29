package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK137 {

    @EJB
    private HelperBeanJ137 helperBeanJ137;

    public String identify() {
        return "HelperBeanK137";
    }
}
