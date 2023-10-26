package ma.zs.stocky.service.impl.admin.effet;


import ma.zs.stocky.bean.core.effet.TypePaiement;
import ma.zs.stocky.dao.criteria.core.effet.TypePaiementCriteria;
import ma.zs.stocky.dao.facade.core.effet.TypePaiementDao;
import ma.zs.stocky.dao.specification.core.effet.TypePaiementSpecification;
import ma.zs.stocky.service.facade.admin.effet.TypePaiementAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TypePaiementAdminServiceImpl extends AbstractServiceImpl<TypePaiement, TypePaiementCriteria, TypePaiementDao> implements TypePaiementAdminService {





    public TypePaiement findByReferenceEntity(TypePaiement t){
        return  dao.findByCode(t.getCode());
    }







    public void configure() {
        super.configure(TypePaiement.class, TypePaiementSpecification.class);
    }



    public TypePaiementAdminServiceImpl(TypePaiementDao dao) {
        super(dao);
    }

}
