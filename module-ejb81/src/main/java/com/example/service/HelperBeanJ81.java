package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ81 {

    @EJB
    private HelperBeanI81 helperBeanI81;

    public String identify() {
        return "HelperBeanJ81";
    }
}
