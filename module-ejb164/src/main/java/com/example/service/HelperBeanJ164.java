package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ164 {

    @EJB
    private HelperBeanI164 helperBeanI164;

    public String identify() {
        return "HelperBeanJ164";
    }
}
