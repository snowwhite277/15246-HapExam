package demo.exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import demo.exam.dto.OmOrderHeaders;

import java.util.List;

public interface IOmOrderHeadersService extends IBaseService<OmOrderHeaders>, ProxySelf<IOmOrderHeadersService>{
     List<OmOrderHeaders> selectAll1(IRequest request, OmOrderHeaders emp, int pageNum, int pageSize);

      List<OmOrderHeaders>  selectMes(IRequest request, OmOrderHeaders emp);
}