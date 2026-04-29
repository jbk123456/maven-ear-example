package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ150 {

    @EJB
    private HelperBeanI150 helperBeanI150;

    public String identify() {
        return "HelperBeanJ150";
    }
}
