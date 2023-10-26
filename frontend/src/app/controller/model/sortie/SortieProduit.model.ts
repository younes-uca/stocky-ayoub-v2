import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {CollaborateurDto} from '../commun/Collaborateur.model';
import {SortieProduitItemDto} from './SortieProduitItem.model';
import {TauxTvaDto} from '../effet/TauxTva.model';
import {DepotDto} from '../commun/Depot.model';

export class SortieProduitDto extends BaseDto{

    public reference: string;

   public dateSortieProduit: Date;

    public total: null | number;

    public totalHT: null | number;

    public totalTVA: null | number;

    public totalHTTC: null | number;

    public description: string;

    public tauxTva: TauxTvaDto ;
    public depot: DepotDto ;
    public collaborateur: CollaborateurDto ;
     public sortieProduitItems: Array<SortieProduitItemDto>;
    

    constructor() {
        super();

        this.reference = '';
        this.dateSortieProduit = null;
        this.total = null;
        this.totalHT = null;
        this.totalTVA = null;
        this.totalHTTC = null;
        this.description = '';
        this.tauxTva = new TauxTvaDto() ;
        this.depot = new DepotDto() ;
        this.collaborateur = new CollaborateurDto() ;
        this.sortieProduitItems = new Array<SortieProduitItemDto>();

        }

}
