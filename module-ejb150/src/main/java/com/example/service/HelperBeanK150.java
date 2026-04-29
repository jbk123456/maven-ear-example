package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK150 {

    @EJB
    private HelperBeanJ150 helperBeanJ150;

    public String identify() {
        return "HelperBeanK150";
    }
}
