import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {CompteDto} from './Compte.model';
import {BeneficiaireDto} from './Beneficiaire.model';
import {ProprietaireChequeEffetDto} from './ProprietaireChequeEffet.model';
import {TypePaiementDto} from './TypePaiement.model';

export class PaiementDto extends BaseDto{

   public dateEmission: Date;

    public codeChequeEffet: string;

   public dateEcheance: Date;

   public dateEncaissement: Date;

    public montant: null | number;

    public pathCheque: string;

    public description: string;

    public proprietaireChequeEffet: ProprietaireChequeEffetDto ;
    public compte: CompteDto ;
    public typePaiement: TypePaiementDto ;
    public beneficiaire: BeneficiaireDto ;
    

    constructor() {
        super();

        this.dateEmission = null;
        this.codeChequeEffet = '';
        this.dateEcheance = null;
        this.dateEncaissement = null;
        this.montant = null;
        this.pathCheque = '';
        this.description = '';
        this.proprietaireChequeEffet = new ProprietaireChequeEffetDto() ;
        this.compte = new CompteDto() ;
        this.typePaiement = new TypePaiementDto() ;
        this.beneficiaire = new BeneficiaireDto() ;

        }

}
