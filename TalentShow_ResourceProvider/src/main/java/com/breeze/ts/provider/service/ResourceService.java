package com.breeze.ts.provider.service;

import com.breeze.ts.common.vo.R;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ResourceService {
    //上传一张图片
    R<String> imageUp(MultipartFile file) throws IOException;
    //上传多张图片
    R<String> imageUp(MultipartFile[] files) throws IOException;
}
