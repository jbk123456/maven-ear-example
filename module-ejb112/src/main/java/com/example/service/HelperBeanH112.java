package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH112 {

    @EJB
    private HelperBeanG112 helperBeanG112;

    public String identify() {
        return "HelperBeanH112";
    }
}
