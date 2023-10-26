import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ProduitAdminService} from 'src/app/controller/service/admin/commun/ProduitAdmin.service';
import {ProduitDto} from 'src/app/controller/model/commun/Produit.model';
import {ProduitCriteria} from 'src/app/controller/criteria/commun/ProduitCriteria.model';

import {CategorieProduitDto} from 'src/app/controller/model/commun/CategorieProduit.model';
import {CategorieProduitAdminService} from 'src/app/controller/service/admin/commun/CategorieProduitAdmin.service';
import {MarqueDto} from 'src/app/controller/model/commun/Marque.model';
import {MarqueAdminService} from 'src/app/controller/service/admin/commun/MarqueAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';
@Component({
  selector: 'app-produit-view-admin',
  templateUrl: './produit-view-admin.component.html'
})
export class ProduitViewAdminComponent extends AbstractViewController<ProduitDto, ProduitCriteria, ProduitAdminService> implements OnInit {


    constructor(private produitService: ProduitAdminService, private categorieProduitService: CategorieProduitAdminService, private marqueService: MarqueAdminService, private tauxTvaService: TauxTvaAdminService){
        super(produitService);
    }

    ngOnInit(): void {
    }


    get categorieProduit(): CategorieProduitDto {
       return this.categorieProduitService.item;
    }
    set categorieProduit(value: CategorieProduitDto) {
        this.categorieProduitService.item = value;
    }
    get categorieProduits(): Array<CategorieProduitDto> {
       return this.categorieProduitService.items;
    }
    set categorieProduits(value: Array<CategorieProduitDto>) {
        this.categorieProduitService.items = value;
    }
    get tauxTva(): TauxTvaDto {
       return this.tauxTvaService.item;
    }
    set tauxTva(value: TauxTvaDto) {
        this.tauxTvaService.item = value;
    }
    get tauxTvas(): Array<TauxTvaDto> {
       return this.tauxTvaService.items;
    }
    set tauxTvas(value: Array<TauxTvaDto>) {
        this.tauxTvaService.items = value;
    }
    get marque(): MarqueDto {
       return this.marqueService.item;
    }
    set marque(value: MarqueDto) {
        this.marqueService.item = value;
    }
    get marques(): Array<MarqueDto> {
       return this.marqueService.items;
    }
    set marques(value: Array<MarqueDto>) {
        this.marqueService.items = value;
    }


}
