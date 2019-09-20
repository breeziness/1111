package com.breeze.ts.api.service;

import com.breeze.ts.common.dto.AppLookDto;
import com.breeze.ts.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ApplicantProvider")
public interface AppLookService {
    @PostMapping("/provider/appLook/sava.do")
    R sava(@RequestBody AppLookDto appLookDto);
}
