import {Component, OnInit} from '@angular/core';
import {PaiementAdminService} from 'src/app/controller/service/admin/effet/PaiementAdmin.service';
import {PaiementDto} from 'src/app/controller/model/effet/Paiement.model';
import {PaiementCriteria} from 'src/app/controller/criteria/effet/PaiementCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {BeneficiaireDto} from 'src/app/controller/model/effet/Beneficiaire.model';
import {BeneficiaireAdminService} from 'src/app/controller/service/admin/effet/BeneficiaireAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
import {TypePaiementDto} from 'src/app/controller/model/effet/TypePaiement.model';
import {TypePaiementAdminService} from 'src/app/controller/service/admin/effet/TypePaiementAdmin.service';


@Component({
  selector: 'app-paiement-list-admin',
  templateUrl: './paiement-list-admin.component.html'
})
export class PaiementListAdminComponent extends AbstractListController<PaiementDto, PaiementCriteria, PaiementAdminService>  implements OnInit {

    fileName = 'Paiement';

    proprietaireChequeEffets: Array<ProprietaireChequeEffetDto>;
    comptes: Array<CompteDto>;
    typePaiements: Array<TypePaiementDto>;
    beneficiaires: Array<BeneficiaireDto>;


    constructor( private paiementService: PaiementAdminService  , private compteService: CompteAdminService, private beneficiaireService: BeneficiaireAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService, private typePaiementService: TypePaiementAdminService) {
        super(paiementService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
        this.loadProprietaireChequeEffet();
        this.loadCompte();
        this.loadTypePaiement();
        this.loadBeneficiaire();
    }


    public initCol() {
        this.cols = [
            {field: 'dateEmission', header: 'Date emission'},
            {field: 'proprietaireChequeEffet?.nom', header: 'Proprietaire cheque effet'},
            {field: 'compte?.numero', header: 'Compte'},
            {field: 'typePaiement?.libelle', header: 'Type paiement'},
            {field: 'codeChequeEffet', header: 'Code cheque effet'},
            {field: 'beneficiaire?.nom', header: 'Beneficiaire'},
            {field: 'dateEcheance', header: 'Date echeance'},
            {field: 'dateEncaissement', header: 'Date encaissement'},
            {field: 'montant', header: 'Montant'},
            {field: 'pathCheque', header: 'Path cheque'},
        ];
    }


    public async loadProprietaireChequeEffet(){
       this.proprietaireChequeEffetService.findAllOptimized().subscribe(proprietaireChequeEffets => this.proprietaireChequeEffets = proprietaireChequeEffets, error => console.log(error))
    }
    public async loadCompte(){
       this.compteService.findAllOptimized().subscribe(comptes => this.comptes = comptes, error => console.log(error))
    }
    public async loadTypePaiement(){
       this.typePaiementService.findAllOptimized().subscribe(typePaiements => this.typePaiements = typePaiements, error => console.log(error))
    }
    public async loadBeneficiaire(){
       this.beneficiaireService.findAllOptimized().subscribe(beneficiaires => this.beneficiaires = beneficiaires, error => console.log(error))
    }



   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                'Date emission': this.datePipe.transform(e.dateEmission , 'dd/MM/yyyy hh:mm'),
                'Proprietaire cheque effet': e.proprietaireChequeEffet?.nom ,
                'Compte': e.compte?.numero ,
                'Type paiement': e.typePaiement?.libelle ,
                 'Code cheque effet': e.codeChequeEffet ,
                'Beneficiaire': e.beneficiaire?.nom ,
                'Date echeance': this.datePipe.transform(e.dateEcheance , 'dd/MM/yyyy hh:mm'),
                'Date encaissement': this.datePipe.transform(e.dateEncaissement , 'dd/MM/yyyy hh:mm'),
                 'Montant': e.montant ,
                 'Path cheque': e.pathCheque ,
                 'Description': e.description ,
            }
        });

        this.criteriaData = [{
            'Date emission Min': this.criteria.dateEmissionFrom ? this.datePipe.transform(this.criteria.dateEmissionFrom , this.dateFormat) : environment.emptyForExport ,
            'Date emission Max': this.criteria.dateEmissionTo ? this.datePipe.transform(this.criteria.dateEmissionTo , this.dateFormat) : environment.emptyForExport ,
        //'Proprietaire cheque effet': this.criteria.proprietaireChequeEffet?.nom ? this.criteria.proprietaireChequeEffet?.nom : environment.emptyForExport ,
        //'Compte': this.criteria.compte?.numero ? this.criteria.compte?.numero : environment.emptyForExport ,
        //'Type paiement': this.criteria.typePaiement?.libelle ? this.criteria.typePaiement?.libelle : environment.emptyForExport ,
            'Code cheque effet': this.criteria.codeChequeEffet ? this.criteria.codeChequeEffet : environment.emptyForExport ,
        //'Beneficiaire': this.criteria.beneficiaire?.nom ? this.criteria.beneficiaire?.nom : environment.emptyForExport ,
            'Date echeance Min': this.criteria.dateEcheanceFrom ? this.datePipe.transform(this.criteria.dateEcheanceFrom , this.dateFormat) : environment.emptyForExport ,
            'Date echeance Max': this.criteria.dateEcheanceTo ? this.datePipe.transform(this.criteria.dateEcheanceTo , this.dateFormat) : environment.emptyForExport ,
            'Date encaissement Min': this.criteria.dateEncaissementFrom ? this.datePipe.transform(this.criteria.dateEncaissementFrom , this.dateFormat) : environment.emptyForExport ,
            'Date encaissement Max': this.criteria.dateEncaissementTo ? this.datePipe.transform(this.criteria.dateEncaissementTo , this.dateFormat) : environment.emptyForExport ,
            'Montant Min': this.criteria.montantMin ? this.criteria.montantMin : environment.emptyForExport ,
            'Montant Max': this.criteria.montantMax ? this.criteria.montantMax : environment.emptyForExport ,
            'Path cheque': this.criteria.pathCheque ? this.criteria.pathCheque : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        }];
      }
}
