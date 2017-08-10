package demo.exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import demo.exam.dto.OmOrderLines;

import java.util.List;

public interface IOmOrderLinesService extends IBaseService<OmOrderLines>, ProxySelf<IOmOrderLinesService>{
    List<OmOrderLines> queryByCond(IRequest iRequest, OmOrderLines omOrderLines, int page, int pagesize);

    Long selectLineNumber(String headerId);

    void  deleteFun(String headerId);

}