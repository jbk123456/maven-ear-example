package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI72 {

    @EJB
    private HelperBeanH72 helperBeanH72;

    public String identify() {
        return "HelperBeanI72";
    }
}
