package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG137 {

    @EJB
    private HelperBeanF137 helperBeanF137;

    public String identify() {
        return "HelperBeanG137";
    }
}
