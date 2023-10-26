package ma.zs.stocky.service.impl.admin.effet;


import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffetBanque;
import ma.zs.stocky.dao.criteria.core.effet.ProprietaireChequeEffetBanqueCriteria;
import ma.zs.stocky.dao.facade.core.effet.ProprietaireChequeEffetBanqueDao;
import ma.zs.stocky.dao.specification.core.effet.ProprietaireChequeEffetBanqueSpecification;
import ma.zs.stocky.service.facade.admin.effet.ProprietaireChequeEffetBanqueAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.effet.CompteAdminService ;
import ma.zs.stocky.bean.core.effet.Compte ;
import ma.zs.stocky.service.facade.admin.effet.BanqueAdminService ;
import ma.zs.stocky.bean.core.effet.Banque ;
import ma.zs.stocky.service.facade.admin.effet.ProprietaireChequeEffetAdminService ;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet ;

import java.util.List;
@Service
public class ProprietaireChequeEffetBanqueAdminServiceImpl extends AbstractServiceImpl<ProprietaireChequeEffetBanque, ProprietaireChequeEffetBanqueCriteria, ProprietaireChequeEffetBanqueDao> implements ProprietaireChequeEffetBanqueAdminService {






    public List<ProprietaireChequeEffetBanque> findByProprietaireChequeEffetId(Long id){
        return dao.findByProprietaireChequeEffetId(id);
    }
    public int deleteByProprietaireChequeEffetId(Long id){
        return dao.deleteByProprietaireChequeEffetId(id);
    }
    public long countByProprietaireChequeEffetId(Long id){
        return dao.countByProprietaireChequeEffetId(id);
    }
    public List<ProprietaireChequeEffetBanque> findByBanqueId(Long id){
        return dao.findByBanqueId(id);
    }
    public int deleteByBanqueId(Long id){
        return dao.deleteByBanqueId(id);
    }
    public long countByBanqueCode(String code){
        return dao.countByBanqueCode(code);
    }
    public List<ProprietaireChequeEffetBanque> findByCompteId(Long id){
        return dao.findByCompteId(id);
    }
    public int deleteByCompteId(Long id){
        return dao.deleteByCompteId(id);
    }
    public long countByCompteId(Long id){
        return dao.countByCompteId(id);
    }






    public void configure() {
        super.configure(ProprietaireChequeEffetBanque.class, ProprietaireChequeEffetBanqueSpecification.class);
    }


    @Autowired
    private CompteAdminService compteService ;
    @Autowired
    private BanqueAdminService banqueService ;
    @Autowired
    private ProprietaireChequeEffetAdminService proprietaireChequeEffetService ;

    public ProprietaireChequeEffetBanqueAdminServiceImpl(ProprietaireChequeEffetBanqueDao dao) {
        super(dao);
    }

}
