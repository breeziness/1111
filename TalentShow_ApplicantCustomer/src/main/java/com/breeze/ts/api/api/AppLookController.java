package com.breeze.ts.api.api;

import com.breeze.ts.api.service.AppLookService;
import com.breeze.ts.common.dto.AppLookDto;
import com.breeze.ts.common.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "热度表的操作" ,tags="热度表的操作")
public class AppLookController {
    @Autowired
    AppLookService appLookService;
    @PostMapping("/api/appLook/sava.do")
    public R sava(@RequestBody AppLookDto appLookDto){
        return appLookService.sava(appLookDto);
    }
}
