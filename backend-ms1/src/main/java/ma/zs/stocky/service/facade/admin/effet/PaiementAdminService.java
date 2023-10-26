package ma.zs.stocky.service.facade.admin.effet;

import java.util.List;
import ma.zs.stocky.bean.core.effet.Paiement;
import ma.zs.stocky.dao.criteria.core.effet.PaiementCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface PaiementAdminService extends  IService<Paiement,PaiementCriteria>  {

    List<Paiement> findByProprietaireChequeEffetId(Long id);
    int deleteByProprietaireChequeEffetId(Long id);
    long countByProprietaireChequeEffetId(Long id);
    List<Paiement> findByCompteId(Long id);
    int deleteByCompteId(Long id);
    long countByCompteId(Long id);
    List<Paiement> findByTypePaiementId(Long id);
    int deleteByTypePaiementId(Long id);
    long countByTypePaiementCode(String code);
    List<Paiement> findByBeneficiaireId(Long id);
    int deleteByBeneficiaireId(Long id);
    long countByBeneficiaireCin(String cin);



}
