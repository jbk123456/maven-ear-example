package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL92 {

    @EJB
    private HelperBeanK92 helperBeanK92;

    public String identify() {
        return "HelperBeanL92";
    }
}
