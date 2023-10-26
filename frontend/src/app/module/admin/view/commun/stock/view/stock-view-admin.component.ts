import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {StockAdminService} from 'src/app/controller/service/admin/commun/StockAdmin.service';
import {StockDto} from 'src/app/controller/model/commun/Stock.model';
import {StockCriteria} from 'src/app/controller/criteria/commun/StockCriteria.model';

import {ProduitDto} from 'src/app/controller/model/commun/Produit.model';
import {ProduitAdminService} from 'src/app/controller/service/admin/commun/ProduitAdmin.service';
import {DepotDto} from 'src/app/controller/model/commun/Depot.model';
import {DepotAdminService} from 'src/app/controller/service/admin/commun/DepotAdmin.service';
@Component({
  selector: 'app-stock-view-admin',
  templateUrl: './stock-view-admin.component.html'
})
export class StockViewAdminComponent extends AbstractViewController<StockDto, StockCriteria, StockAdminService> implements OnInit {


    constructor(private stockService: StockAdminService, private produitService: ProduitAdminService, private depotService: DepotAdminService){
        super(stockService);
    }

    ngOnInit(): void {
    }


    get produit(): ProduitDto {
       return this.produitService.item;
    }
    set produit(value: ProduitDto) {
        this.produitService.item = value;
    }
    get produits(): Array<ProduitDto> {
       return this.produitService.items;
    }
    set produits(value: Array<ProduitDto>) {
        this.produitService.items = value;
    }
    get depot(): DepotDto {
       return this.depotService.item;
    }
    set depot(value: DepotDto) {
        this.depotService.item = value;
    }
    get depots(): Array<DepotDto> {
       return this.depotService.items;
    }
    set depots(value: Array<DepotDto>) {
        this.depotService.items = value;
    }


}
