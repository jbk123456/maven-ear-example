package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ72 {

    @EJB
    private HelperBeanI72 helperBeanI72;

    public String identify() {
        return "HelperBeanJ72";
    }
}
