import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {CompteCriteria} from './CompteCriteria.model';
import {BeneficiaireCriteria} from './BeneficiaireCriteria.model';
import {ProprietaireChequeEffetCriteria} from './ProprietaireChequeEffetCriteria.model';
import {TypePaiementCriteria} from './TypePaiementCriteria.model';

export class PaiementCriteria  extends BaseCriteria  {

    public id: number;
    public dateEmission: Date;
    public dateEmissionFrom: Date;
    public dateEmissionTo: Date;
    public codeChequeEffet: string;
    public codeChequeEffetLike: string;
    public dateEcheance: Date;
    public dateEcheanceFrom: Date;
    public dateEcheanceTo: Date;
    public dateEncaissement: Date;
    public dateEncaissementFrom: Date;
    public dateEncaissementTo: Date;
     public montant: number;
     public montantMin: number;
     public montantMax: number;
    public pathCheque: string;
    public pathChequeLike: string;
    public description: string;
    public descriptionLike: string;
  public proprietaireChequeEffet: ProprietaireChequeEffetCriteria ;
  public proprietaireChequeEffets: Array<ProprietaireChequeEffetCriteria> ;
  public compte: CompteCriteria ;
  public comptes: Array<CompteCriteria> ;
  public typePaiement: TypePaiementCriteria ;
  public typePaiements: Array<TypePaiementCriteria> ;
  public beneficiaire: BeneficiaireCriteria ;
  public beneficiaires: Array<BeneficiaireCriteria> ;

}
