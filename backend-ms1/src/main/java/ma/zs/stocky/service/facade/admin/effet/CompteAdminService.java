package ma.zs.stocky.service.facade.admin.effet;

import java.util.List;
import ma.zs.stocky.bean.core.effet.Compte;
import ma.zs.stocky.dao.criteria.core.effet.CompteCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface CompteAdminService extends  IService<Compte,CompteCriteria>  {

    List<Compte> findByProprietaireChequeEffetId(Long id);
    int deleteByProprietaireChequeEffetId(Long id);
    long countByProprietaireChequeEffetId(Long id);
    List<Compte> findByBanqueId(Long id);
    int deleteByBanqueId(Long id);
    long countByBanqueCode(String code);



}
