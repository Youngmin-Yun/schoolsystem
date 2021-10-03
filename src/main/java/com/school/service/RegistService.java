package com.school.service;

import com.school.mapper.AdminRegistMapper;
import com.school.mapper.RegistStudent;
import com.school.mapper.RegistTeacher;
import com.school.vo.AdminRegistVO;
import com.school.vo.RegistStudentVO;
import com.school.vo.RegistTeacherVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistService {
    @Autowired
    RegistStudent s_mapper;
    @Autowired
    RegistTeacher t_mapper;
    @Autowired
    AdminRegistMapper a_mapper;
    public boolean registStudent(RegistStudentVO vo){
        Integer cnt = s_mapper.selectStudentByID(vo.getRes_id());
        Integer eml = s_mapper.selectStudentByEmail(vo.getRes_email());
        if(cnt != 0){
            return false;
        }
        if(eml != 0){
            return false;
        }
        if(vo.getRes_id() == "" || vo.getRes_id() == null){
            return false;
        }
        if(vo.getRes_pwd() == "" || vo.getRes_pwd() == null || vo.getRes_pwd().length() <6){
            return false;
        }
        if(vo.getRes_name() == "" || vo.getRes_name() == null){
            return false;
        }
        if(vo.getRes_address()==""|| vo.getRes_address()==null){
            return false;
        }
        if(vo.getRes_phone()==""|| vo.getRes_phone()==null){
            return false;
        }
        if(vo.getRes_birth()==null){
            return false;
        }
        if(vo.getRes_phone2() == "" || vo.getRes_phone2() == null){
            return false;
        }
        s_mapper.addStudent(vo);
        return true;
    }
    public boolean isDuplicateId(String id){
        return s_mapper.selectStudentByID(id)>0;
    }
    public boolean isDuplicateByEmail(String email){
        return s_mapper.selectStudentByEmail(email)>0;
    }

    public boolean registTeacher(RegistTeacherVO vo){
        Integer id = t_mapper.selectTeacherByID(vo.getRet_id());
        Integer eml = t_mapper.selectTeacherByEmail(vo.getRet_email());
        if(id != 0){
            return false;
        }
        if(eml != 0){
            return false;
        }
        if(vo.getRet_id() == "" || vo.getRet_id() == null){
            return false;
        }
        if(vo.getRet_pwd() == "" || vo.getRet_pwd() == null || vo.getRet_pwd().length() <6){
            return false;
        }
        if(vo.getRet_name() =="" || vo.getRet_name() == null){
            return false;
        }
        if(vo.getRet_subject()==""|| vo.getRet_subject() == null){
            return false;
        }  
        if(vo.getRet_email()==""|| vo.getRet_email()==null){
            return false;
        }
        if(vo.getRet_address()=="" || vo.getRet_address()==null){
            return false;
        }
        if(vo.getRet_birth()==null){
            return false;
        }
        if(vo.getRet_phone()==""||vo.getRet_phone()==null){
            return false;
        }
        t_mapper.addTeacher(vo);
        return true;
    }
    public boolean isDuplicatedId(String id){
        return t_mapper.selectTeacherByID(id)>0;
    }
    public boolean isDuplicatedEmail(String email){
        return t_mapper.selectTeacherByEmail(email)>0;
    }
    public boolean addAdmin(AdminRegistVO vo){
        if(vo.getAd_id() == "" || vo.getAd_id() == null){
            return false;
        }
        if(vo.getAd_name() == "" || vo.getAd_name() == null){
            return false;
        }
        if(vo.getAd_pwd() == "" || vo.getAd_pwd() == null || vo.getAd_pwd().length() <6){
            return false;
        }
        if(vo.getAd_birth() == null){
            return false;
        }
        if(vo.getAd_phone() == "" || vo.getAd_phone() == null){
            return false;
        }
        if(vo.getAd_address() == "" || vo.getAd_address() == null){
            return false;
        }
        if(vo.getAd_email() == "" || vo.getAd_email() == null){
            return false;
        }
        a_mapper.registAdmin(vo);
        return true;
    }
    public boolean DuplicatedId(String id){
        return a_mapper.DuplicatedId(id)>0;
    }
    public boolean DuplicatedEmail(String email){
        return a_mapper.DuplicatedEmail(email)>0;
    }
    
}
