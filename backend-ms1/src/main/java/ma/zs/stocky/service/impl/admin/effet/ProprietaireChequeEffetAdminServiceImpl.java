package ma.zs.stocky.service.impl.admin.effet;


import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet;
import ma.zs.stocky.dao.criteria.core.effet.ProprietaireChequeEffetCriteria;
import ma.zs.stocky.dao.facade.core.effet.ProprietaireChequeEffetDao;
import ma.zs.stocky.dao.specification.core.effet.ProprietaireChequeEffetSpecification;
import ma.zs.stocky.service.facade.admin.effet.ProprietaireChequeEffetAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class ProprietaireChequeEffetAdminServiceImpl extends AbstractServiceImpl<ProprietaireChequeEffet, ProprietaireChequeEffetCriteria, ProprietaireChequeEffetDao> implements ProprietaireChequeEffetAdminService {












    public void configure() {
        super.configure(ProprietaireChequeEffet.class, ProprietaireChequeEffetSpecification.class);
    }



    public ProprietaireChequeEffetAdminServiceImpl(ProprietaireChequeEffetDao dao) {
        super(dao);
    }

}
