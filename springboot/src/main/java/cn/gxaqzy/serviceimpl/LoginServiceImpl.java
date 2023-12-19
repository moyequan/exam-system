package cn.gxaqzy.serviceimpl;

import cn.gxaqzy.entity.Admin;
import cn.gxaqzy.entity.Student;
import cn.gxaqzy.entity.Teacher;
import cn.gxaqzy.mapper.LoginMapper;
import cn.gxaqzy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Admin adminLogin(Integer username, String password) {
        return loginMapper.adminLogin(username,password);
    }

    @Override
    public Teacher teacherLogin(Integer username, String password) {
        return loginMapper.teacherLogin(username,password);
    }

    @Override
    public Student studentLogin(Integer username, String password) {
        return loginMapper.studentLogin(username,password);
    }
}
