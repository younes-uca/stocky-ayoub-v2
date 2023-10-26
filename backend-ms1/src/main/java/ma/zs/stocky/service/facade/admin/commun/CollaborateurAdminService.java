package ma.zs.stocky.service.facade.admin.commun;

import java.util.List;
import ma.zs.stocky.bean.core.commun.Collaborateur;
import ma.zs.stocky.dao.criteria.core.commun.CollaborateurCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface CollaborateurAdminService extends  IService<Collaborateur,CollaborateurCriteria>  {
    Collaborateur findByUsername(String username);
    boolean changePassword(String username, String newPassword);




}
