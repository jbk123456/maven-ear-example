package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ166 {

    @EJB
    private HelperBeanI166 helperBeanI166;

    public String identify() {
        return "HelperBeanJ166";
    }
}
