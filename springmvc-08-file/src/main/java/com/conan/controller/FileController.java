package com.conan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;


@RestController
public class FileController {
    @RequestMapping("/upload")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        String path = request.getSession().getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址: "+realPath);

        file.transferTo(new File(realPath + "/" + file.getOriginalFilename()));
        return "redirect:/index.jsp";
    }
    @RequestMapping("/download")
    public String downloads(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/upload");
        String fileName = "1.txt";

        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");

        response.setHeader("Content-Disposition",
                "attachment;fileName="+ URLEncoder.encode(fileName,"UTF-8"));

        File file = new File(path, fileName);
//        读取文件输入流
        InputStream input = new FileInputStream(file);

//        写出文件输出流
        OutputStream out = response.getOutputStream();

        byte[] buff = new byte[1024];
        int index=0;
        while ((index = input.read(buff)) != -1) {
            out.write(buff, 0, index);
            out.flush();
        }
        out.close();
        input.close();
        return null;

    }
}
