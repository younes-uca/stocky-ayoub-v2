package ma.zs.stocky.service.impl.admin.effet;


import ma.zs.stocky.bean.core.effet.Beneficiaire;
import ma.zs.stocky.dao.criteria.core.effet.BeneficiaireCriteria;
import ma.zs.stocky.dao.facade.core.effet.BeneficiaireDao;
import ma.zs.stocky.dao.specification.core.effet.BeneficiaireSpecification;
import ma.zs.stocky.service.facade.admin.effet.BeneficiaireAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class BeneficiaireAdminServiceImpl extends AbstractServiceImpl<Beneficiaire, BeneficiaireCriteria, BeneficiaireDao> implements BeneficiaireAdminService {





    public Beneficiaire findByReferenceEntity(Beneficiaire t){
        return  dao.findByCin(t.getCin());
    }







    public void configure() {
        super.configure(Beneficiaire.class, BeneficiaireSpecification.class);
    }



    public BeneficiaireAdminServiceImpl(BeneficiaireDao dao) {
        super(dao);
    }

}
