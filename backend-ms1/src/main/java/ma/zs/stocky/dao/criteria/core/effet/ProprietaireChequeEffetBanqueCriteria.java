package  ma.zs.stocky.dao.criteria.core.effet;



import ma.zs.stocky.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ProprietaireChequeEffetBanqueCriteria extends  BaseCriteria  {


    private ProprietaireChequeEffetCriteria proprietaireChequeEffet ;
    private List<ProprietaireChequeEffetCriteria> proprietaireChequeEffets ;
    private BanqueCriteria banque ;
    private List<BanqueCriteria> banques ;
    private CompteCriteria compte ;
    private List<CompteCriteria> comptes ;


    public ProprietaireChequeEffetBanqueCriteria(){}


    public ProprietaireChequeEffetCriteria getProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }

    public void setProprietaireChequeEffet(ProprietaireChequeEffetCriteria proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    public List<ProprietaireChequeEffetCriteria> getProprietaireChequeEffets(){
        return this.proprietaireChequeEffets;
    }

    public void setProprietaireChequeEffets(List<ProprietaireChequeEffetCriteria> proprietaireChequeEffets){
        this.proprietaireChequeEffets = proprietaireChequeEffets;
    }
    public BanqueCriteria getBanque(){
        return this.banque;
    }

    public void setBanque(BanqueCriteria banque){
        this.banque = banque;
    }
    public List<BanqueCriteria> getBanques(){
        return this.banques;
    }

    public void setBanques(List<BanqueCriteria> banques){
        this.banques = banques;
    }
    public CompteCriteria getCompte(){
        return this.compte;
    }

    public void setCompte(CompteCriteria compte){
        this.compte = compte;
    }
    public List<CompteCriteria> getComptes(){
        return this.comptes;
    }

    public void setComptes(List<CompteCriteria> comptes){
        this.comptes = comptes;
    }
}
