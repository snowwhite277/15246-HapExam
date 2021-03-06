package demo.exam.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
@ExtensionAttribute(disable=true)
@Table(name = "hap_org_companys")
public class OrgCompanys extends BaseDTO {

     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_COMPANY_NUMBER = "companyNumber";
     public static final String FIELD_COMPANY_NAME = "companyName";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_CREATION_DATE = "creationDate";
     public static final String FIELD_CREATED_BY = "createdBy";
     public static final String FIELD_LAST_UPDATED_BY = "lastUpdatedBy";
     public static final String FIELD_LAST_UPDATE_DATE = "lastUpdateDate";
     public static final String FIELD_LAST_UPDATE_LOGIN = "lastUpdateLogin";


     @Id
     @GeneratedValue
     private Long companyId; //公司ID

     @NotEmpty
     @Length(max = 60)
     private String companyNumber; //公司编号

     @NotEmpty
     @Length(max = 240)
     private String companyName; //公司名称

     @NotEmpty
     @Length(max = 1)
     private String enabledFlag; //启用标识

     private Date creationDate;

     private Long createdBy;

     private Long lastUpdatedBy;

     private Date lastUpdateDate;

     private Long lastUpdateLogin;


     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setCompanyNumber(String companyNumber){
         this.companyNumber = companyNumber;
     }

     public String getCompanyNumber(){
         return companyNumber;
     }

     public void setCompanyName(String companyName){
         this.companyName = companyName;
     }

     public String getCompanyName(){
         return companyName;
     }

     public void setEnabledFlag(String enabledFlag){
         this.enabledFlag = enabledFlag;
     }

     public String getEnabledFlag(){
         return enabledFlag;
     }

     public void setCreationDate(Date creationDate){
         this.creationDate = creationDate;
     }

     public Date getCreationDate(){
         return creationDate;
     }

     public void setCreatedBy(Long createdBy){
         this.createdBy = createdBy;
     }

     public Long getCreatedBy(){
         return createdBy;
     }

     public void setLastUpdatedBy(Long lastUpdatedBy){
         this.lastUpdatedBy = lastUpdatedBy;
     }

     public Long getLastUpdatedBy(){
         return lastUpdatedBy;
     }

     public void setLastUpdateDate(Date lastUpdateDate){
         this.lastUpdateDate = lastUpdateDate;
     }

     public Date getLastUpdateDate(){
         return lastUpdateDate;
     }

     public void setLastUpdateLogin(Long lastUpdateLogin){
         this.lastUpdateLogin = lastUpdateLogin;
     }

     public Long getLastUpdateLogin(){
         return lastUpdateLogin;
     }

     }
