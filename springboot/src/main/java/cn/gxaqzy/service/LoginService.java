package cn.gxaqzy.service;

import cn.gxaqzy.entity.Admin;
import cn.gxaqzy.entity.Student;
import cn.gxaqzy.entity.Teacher;

public interface LoginService {

    public Admin adminLogin(Integer username, String password);

    public Teacher teacherLogin(Integer username, String password);

    public Student studentLogin(Integer username, String password);
}
