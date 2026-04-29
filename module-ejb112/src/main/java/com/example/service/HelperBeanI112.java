package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI112 {

    @EJB
    private HelperBeanH112 helperBeanH112;

    public String identify() {
        return "HelperBeanI112";
    }
}
