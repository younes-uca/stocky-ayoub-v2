import {Component, OnInit} from '@angular/core';
import {ProduitAdminService} from 'src/app/controller/service/admin/commun/ProduitAdmin.service';
import {ProduitDto} from 'src/app/controller/model/commun/Produit.model';
import {ProduitCriteria} from 'src/app/controller/criteria/commun/ProduitCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {CategorieProduitDto} from 'src/app/controller/model/commun/CategorieProduit.model';
import {CategorieProduitAdminService} from 'src/app/controller/service/admin/commun/CategorieProduitAdmin.service';
import {MarqueDto} from 'src/app/controller/model/commun/Marque.model';
import {MarqueAdminService} from 'src/app/controller/service/admin/commun/MarqueAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';


@Component({
  selector: 'app-produit-list-admin',
  templateUrl: './produit-list-admin.component.html'
})
export class ProduitListAdminComponent extends AbstractListController<ProduitDto, ProduitCriteria, ProduitAdminService>  implements OnInit {

    fileName = 'Produit';

    categorieProduits: Array<CategorieProduitDto>;
    marques: Array<MarqueDto>;
    tauxTvas: Array<TauxTvaDto>;


    constructor( private produitService: ProduitAdminService  , private categorieProduitService: CategorieProduitAdminService, private marqueService: MarqueAdminService, private tauxTvaService: TauxTvaAdminService) {
        super(produitService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
        this.loadCategorieProduit();
        this.loadMarque();
        this.loadTauxTva();
    }


    public initCol() {
        this.cols = [
            {field: 'reference', header: 'Reference'},
            {field: 'categorieProduit?.reference', header: 'Categorie produit'},
            {field: 'libelle', header: 'Libelle'},
            {field: 'marque?.reference', header: 'Marque'},
            {field: 'prixAchatMoyen', header: 'Prix achat moyen'},
            {field: 'prixVente', header: 'Prix vente'},
            {field: 'prix', header: 'Prix'},
            {field: 'remise', header: 'Remise'},
            {field: 'prixUnitaireTtc', header: 'Prix unitaire ttc'},
            {field: 'prixUht', header: 'Prix uht'},
            {field: 'tauxTva?.libelle', header: 'Taux tva'},
            {field: 'montantHt', header: 'Montant ht'},
            {field: 'montantTtc', header: 'Montant ttc'},
        ];
    }


    public async loadCategorieProduit(){
       this.categorieProduitService.findAllOptimized().subscribe(categorieProduits => this.categorieProduits = categorieProduits, error => console.log(error))
    }
    public async loadMarque(){
       this.marqueService.findAllOptimized().subscribe(marques => this.marques = marques, error => console.log(error))
    }
    public async loadTauxTva(){
       this.tauxTvaService.findAllOptimized().subscribe(tauxTvas => this.tauxTvas = tauxTvas, error => console.log(error))
    }



   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Reference': e.reference ,
                'Categorie produit': e.categorieProduit?.reference ,
                 'Libelle': e.libelle ,
                'Marque': e.marque?.reference ,
                 'Prix achat moyen': e.prixAchatMoyen ,
                 'Prix vente': e.prixVente ,
                 'Prix': e.prix ,
                 'Remise': e.remise ,
                 'Prix unitaire ttc': e.prixUnitaireTtc ,
                 'Prix uht': e.prixUht ,
                'Taux tva': e.tauxTva?.libelle ,
                 'Montant ht': e.montantHt ,
                 'Montant ttc': e.montantTtc ,
            }
        });

        this.criteriaData = [{
            'Reference': this.criteria.reference ? this.criteria.reference : environment.emptyForExport ,
        //'Categorie produit': this.criteria.categorieProduit?.reference ? this.criteria.categorieProduit?.reference : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        //'Marque': this.criteria.marque?.reference ? this.criteria.marque?.reference : environment.emptyForExport ,
            'Prix achat moyen Min': this.criteria.prixAchatMoyenMin ? this.criteria.prixAchatMoyenMin : environment.emptyForExport ,
            'Prix achat moyen Max': this.criteria.prixAchatMoyenMax ? this.criteria.prixAchatMoyenMax : environment.emptyForExport ,
            'Prix vente Min': this.criteria.prixVenteMin ? this.criteria.prixVenteMin : environment.emptyForExport ,
            'Prix vente Max': this.criteria.prixVenteMax ? this.criteria.prixVenteMax : environment.emptyForExport ,
            'Prix Min': this.criteria.prixMin ? this.criteria.prixMin : environment.emptyForExport ,
            'Prix Max': this.criteria.prixMax ? this.criteria.prixMax : environment.emptyForExport ,
            'Remise Min': this.criteria.remiseMin ? this.criteria.remiseMin : environment.emptyForExport ,
            'Remise Max': this.criteria.remiseMax ? this.criteria.remiseMax : environment.emptyForExport ,
            'Prix unitaire ttc Min': this.criteria.prixUnitaireTtcMin ? this.criteria.prixUnitaireTtcMin : environment.emptyForExport ,
            'Prix unitaire ttc Max': this.criteria.prixUnitaireTtcMax ? this.criteria.prixUnitaireTtcMax : environment.emptyForExport ,
            'Prix uht Min': this.criteria.prixUhtMin ? this.criteria.prixUhtMin : environment.emptyForExport ,
            'Prix uht Max': this.criteria.prixUhtMax ? this.criteria.prixUhtMax : environment.emptyForExport ,
        //'Taux tva': this.criteria.tauxTva?.libelle ? this.criteria.tauxTva?.libelle : environment.emptyForExport ,
            'Montant ht Min': this.criteria.montantHtMin ? this.criteria.montantHtMin : environment.emptyForExport ,
            'Montant ht Max': this.criteria.montantHtMax ? this.criteria.montantHtMax : environment.emptyForExport ,
            'Montant ttc Min': this.criteria.montantTtcMin ? this.criteria.montantTtcMin : environment.emptyForExport ,
            'Montant ttc Max': this.criteria.montantTtcMax ? this.criteria.montantTtcMax : environment.emptyForExport ,
        }];
      }
}
