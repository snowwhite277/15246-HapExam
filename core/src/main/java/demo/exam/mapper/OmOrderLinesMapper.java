package demo.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import demo.exam.dto.OmOrderLines;

import java.util.List;

public interface OmOrderLinesMapper extends Mapper<OmOrderLines>{
    List<OmOrderLines> queryByCond(OmOrderLines omOrderLines);

    Long selectLineNumber(int headerId);

    void  deleteOrderByHeaderId(int headerId);

    void  deleteLineByHeaderId(int headerId);
}