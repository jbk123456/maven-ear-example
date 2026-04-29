package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK136 {

    @EJB
    private HelperBeanJ136 helperBeanJ136;

    public String identify() {
        return "HelperBeanK136";
    }
}
