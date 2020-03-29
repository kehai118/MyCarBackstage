package com.kehai.controller;

import com.kehai.util.R;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@RestController
public class FileController {
    @PostMapping("/ytupload")
    public R upload(@RequestParam("mypic") MultipartFile multipartFile, HttpServletRequest request){
        if(multipartFile.isEmpty()) return R.ok();

        //文件名
        final String filename = multipartFile.getOriginalFilename();

        //目的地
        try {
            final String path = ResourceUtils.getURL("classpath:").getPath();
            //final File file1 = new File(path + "/static/upLoadFile");
            final File file1 = new File("D:/file/");
            if (!file1.exists()) file1.mkdirs();
            final File file = new File("D:/file",filename);

            //if(!file.exists()) file.createNewFile();

            //System.out.println(file.getPath());
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            return R.error("图片上传失败");
        }
        return R.ok("file",filename);
    }
}
