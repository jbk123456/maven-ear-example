package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG112 {

    @EJB
    private HelperBeanF112 helperBeanF112;

    public String identify() {
        return "HelperBeanG112";
    }
}
