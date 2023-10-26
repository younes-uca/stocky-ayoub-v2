package ma.zs.stocky.service.facade.admin.commun;

import java.util.List;
import ma.zs.stocky.bean.core.commun.Stock;
import ma.zs.stocky.dao.criteria.core.commun.StockCriteria;
import ma.zs.stocky.zynerator.service.IService;

import ma.zs.stocky.ws.dto.commun.StockDto;
import org.springframework.http.HttpEntity;


public interface StockAdminService extends  IService<Stock,StockCriteria>  {

    List<Stock> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);
    List<Stock> findByDepotId(Long id);
    int deleteByDepotId(Long id);
    long countByDepotLibelle(String libelle);


    HttpEntity<byte[]> createPdf(StockDto dto) throws Exception;

}
