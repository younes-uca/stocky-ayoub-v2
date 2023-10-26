package  ma.zs.stocky.ws.dto.effet;

import ma.zs.stocky.zynerator.audit.Log;
import ma.zs.stocky.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompteDto  extends AuditBaseDto {

    private String numero  ;

    private ProprietaireChequeEffetDto proprietaireChequeEffet ;
    private BanqueDto banque ;



    public CompteDto(){
        super();
    }



    @Log
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
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






}
