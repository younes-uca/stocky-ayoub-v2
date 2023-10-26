package ma.zs.stocky.service.impl.admin.commun;


import ma.zs.stocky.bean.core.commun.Collaborateur;
import ma.zs.stocky.dao.criteria.core.commun.CollaborateurCriteria;
import ma.zs.stocky.dao.facade.core.commun.CollaborateurDao;
import ma.zs.stocky.dao.specification.core.commun.CollaborateurSpecification;
import ma.zs.stocky.service.facade.admin.commun.CollaborateurAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import ma.zs.stocky.zynerator.security.service.facade.UserService;
import ma.zs.stocky.zynerator.security.service.facade.RoleService;
import ma.zs.stocky.zynerator.security.bean.Role;
import java.util.Collection;
import java.util.List;
@Service
public class CollaborateurAdminServiceImpl extends AbstractServiceImpl<Collaborateur, CollaborateurCriteria, CollaborateurDao> implements CollaborateurAdminService {





    public Collaborateur findByReferenceEntity(Collaborateur t){
        return  dao.findByPrenom(t.getPrenom());
    }






    @Override
    public Collaborateur create(Collaborateur t) {
        if (findByUsername(t.getUsername()) != null || t.getPassword() == null) return null;
        t.setPassword(userService.cryptPassword(t.getPassword()));
        t.setEnabled(true);
        t.setAccountNonExpired(true);
        t.setAccountNonLocked(true);
        t.setCredentialsNonExpired(true);
        t.setPasswordChanged(false);
        if (t.getRoles() != null) {
            Collection<Role> roles = new ArrayList<Role>();
            for (Role role : t.getRoles()) {
                roles.add(roleService.save(role));
            }
            t.setRoles(roles);
        }
        Collaborateur mySaved = super.create(t);

        return mySaved;
     }

    public Collaborateur findByUsername(String username){
    return dao.findByUsername(username);
    }

    public boolean changePassword(String username, String newPassword) {
    return userService.changePassword(username, newPassword);
    }

    public void configure() {
        super.configure(Collaborateur.class, CollaborateurSpecification.class);
    }

    @Autowired
    private UserService userService;


    @Autowired
    private RoleService roleService;


    public CollaborateurAdminServiceImpl(CollaborateurDao dao) {
        super(dao);
    }

}
