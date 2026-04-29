package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ83 {

    @EJB
    private HelperBeanI83 helperBeanI83;

    public String identify() {
        return "HelperBeanJ83";
    }
}
