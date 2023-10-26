import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SortieProduitAdminService} from 'src/app/controller/service/admin/sortie/SortieProduitAdmin.service';
import {SortieProduitDto} from 'src/app/controller/model/sortie/SortieProduit.model';
import {SortieProduitCriteria} from 'src/app/controller/criteria/sortie/SortieProduitCriteria.model';

import {ProduitDto} from 'src/app/controller/model/commun/Produit.model';
import {ProduitAdminService} from 'src/app/controller/service/admin/commun/ProduitAdmin.service';
import {SortieProduitItemDto} from 'src/app/controller/model/sortie/SortieProduitItem.model';
import {SortieProduitItemAdminService} from 'src/app/controller/service/admin/sortie/SortieProduitItemAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';
import {CollaborateurDto} from 'src/app/controller/model/commun/Collaborateur.model';
import {CollaborateurAdminService} from 'src/app/controller/service/admin/commun/CollaborateurAdmin.service';
import {DepotDto} from 'src/app/controller/model/commun/Depot.model';
import {DepotAdminService} from 'src/app/controller/service/admin/commun/DepotAdmin.service';
@Component({
  selector: 'app-sortie-produit-view-admin',
  templateUrl: './sortie-produit-view-admin.component.html'
})
export class SortieProduitViewAdminComponent extends AbstractViewController<SortieProduitDto, SortieProduitCriteria, SortieProduitAdminService> implements OnInit {

    sortieProduitItems = new SortieProduitItemDto();
    sortieProduitItemss: Array<SortieProduitItemDto> = [];

    constructor(private sortieProduitService: SortieProduitAdminService, private collaborateurService: CollaborateurAdminService, private produitService: ProduitAdminService, private sortieProduitItemService: SortieProduitItemAdminService, private tauxTvaService: TauxTvaAdminService, private depotService: DepotAdminService){
        super(sortieProduitService);
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
    get collaborateur(): CollaborateurDto {
       return this.collaborateurService.item;
    }
    set collaborateur(value: CollaborateurDto) {
        this.collaborateurService.item = value;
    }
    get collaborateurs(): Array<CollaborateurDto> {
       return this.collaborateurService.items;
    }
    set collaborateurs(value: Array<CollaborateurDto>) {
        this.collaborateurService.items = value;
    }


}
