package ma.zs.stocky.service.facade.admin.effet;

import java.util.List;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffetBanque;
import ma.zs.stocky.dao.criteria.core.effet.ProprietaireChequeEffetBanqueCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface ProprietaireChequeEffetBanqueAdminService extends  IService<ProprietaireChequeEffetBanque,ProprietaireChequeEffetBanqueCriteria>  {

    List<ProprietaireChequeEffetBanque> findByProprietaireChequeEffetId(Long id);
    int deleteByProprietaireChequeEffetId(Long id);
    long countByProprietaireChequeEffetId(Long id);
    List<ProprietaireChequeEffetBanque> findByBanqueId(Long id);
    int deleteByBanqueId(Long id);
    long countByBanqueCode(String code);
    List<ProprietaireChequeEffetBanque> findByCompteId(Long id);
    int deleteByCompteId(Long id);
    long countByCompteId(Long id);



}
