package ma.zs.stocky.service.facade.admin.commun;

import java.util.List;
import ma.zs.stocky.bean.core.commun.Marque;
import ma.zs.stocky.dao.criteria.core.commun.MarqueCriteria;
import ma.zs.stocky.zynerator.service.IService;

import ma.zs.stocky.ws.dto.commun.MarqueDto;
import org.springframework.http.HttpEntity;


public interface MarqueAdminService extends  IService<Marque,MarqueCriteria>  {



    HttpEntity<byte[]> createPdf(MarqueDto dto) throws Exception;

}
