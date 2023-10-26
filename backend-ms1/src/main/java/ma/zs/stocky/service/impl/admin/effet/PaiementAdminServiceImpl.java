package ma.zs.stocky.service.impl.admin.effet;


import ma.zs.stocky.bean.core.effet.Paiement;
import ma.zs.stocky.dao.criteria.core.effet.PaiementCriteria;
import ma.zs.stocky.dao.facade.core.effet.PaiementDao;
import ma.zs.stocky.dao.specification.core.effet.PaiementSpecification;
import ma.zs.stocky.service.facade.admin.effet.PaiementAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.effet.CompteAdminService ;
import ma.zs.stocky.bean.core.effet.Compte ;
import ma.zs.stocky.service.facade.admin.effet.BeneficiaireAdminService ;
import ma.zs.stocky.bean.core.effet.Beneficiaire ;
import ma.zs.stocky.service.facade.admin.effet.ProprietaireChequeEffetAdminService ;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet ;
import ma.zs.stocky.service.facade.admin.effet.TypePaiementAdminService ;
import ma.zs.stocky.bean.core.effet.TypePaiement ;

import java.util.List;
@Service
public class PaiementAdminServiceImpl extends AbstractServiceImpl<Paiement, PaiementCriteria, PaiementDao> implements PaiementAdminService {





    public Paiement findByReferenceEntity(Paiement t){
        return  dao.findByCodeChequeEffet(t.getCodeChequeEffet());
    }

    public List<Paiement> findByProprietaireChequeEffetId(Long id){
        return dao.findByProprietaireChequeEffetId(id);
    }
    public int deleteByProprietaireChequeEffetId(Long id){
        return dao.deleteByProprietaireChequeEffetId(id);
    }
    public long countByProprietaireChequeEffetId(Long id){
        return dao.countByProprietaireChequeEffetId(id);
    }
    public List<Paiement> findByCompteId(Long id){
        return dao.findByCompteId(id);
    }
    public int deleteByCompteId(Long id){
        return dao.deleteByCompteId(id);
    }
    public long countByCompteId(Long id){
        return dao.countByCompteId(id);
    }
    public List<Paiement> findByTypePaiementId(Long id){
        return dao.findByTypePaiementId(id);
    }
    public int deleteByTypePaiementId(Long id){
        return dao.deleteByTypePaiementId(id);
    }
    public long countByTypePaiementCode(String code){
        return dao.countByTypePaiementCode(code);
    }
    public List<Paiement> findByBeneficiaireId(Long id){
        return dao.findByBeneficiaireId(id);
    }
    public int deleteByBeneficiaireId(Long id){
        return dao.deleteByBeneficiaireId(id);
    }
    public long countByBeneficiaireCin(String cin){
        return dao.countByBeneficiaireCin(cin);
    }






    public void configure() {
        super.configure(Paiement.class, PaiementSpecification.class);
    }


    @Autowired
    private CompteAdminService compteService ;
    @Autowired
    private BeneficiaireAdminService beneficiaireService ;
    @Autowired
    private ProprietaireChequeEffetAdminService proprietaireChequeEffetService ;
    @Autowired
    private TypePaiementAdminService typePaiementService ;

    public PaiementAdminServiceImpl(PaiementDao dao) {
        super(dao);
    }

}
