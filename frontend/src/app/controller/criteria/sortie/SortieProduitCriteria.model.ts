import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {CollaborateurCriteria} from '../commun/CollaborateurCriteria.model';
import {SortieProduitItemCriteria} from './SortieProduitItemCriteria.model';
import {TauxTvaCriteria} from '../effet/TauxTvaCriteria.model';
import {DepotCriteria} from '../commun/DepotCriteria.model';

export class SortieProduitCriteria  extends BaseCriteria  {

    public id: number;
    public reference: string;
    public referenceLike: string;
    public dateSortieProduit: Date;
    public dateSortieProduitFrom: Date;
    public dateSortieProduitTo: Date;
     public total: number;
     public totalMin: number;
     public totalMax: number;
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
  public depot: DepotCriteria ;
  public depots: Array<DepotCriteria> ;
  public collaborateur: CollaborateurCriteria ;
  public collaborateurs: Array<CollaborateurCriteria> ;
      public sortieProduitItems: Array<SortieProduitItemCriteria>;

}
