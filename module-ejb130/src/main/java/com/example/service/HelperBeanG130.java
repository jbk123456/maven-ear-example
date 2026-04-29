package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG130 {

    @EJB
    private HelperBeanF130 helperBeanF130;

    public String identify() {
        return "HelperBeanG130";
    }
}
