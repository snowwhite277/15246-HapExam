package demo.exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import demo.exam.dto.OmOrderLines;
import demo.exam.service.IOmOrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OmOrderLinesController extends BaseController{

    @Autowired
    private IOmOrderLinesService service;

    /**
     * @auto yujiao.liu
     * @param dto
     * @param page
     * @param pageSize
     * @param request
     * @return ResponseData
     */
    @RequestMapping(value = "/hap/om/order/lines/query")
    @ResponseBody
    public ResponseData query(OmOrderLines dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.queryByCond(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/hap/om/order/lines/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<OmOrderLines> dto, BindingResult result, HttpServletRequest request){
        for(int i = 0 ; i < dto.size() ; i++) {
            if(dto.get(i).getLineId()==null){
                if(dto.get(i).getInventoryItemId()==null){
                    ResponseData responseData = new ResponseData(false);
                  //  responseData.setMessage("物料不能为空，保存失败");
                    return  responseData;
                }
                if(dto.get(i).getOrderdQuantity()==null){
                    ResponseData responseData = new ResponseData(false);
                 //   responseData.setMessage("数量不能为空，保存失败");
                    return  responseData;
                }
                if(dto.get(i).getOrderQuantityUom()==null){
                    ResponseData responseData = new ResponseData(false);
                  //  responseData.setMessage("单价不能为空，保存失败");
                    return  responseData;
                }
            }

        }
//        getValidator().validate(dto, result);
//        if (result.hasErrors()) {
//            ResponseData responseData = new ResponseData(false);
//            responseData.setMessage(getErrorMessage(result, request));
//            return responseData;
//        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    /**
     * @auto  yujiao.liu
     * @description  查看最大的行号
     * @param request
     */
    @RequestMapping(value="/hap/om/order/lines/selectLineNumber")
    @ResponseBody
    public Long selectLineNumber(HttpServletRequest request){
        String headerId=request.getParameter("headerId");
        return service.selectLineNumber(headerId);
    }

    /**
     * @auto  yujiao.liu
     * @description  整单删除
     * @param request
     * @return
     */
    @RequestMapping(value = "/hap/om/order/lines/deleteFun")
    @ResponseBody
    public ResponseData deleteFun(HttpServletRequest request){
        String headerId=request.getParameter("headerId");
        service.deleteFun(headerId);
        return new  ResponseData();
    }

    @RequestMapping(value = "/hap/om/order/lines/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<OmOrderLines> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
}