import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {CollaborateurCriteria} from '../commun/CollaborateurCriteria.model';
import {FournisseurCriteria} from '../commun/FournisseurCriteria.model';
import {EntreeProduitItemCriteria} from './EntreeProduitItemCriteria.model';
import {TauxTvaCriteria} from '../effet/TauxTvaCriteria.model';
import {DepotCriteria} from '../commun/DepotCriteria.model';

export class EntreeProduitCriteria  extends BaseCriteria  {

    public id: number;
    public reference: string;
    public referenceLike: string;
    public dateEntreeProduit: Date;
    public dateEntreeProduitFrom: Date;
    public dateEntreeProduitTo: Date;
     public totalHT: number;
     public totalHTMin: number;
     public totalHTMax: number;
     public totalTVA: number;
     public totalTVAMin: number;
     public totalTVAMax: number;
     public totalHTTC: number;
     public totalHTTCMin: number;
     public totalHTTCMax: number;
    public description: string;
    public descriptionLike: string;
  public tauxTva: TauxTvaCriteria ;
  public tauxTvas: Array<TauxTvaCriteria> ;
  public fournisseur: FournisseurCriteria ;
  public fournisseurs: Array<FournisseurCriteria> ;
  public depot: DepotCriteria ;
  public depots: Array<DepotCriteria> ;
  public collaborateur: CollaborateurCriteria ;
  public collaborateurs: Array<CollaborateurCriteria> ;
      public entreeProduitItems: Array<EntreeProduitItemCriteria>;

}
