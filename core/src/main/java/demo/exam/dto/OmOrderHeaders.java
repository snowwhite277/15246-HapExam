package demo.exam.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.*;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

@ExtensionAttribute(disable=true)
@Table(name = "hap_om_order_headers")
public class OmOrderHeaders extends BaseDTO {

     public static final String FIELD_HEADER_ID = "headerId";
     public static final String FIELD_ORDER_NUMBER = "orderNumber";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_ORDER_DATE = "orderDate";
     public static final String FIELD_ORDER_STATUS = "orderStatus";
     public static final String FIELD_CUSTOMER_ID = "customerId";


     @Id
     @GeneratedValue
     private Long headerId; //订单头ID

     @NotEmpty
     @Length(max = 60)
     private String orderNumber; //订单编号

    @Column
     private Long companyId; //公司ID
    @Column
     private Date orderDate; //订单日期

    @Column
     private String orderStatus; //订单状态

     private Long customerId; //客户ID

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Transient
    private String companyName;

    @Transient
    private String customerName;

    @Transient
    private Long inventoryItemId;

    @Transient
    private Long price;


    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

     public void setHeaderId(Long headerId){
         this.headerId = headerId;
     }

     public Long getHeaderId(){
         return headerId;
     }

     public void setOrderNumber(String orderNumber){
         this.orderNumber = orderNumber;
     }

     public String getOrderNumber(){
         return orderNumber;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setOrderDate(Date orderDate){
         this.orderDate = orderDate;
     }

     public Date getOrderDate(){
         return orderDate;
     }

     public void setOrderStatus(String orderStatus){
         this.orderStatus = orderStatus;
     }

     public String getOrderStatus(){
         return orderStatus;
     }

     public void setCustomerId(Long customerId){
         this.customerId = customerId;
     }

     public Long getCustomerId(){
         return customerId;
     }

     }
