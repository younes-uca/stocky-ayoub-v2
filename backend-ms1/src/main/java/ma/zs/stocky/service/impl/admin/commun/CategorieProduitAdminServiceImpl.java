package ma.zs.stocky.service.impl.admin.commun;


import ma.zs.stocky.bean.core.commun.CategorieProduit;
import ma.zs.stocky.dao.criteria.core.commun.CategorieProduitCriteria;
import ma.zs.stocky.dao.facade.core.commun.CategorieProduitDao;
import ma.zs.stocky.dao.specification.core.commun.CategorieProduitSpecification;
import ma.zs.stocky.service.facade.admin.commun.CategorieProduitAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.service.Attribute;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;




import ma.zs.stocky.zynerator.util.VelocityPdf;
import ma.zs.stocky.ws.dto.commun.CategorieProduitDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class CategorieProduitAdminServiceImpl extends AbstractServiceImpl<CategorieProduit, CategorieProduitCriteria, CategorieProduitDao> implements CategorieProduitAdminService {
    public static final String TEMPLATE = "template/categorieProduit.vm";
    public static final String FILE_NAME = "categorieProduit.pdf";
public static final List<Attribute> ATTRIBUTES = new ArrayList();
    static{


    ATTRIBUTES.add(new Attribute("reference"));

    ATTRIBUTES.add(new Attribute("libelle"));
    }

    @Override
    public HttpEntity<byte[]> createPdf(CategorieProduitDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }




    public CategorieProduit findByReferenceEntity(CategorieProduit t){
        return  dao.findByLibelle(t.getLibelle());
    }




    @Override
    protected List<Attribute> getAttributes() {
        return ATTRIBUTES;
    }



    public void configure() {
        super.configure(CategorieProduit.class, CategorieProduitSpecification.class);
    }


    @Autowired
    private VelocityPdf velocityPdf;

    public CategorieProduitAdminServiceImpl(CategorieProduitDao dao) {
        super(dao);
    }

}
