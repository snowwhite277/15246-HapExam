package demo.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import demo.exam.mapper.OmOrderLinesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.exam.dto.OmOrderLines;
import demo.exam.service.IOmOrderLinesService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmOrderLinesServiceImpl extends BaseServiceImpl<OmOrderLines> implements IOmOrderLinesService{
    @Autowired
    private OmOrderLinesMapper omOrderLinesMapper;

    public List<OmOrderLines> queryByCond(IRequest iRequest, OmOrderLines omOrderLines, int page, int pagesize){
        PageHelper.startPage(page,pagesize);
        List<OmOrderLines> omOrderLinesList=omOrderLinesMapper.queryByCond(omOrderLines);
        return omOrderLinesList;
    }

    public Long selectLineNumber(String header){
        int headerId=Integer.valueOf(header);
        Long line=omOrderLinesMapper.selectLineNumber(headerId);
        return line;
    }

    @Override
    public void deleteFun(String header) {
        int headerId=Integer.valueOf(header);
        omOrderLinesMapper.deleteOrderByHeaderId(headerId);
        omOrderLinesMapper.deleteLineByHeaderId(headerId);
    }

}