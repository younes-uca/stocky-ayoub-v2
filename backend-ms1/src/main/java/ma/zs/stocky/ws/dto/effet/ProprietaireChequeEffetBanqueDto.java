package  ma.zs.stocky.ws.dto.effet;

import ma.zs.stocky.zynerator.audit.Log;
import ma.zs.stocky.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProprietaireChequeEffetBanqueDto  extends AuditBaseDto {


    private ProprietaireChequeEffetDto proprietaireChequeEffet ;
    private BanqueDto banque ;
    private CompteDto compte ;



    public ProprietaireChequeEffetBanqueDto(){
        super();
    }




    public ProprietaireChequeEffetDto getProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }

    public void setProprietaireChequeEffet(ProprietaireChequeEffetDto proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    public BanqueDto getBanque(){
        return this.banque;
    }

    public void setBanque(BanqueDto banque){
        this.banque = banque;
    }
    public CompteDto getCompte(){
        return this.compte;
    }

    public void setCompte(CompteDto compte){
        this.compte = compte;
    }






}
