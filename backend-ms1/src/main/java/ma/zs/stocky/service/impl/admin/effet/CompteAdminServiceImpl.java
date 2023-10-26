package ma.zs.stocky.service.impl.admin.effet;


import ma.zs.stocky.bean.core.effet.Compte;
import ma.zs.stocky.dao.criteria.core.effet.CompteCriteria;
import ma.zs.stocky.dao.facade.core.effet.CompteDao;
import ma.zs.stocky.dao.specification.core.effet.CompteSpecification;
import ma.zs.stocky.service.facade.admin.effet.CompteAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.effet.BanqueAdminService ;
import ma.zs.stocky.bean.core.effet.Banque ;
import ma.zs.stocky.service.facade.admin.effet.ProprietaireChequeEffetAdminService ;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet ;

import java.util.List;
@Service
public class CompteAdminServiceImpl extends AbstractServiceImpl<Compte, CompteCriteria, CompteDao> implements CompteAdminService {






    public List<Compte> findByProprietaireChequeEffetId(Long id){
        return dao.findByProprietaireChequeEffetId(id);
    }
    public int deleteByProprietaireChequeEffetId(Long id){
        return dao.deleteByProprietaireChequeEffetId(id);
    }
    public long countByProprietaireChequeEffetId(Long id){
        return dao.countByProprietaireChequeEffetId(id);
    }
    public List<Compte> findByBanqueId(Long id){
        return dao.findByBanqueId(id);
    }
    public int deleteByBanqueId(Long id){
        return dao.deleteByBanqueId(id);
    }
    public long countByBanqueCode(String code){
        return dao.countByBanqueCode(code);
    }






    public void configure() {
        super.configure(Compte.class, CompteSpecification.class);
    }


    @Autowired
    private BanqueAdminService banqueService ;
    @Autowired
    private ProprietaireChequeEffetAdminService proprietaireChequeEffetService ;

    public CompteAdminServiceImpl(CompteDao dao) {
        super(dao);
    }

}
