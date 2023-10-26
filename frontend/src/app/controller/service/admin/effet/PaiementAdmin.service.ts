import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';

import {PaiementDto} from 'src/app/controller/model/effet/Paiement.model';
import {PaiementCriteria} from 'src/app/controller/criteria/effet/PaiementCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class PaiementAdminService extends AbstractService<PaiementDto, PaiementCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/paiement/');
    }

    public constrcutDto(): PaiementDto {
        return new PaiementDto();
    }

    public constrcutCriteria(): PaiementCriteria {
        return new PaiementCriteria();
    }
}
