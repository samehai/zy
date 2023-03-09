package com.zy.oms.service.impl;

import com.zy.oms.repository.IOrganizationmaterielinfoRepository;
import com.zy.oms.service.IOrganizationmaterielinfo;
import org.springframework.stereotype.Service;

@Service
public class OrganizationmaterielinfoImpl implements IOrganizationmaterielinfo {
    private final IOrganizationmaterielinfoRepository organizationmaterielinfoRepository;

    public OrganizationmaterielinfoImpl(IOrganizationmaterielinfoRepository organizationmaterielinfoRepository) {
        this.organizationmaterielinfoRepository = organizationmaterielinfoRepository;
    }
}
