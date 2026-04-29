package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI118 {

    @EJB
    private HelperBeanH118 helperBeanH118;

    public String identify() {
        return "HelperBeanI118";
    }
}
