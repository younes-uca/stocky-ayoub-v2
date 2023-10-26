import {Component, OnInit} from '@angular/core';
import {TypePaiementAdminService} from 'src/app/controller/service/admin/effet/TypePaiementAdmin.service';
import {TypePaiementDto} from 'src/app/controller/model/effet/TypePaiement.model';
import {TypePaiementCriteria} from 'src/app/controller/criteria/effet/TypePaiementCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';



@Component({
  selector: 'app-type-paiement-list-admin',
  templateUrl: './type-paiement-list-admin.component.html'
})
export class TypePaiementListAdminComponent extends AbstractListController<TypePaiementDto, TypePaiementCriteria, TypePaiementAdminService>  implements OnInit {

    fileName = 'TypePaiement';



    constructor( private typePaiementService: TypePaiementAdminService  ) {
        super(typePaiementService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }





   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Libelle': e.libelle ,
                 'Code': e.code ,
            }
        });

        this.criteriaData = [{
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        }];
      }
}
