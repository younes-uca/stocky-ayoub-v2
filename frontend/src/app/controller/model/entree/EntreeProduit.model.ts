import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {CollaborateurDto} from '../commun/Collaborateur.model';
import {FournisseurDto} from '../commun/Fournisseur.model';
import {EntreeProduitItemDto} from './EntreeProduitItem.model';
import {TauxTvaDto} from '../effet/TauxTva.model';
import {DepotDto} from '../commun/Depot.model';

export class EntreeProduitDto extends BaseDto{

    public reference: string;

   public dateEntreeProduit: Date;

    public totalHT: null | number;

    public totalTVA: null | number;

    public totalHTTC: null | number;

    public description: string;

    public tauxTva: TauxTvaDto ;
    public fournisseur: FournisseurDto ;
    public depot: DepotDto ;
    public collaborateur: CollaborateurDto ;
     public entreeProduitItems: Array<EntreeProduitItemDto>;
    

    constructor() {
        super();

        this.reference = '';
        this.dateEntreeProduit = null;
        this.totalHT = null;
        this.totalTVA = null;
        this.totalHTTC = null;
        this.description = '';
        this.tauxTva = new TauxTvaDto() ;
        this.fournisseur = new FournisseurDto() ;
        this.depot = new DepotDto() ;
        this.collaborateur = new CollaborateurDto() ;
        this.entreeProduitItems = new Array<EntreeProduitItemDto>();

        }

}
