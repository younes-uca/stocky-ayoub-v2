import {Component, OnInit} from '@angular/core';
import {EntreeProduitAdminService} from 'src/app/controller/service/admin/entree/EntreeProduitAdmin.service';
import {EntreeProduitDto} from 'src/app/controller/model/entree/EntreeProduit.model';
import {EntreeProduitCriteria} from 'src/app/controller/criteria/entree/EntreeProduitCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {ProduitDto} from 'src/app/controller/model/commun/Produit.model';
import {ProduitAdminService} from 'src/app/controller/service/admin/commun/ProduitAdmin.service';
import {FournisseurDto} from 'src/app/controller/model/commun/Fournisseur.model';
import {FournisseurAdminService} from 'src/app/controller/service/admin/commun/FournisseurAdmin.service';
import {EntreeProduitItemDto} from 'src/app/controller/model/entree/EntreeProduitItem.model';
import {EntreeProduitItemAdminService} from 'src/app/controller/service/admin/entree/EntreeProduitItemAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';
import {CollaborateurDto} from 'src/app/controller/model/commun/Collaborateur.model';
import {CollaborateurAdminService} from 'src/app/controller/service/admin/commun/CollaborateurAdmin.service';
import {DepotDto} from 'src/app/controller/model/commun/Depot.model';
import {DepotAdminService} from 'src/app/controller/service/admin/commun/DepotAdmin.service';


@Component({
  selector: 'app-entree-produit-list-admin',
  templateUrl: './entree-produit-list-admin.component.html'
})
export class EntreeProduitListAdminComponent extends AbstractListController<EntreeProduitDto, EntreeProduitCriteria, EntreeProduitAdminService>  implements OnInit {

    fileName = 'EntreeProduit';

    tauxTvas: Array<TauxTvaDto>;
    fournisseurs: Array<FournisseurDto>;
    depots: Array<DepotDto>;
    collaborateurs: Array<CollaborateurDto>;


    constructor( private entreeProduitService: EntreeProduitAdminService  , private collaborateurService: CollaborateurAdminService, private produitService: ProduitAdminService, private fournisseurService: FournisseurAdminService, private entreeProduitItemService: EntreeProduitItemAdminService, private tauxTvaService: TauxTvaAdminService, private depotService: DepotAdminService) {
        super(entreeProduitService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
        this.loadTauxTva();
        this.loadFournisseur();
        this.loadDepot();
        this.loadCollaborateur();
    }


    public initCol() {
        this.cols = [
            {field: 'reference', header: 'Reference'},
            {field: 'dateEntreeProduit', header: 'Date entree produit'},
            {field: 'totalHT', header: 'Total h t'},
            {field: 'tauxTva?.libelle', header: 'Taux tva'},
            {field: 'totalTVA', header: 'Total t v a'},
            {field: 'totalHTTC', header: 'Total h t t c'},
            {field: 'fournisseur?.reference', header: 'Fournisseur'},
            {field: 'depot?.libelle', header: 'Depot'},
            {field: 'collaborateur?.prenom', header: 'Collaborateur'},
        ];
    }


    public async loadTauxTva(){
       this.tauxTvaService.findAllOptimized().subscribe(tauxTvas => this.tauxTvas = tauxTvas, error => console.log(error))
    }
    public async loadFournisseur(){
       this.fournisseurService.findAllOptimized().subscribe(fournisseurs => this.fournisseurs = fournisseurs, error => console.log(error))
    }
    public async loadDepot(){
       this.depotService.findAllOptimized().subscribe(depots => this.depots = depots, error => console.log(error))
    }
    public async loadCollaborateur(){
       this.collaborateurService.findAllOptimized().subscribe(collaborateurs => this.collaborateurs = collaborateurs, error => console.log(error))
    }

	public initDuplicate(res: EntreeProduitDto) {
        if (res.entreeProduitItems != null) {
             res.entreeProduitItems.forEach(d => { d.entreeProduit = null; d.id = null; });
        }
	}


   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Reference': e.reference ,
                'Date entree produit': this.datePipe.transform(e.dateEntreeProduit , 'dd/MM/yyyy hh:mm'),
                 'Total h t': e.totalHT ,
                'Taux tva': e.tauxTva?.libelle ,
                 'Total t v a': e.totalTVA ,
                 'Total h t t c': e.totalHTTC ,
                'Fournisseur': e.fournisseur?.reference ,
                'Depot': e.depot?.libelle ,
                 'Description': e.description ,
                'Collaborateur': e.collaborateur?.prenom ,
            }
        });

        this.criteriaData = [{
            'Reference': this.criteria.reference ? this.criteria.reference : environment.emptyForExport ,
            'Date entree produit Min': this.criteria.dateEntreeProduitFrom ? this.datePipe.transform(this.criteria.dateEntreeProduitFrom , this.dateFormat) : environment.emptyForExport ,
            'Date entree produit Max': this.criteria.dateEntreeProduitTo ? this.datePipe.transform(this.criteria.dateEntreeProduitTo , this.dateFormat) : environment.emptyForExport ,
            'Total h t Min': this.criteria.totalHTMin ? this.criteria.totalHTMin : environment.emptyForExport ,
            'Total h t Max': this.criteria.totalHTMax ? this.criteria.totalHTMax : environment.emptyForExport ,
        //'Taux tva': this.criteria.tauxTva?.libelle ? this.criteria.tauxTva?.libelle : environment.emptyForExport ,
            'Total t v a Min': this.criteria.totalTVAMin ? this.criteria.totalTVAMin : environment.emptyForExport ,
            'Total t v a Max': this.criteria.totalTVAMax ? this.criteria.totalTVAMax : environment.emptyForExport ,
            'Total h t t c Min': this.criteria.totalHTTCMin ? this.criteria.totalHTTCMin : environment.emptyForExport ,
            'Total h t t c Max': this.criteria.totalHTTCMax ? this.criteria.totalHTTCMax : environment.emptyForExport ,
        //'Fournisseur': this.criteria.fournisseur?.reference ? this.criteria.fournisseur?.reference : environment.emptyForExport ,
        //'Depot': this.criteria.depot?.libelle ? this.criteria.depot?.libelle : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        //'Collaborateur': this.criteria.collaborateur?.prenom ? this.criteria.collaborateur?.prenom : environment.emptyForExport ,
        }];
      }
}
