package com.breeze.ts.provider.controller;

import com.breeze.ts.common.dto.AppLookDto;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.provider.service.AppLookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppLookController {
    @Autowired
    AppLookService appLookService;
    @PostMapping("/provider/appLook/sava.do")
    public R sava(@RequestBody  AppLookDto appLookDto){
        return appLookService.sava(appLookDto);
    }
}
