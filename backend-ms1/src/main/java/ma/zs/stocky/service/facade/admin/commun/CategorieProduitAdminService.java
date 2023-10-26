package ma.zs.stocky.service.facade.admin.commun;

import java.util.List;
import ma.zs.stocky.bean.core.commun.CategorieProduit;
import ma.zs.stocky.dao.criteria.core.commun.CategorieProduitCriteria;
import ma.zs.stocky.zynerator.service.IService;

import ma.zs.stocky.ws.dto.commun.CategorieProduitDto;
import org.springframework.http.HttpEntity;


public interface CategorieProduitAdminService extends  IService<CategorieProduit,CategorieProduitCriteria>  {



    HttpEntity<byte[]> createPdf(CategorieProduitDto dto) throws Exception;

}
