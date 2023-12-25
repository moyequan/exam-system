package com.exam.service;

import com.exam.vo.AnswerVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface AnswerService {

    IPage<AnswerVO> findAll(Page<AnswerVO> page);
}
