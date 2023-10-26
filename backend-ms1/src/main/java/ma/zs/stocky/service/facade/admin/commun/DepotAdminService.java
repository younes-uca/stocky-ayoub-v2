package ma.zs.stocky.service.facade.admin.commun;

import java.util.List;
import ma.zs.stocky.bean.core.commun.Depot;
import ma.zs.stocky.dao.criteria.core.commun.DepotCriteria;
import ma.zs.stocky.zynerator.service.IService;

import ma.zs.stocky.ws.dto.commun.DepotDto;
import org.springframework.http.HttpEntity;


public interface DepotAdminService extends  IService<Depot,DepotCriteria>  {



    HttpEntity<byte[]> createPdf(DepotDto dto) throws Exception;

}
