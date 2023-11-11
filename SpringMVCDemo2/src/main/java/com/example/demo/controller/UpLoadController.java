package com.example.demo.controller;

import com.fasterxml.jackson.databind.util.ClassUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UpLoadController {
    //4.上传文件
    @RequestMapping("/myUpload")
    public String Upload(@RequestPart("myImg") MultipartFile file) throws IOException {
        System.out.println("=================================");
        String originalFileName = file.getOriginalFilename();
        // 1>获得上传文件后缀名
        String hzName = originalFileName.substring(originalFileName.lastIndexOf("."));
        // 2>获得文件保存地址(使用唯一标识，确保同一时刻多个用户上传文件不会覆盖)
        String filePath = "E:/"+ UUID.randomUUID() + hzName;  //(空指针异常)

        System.out.println(filePath);

        File saveFile = new File(filePath);
        try {
            file.transferTo(saveFile);//保存文件
            System.out.println("文件上传成功！");
            System.out.println("=================================");
            return "上传文件成功！";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传文件失败！！！";
    }
}
