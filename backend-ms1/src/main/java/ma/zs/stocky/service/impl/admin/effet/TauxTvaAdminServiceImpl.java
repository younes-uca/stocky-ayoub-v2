package ma.zs.stocky.service.impl.admin.effet;


import ma.zs.stocky.bean.core.effet.TauxTva;
import ma.zs.stocky.dao.criteria.core.effet.TauxTvaCriteria;
import ma.zs.stocky.dao.facade.core.effet.TauxTvaDao;
import ma.zs.stocky.dao.specification.core.effet.TauxTvaSpecification;
import ma.zs.stocky.service.facade.admin.effet.TauxTvaAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxTvaAdminServiceImpl extends AbstractServiceImpl<TauxTva, TauxTvaCriteria, TauxTvaDao> implements TauxTvaAdminService {





    public TauxTva findByReferenceEntity(TauxTva t){
        return  dao.findByCode(t.getCode());
    }







    public void configure() {
        super.configure(TauxTva.class, TauxTvaSpecification.class);
    }



    public TauxTvaAdminServiceImpl(TauxTvaDao dao) {
        super(dao);
    }

}
