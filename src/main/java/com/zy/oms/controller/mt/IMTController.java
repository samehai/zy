package com.zy.oms.controller.mt;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 美团API控制器
 * @author Administrator
 */
@Api(tags = "美团API")
@RequestMapping("/mt")
public interface IMTController {
    @GetMapping("/medicineBatchUpdate")
    List<Map<String, Object>> medicineBatchUpdate(HttpServletRequest request);
}
