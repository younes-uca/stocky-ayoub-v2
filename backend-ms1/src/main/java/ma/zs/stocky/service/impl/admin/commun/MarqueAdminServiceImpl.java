package ma.zs.stocky.service.impl.admin.commun;


import ma.zs.stocky.bean.core.commun.Marque;
import ma.zs.stocky.dao.criteria.core.commun.MarqueCriteria;
import ma.zs.stocky.dao.facade.core.commun.MarqueDao;
import ma.zs.stocky.dao.specification.core.commun.MarqueSpecification;
import ma.zs.stocky.service.facade.admin.commun.MarqueAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.service.Attribute;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;




import ma.zs.stocky.zynerator.util.VelocityPdf;
import ma.zs.stocky.ws.dto.commun.MarqueDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class MarqueAdminServiceImpl extends AbstractServiceImpl<Marque, MarqueCriteria, MarqueDao> implements MarqueAdminService {
    public static final String TEMPLATE = "template/marque.vm";
    public static final String FILE_NAME = "marque.pdf";
public static final List<Attribute> ATTRIBUTES = new ArrayList();
    static{


    ATTRIBUTES.add(new Attribute("reference"));

    ATTRIBUTES.add(new Attribute("libelle"));
    }

    @Override
    public HttpEntity<byte[]> createPdf(MarqueDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }




    public Marque findByReferenceEntity(Marque t){
        return  dao.findByLibelle(t.getLibelle());
    }




    @Override
    protected List<Attribute> getAttributes() {
        return ATTRIBUTES;
    }



    public void configure() {
        super.configure(Marque.class, MarqueSpecification.class);
    }


    @Autowired
    private VelocityPdf velocityPdf;

    public MarqueAdminServiceImpl(MarqueDao dao) {
        super(dao);
    }

}
