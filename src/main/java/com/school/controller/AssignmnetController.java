package com.school.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.LinkedHashMap;
import java.util.Map;

import com.school.vo.AssignmentVO;

import org.springframework.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AssignmnetController {
    @PostMapping("assignment/upload")
    public Map<String, Object> uploadAssignment(@RequestPart MultipartFile file){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        Path folderLocation = Paths.get("/Users/youngmin/Desktop/database/assignment_file");
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Path target = folderLocation.resolve(fileName);
        try{
            Files.copy(file.getInputStream(), target, StandardCopyOption.REPLACE_EXISTING);
        }
        catch(IOException e){
            resultMap.put("status", false);
            resultMap.put("message", e.getMessage());
            return resultMap;
        }
        AssignmentVO vo = new AssignmentVO();
        vo.setAs_file(fileName);
        resultMap.put("status", true);
        resultMap.put("message","파일 업로드 완료");
        resultMap.put("fileName", fileName);
        return resultMap;
    }
}
