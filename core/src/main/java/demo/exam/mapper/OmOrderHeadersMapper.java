package demo.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import demo.exam.dto.OmOrderHeaders;

import java.util.List;

public interface OmOrderHeadersMapper extends Mapper<OmOrderHeaders>{
   List<OmOrderHeaders> selectAll1(OmOrderHeaders emp);

   List<OmOrderHeaders>  selectMes(OmOrderHeaders emp);

}