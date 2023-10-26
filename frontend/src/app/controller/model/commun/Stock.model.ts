import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {ProduitDto} from './Produit.model';
import {DepotDto} from './Depot.model';

export class StockDto extends BaseDto{

    public quantite: null | number;

    public produit: ProduitDto ;
    public depot: DepotDto ;
    

    constructor() {
        super();

        this.quantite = null;
        this.produit = new ProduitDto() ;
        this.depot = new DepotDto() ;

        }

}
