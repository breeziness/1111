package com.breeze.ts.api.service;

import com.breeze.ts.common.dto.ApplicantdetailDto;
import com.breeze.ts.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ApplicantProvider")
public interface ApplicantDetailService {
    @PostMapping("/provider/applicantDetail/save.do")
    R save(@RequestBody ApplicantdetailDto applicantdetailDto);
}
