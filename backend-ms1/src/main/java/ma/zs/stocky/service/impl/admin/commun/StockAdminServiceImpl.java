package ma.zs.stocky.service.impl.admin.commun;


import ma.zs.stocky.bean.core.commun.Stock;
import ma.zs.stocky.dao.criteria.core.commun.StockCriteria;
import ma.zs.stocky.dao.facade.core.commun.StockDao;
import ma.zs.stocky.dao.specification.core.commun.StockSpecification;
import ma.zs.stocky.service.facade.admin.commun.StockAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.service.Attribute;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;




import ma.zs.stocky.zynerator.util.VelocityPdf;
import ma.zs.stocky.ws.dto.commun.StockDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.commun.ProduitAdminService ;
import ma.zs.stocky.bean.core.commun.Produit ;
import ma.zs.stocky.service.facade.admin.commun.DepotAdminService ;
import ma.zs.stocky.bean.core.commun.Depot ;

import java.util.List;
@Service
public class StockAdminServiceImpl extends AbstractServiceImpl<Stock, StockCriteria, StockDao> implements StockAdminService {
    public static final String TEMPLATE = "template/stock.vm";
    public static final String FILE_NAME = "stock.pdf";
public static final List<Attribute> ATTRIBUTES = new ArrayList();
    static{




    ATTRIBUTES.add(new Attribute("quantite","BigDecimal"));
    }

    @Override
    public HttpEntity<byte[]> createPdf(StockDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }





    public List<Stock> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public long countByProduitId(Long id){
        return dao.countByProduitId(id);
    }
    public List<Stock> findByDepotId(Long id){
        return dao.findByDepotId(id);
    }
    public int deleteByDepotId(Long id){
        return dao.deleteByDepotId(id);
    }
    public long countByDepotLibelle(String libelle){
        return dao.countByDepotLibelle(libelle);
    }



    @Override
    protected List<Attribute> getAttributes() {
        return ATTRIBUTES;
    }



    public void configure() {
        super.configure(Stock.class, StockSpecification.class);
    }


    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private DepotAdminService depotService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public StockAdminServiceImpl(StockDao dao) {
        super(dao);
    }

}
