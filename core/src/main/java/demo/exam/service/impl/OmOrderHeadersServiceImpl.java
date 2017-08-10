package demo.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import demo.exam.dto.OmOrderHeaders;
import demo.exam.mapper.OmOrderHeadersMapper;
import demo.exam.service.IOmOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmOrderHeadersServiceImpl extends BaseServiceImpl<OmOrderHeaders> implements IOmOrderHeadersService{
    @Autowired
    private OmOrderHeadersMapper mapper;

    @Override
    public List<OmOrderHeaders> selectAll1(IRequest request, OmOrderHeaders emp, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
       List<OmOrderHeaders> omOrderHeadersExts= mapper.selectAll1(emp);
        return omOrderHeadersExts;
    }

    @Override
    public  List<OmOrderHeaders>  selectMes(IRequest request, OmOrderHeaders emp) {
        List<OmOrderHeaders>  omOrderHeaders=  mapper.selectMes(emp);
        return omOrderHeaders;
    }
}