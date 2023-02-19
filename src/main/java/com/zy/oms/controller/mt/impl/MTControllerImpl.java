package com.zy.oms.controller.mt.impl;

import com.zy.oms.controller.mt.IMTController;
import com.zy.oms.service.mt.IMTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
public class MTControllerImpl implements IMTController {


    @Autowired
    private IMTService imtService;

    @Override
    public List<Map<String, Object>> medicineBatchUpdate(HttpServletRequest request) {
        return imtService.medicineBatchUpdate(request);
    }
}
