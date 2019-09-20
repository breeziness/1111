package com.breeze.ts.provider.controller;

import com.breeze.ts.common.vo.R;
import com.breeze.ts.provider.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @PostMapping("/provider/resource/imgfileup.do")
    public R fileUp(MultipartFile file) throws IOException {
        return resourceService.imageUp(file);
    }
    @PostMapping("/provider/resource/batchimgfileup.do")
    public R fileUp(MultipartFile[] files) throws IOException {
        return resourceService.imageUp(files);
    }
}
