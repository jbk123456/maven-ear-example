package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI83 {

    @EJB
    private HelperBeanH83 helperBeanH83;

    public String identify() {
        return "HelperBeanI83";
    }
}
