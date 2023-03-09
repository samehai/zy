package com.zy.oms.service.mt;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.Map;


public interface IMTService {
    List<Map<String, Object>> medicineBatchUpdate(HttpServletRequest request);

}
