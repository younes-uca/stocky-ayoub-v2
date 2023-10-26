import {Component, OnInit} from '@angular/core';
import {ProprietaireChequeEffetBanqueAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetBanqueAdmin.service';
import {ProprietaireChequeEffetBanqueDto} from 'src/app/controller/model/effet/ProprietaireChequeEffetBanque.model';
import {ProprietaireChequeEffetBanqueCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetBanqueCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';


@Component({
  selector: 'app-proprietaire-cheque-effet-banque-list-admin',
  templateUrl: './proprietaire-cheque-effet-banque-list-admin.component.html'
})
export class ProprietaireChequeEffetBanqueListAdminComponent extends AbstractListController<ProprietaireChequeEffetBanqueDto, ProprietaireChequeEffetBanqueCriteria, ProprietaireChequeEffetBanqueAdminService>  implements OnInit {

    fileName = 'ProprietaireChequeEffetBanque';

    proprietaireChequeEffets: Array<ProprietaireChequeEffetDto>;
    banques: Array<BanqueDto>;
    comptes: Array<CompteDto>;


    constructor( private proprietaireChequeEffetBanqueService: ProprietaireChequeEffetBanqueAdminService  , private compteService: CompteAdminService, private banqueService: BanqueAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService) {
        super(proprietaireChequeEffetBanqueService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
        this.loadProprietaireChequeEffet();
        this.loadBanque();
        this.loadCompte();
    }


    public initCol() {
        this.cols = [
            {field: 'proprietaireChequeEffet?.nom', header: 'Proprietaire cheque effet'},
            {field: 'banque?.libelle', header: 'Banque'},
            {field: 'compte?.numero', header: 'Compte'},
        ];
    }


    public async loadProprietaireChequeEffet(){
       this.proprietaireChequeEffetService.findAllOptimized().subscribe(proprietaireChequeEffets => this.proprietaireChequeEffets = proprietaireChequeEffets, error => console.log(error))
    }
    public async loadBanque(){
       this.banqueService.findAllOptimized().subscribe(banques => this.banques = banques, error => console.log(error))
    }
    public async loadCompte(){
       this.compteService.findAllOptimized().subscribe(comptes => this.comptes = comptes, error => console.log(error))
    }



   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                'Proprietaire cheque effet': e.proprietaireChequeEffet?.nom ,
                'Banque': e.banque?.libelle ,
                'Compte': e.compte?.numero ,
            }
        });

        this.criteriaData = [{
        //'Proprietaire cheque effet': this.criteria.proprietaireChequeEffet?.nom ? this.criteria.proprietaireChequeEffet?.nom : environment.emptyForExport ,
        //'Banque': this.criteria.banque?.libelle ? this.criteria.banque?.libelle : environment.emptyForExport ,
        //'Compte': this.criteria.compte?.numero ? this.criteria.compte?.numero : environment.emptyForExport ,
        }];
      }
}
