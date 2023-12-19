package cn.gxaqzy.serviceimpl;

import cn.gxaqzy.vo.AnswerVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.gxaqzy.mapper.AnswerMapper;
import cn.gxaqzy.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public IPage<AnswerVO> findAll(Page<AnswerVO> page) {
        return answerMapper.findAll(page);
    }
}
