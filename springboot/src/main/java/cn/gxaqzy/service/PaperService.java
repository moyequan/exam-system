package cn.gxaqzy.service;

import cn.gxaqzy.entity.PaperManage;

import java.util.List;

public interface PaperService {

    List<PaperManage> findAll();

    List<PaperManage> findById(Integer paperId);

    int add(PaperManage paperManage);
}
