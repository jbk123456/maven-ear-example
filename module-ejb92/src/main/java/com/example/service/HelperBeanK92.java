package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK92 {

    @EJB
    private HelperBeanJ92 helperBeanJ92;

    public String identify() {
        return "HelperBeanK92";
    }
}
