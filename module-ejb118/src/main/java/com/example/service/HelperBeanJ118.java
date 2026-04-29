package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ118 {

    @EJB
    private HelperBeanI118 helperBeanI118;

    public String identify() {
        return "HelperBeanJ118";
    }
}
