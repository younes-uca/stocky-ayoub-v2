package  ma.zs.stocky.dao.criteria.core.effet;



import ma.zs.stocky.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ProprietaireChequeEffetCriteria extends  BaseCriteria  {

    private String nom;
    private String nomLike;



    public ProprietaireChequeEffetCriteria(){}

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }


}
