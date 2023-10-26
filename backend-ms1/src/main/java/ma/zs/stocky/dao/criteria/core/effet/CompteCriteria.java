package  ma.zs.stocky.dao.criteria.core.effet;



import ma.zs.stocky.zynerator.criteria.BaseCriteria;
import java.util.List;

public class CompteCriteria extends  BaseCriteria  {

    private String numero;
    private String numeroLike;

    private ProprietaireChequeEffetCriteria proprietaireChequeEffet ;
    private List<ProprietaireChequeEffetCriteria> proprietaireChequeEffets ;
    private BanqueCriteria banque ;
    private List<BanqueCriteria> banques ;


    public CompteCriteria(){}

    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumeroLike(){
        return this.numeroLike;
    }
    public void setNumeroLike(String numeroLike){
        this.numeroLike = numeroLike;
    }


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
}
