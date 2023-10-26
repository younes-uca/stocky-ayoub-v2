import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';

import {BeneficiaireDto} from 'src/app/controller/model/effet/Beneficiaire.model';
import {BeneficiaireCriteria} from 'src/app/controller/criteria/effet/BeneficiaireCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class BeneficiaireAdminService extends AbstractService<BeneficiaireDto, BeneficiaireCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/beneficiaire/');
    }

    public constrcutDto(): BeneficiaireDto {
        return new BeneficiaireDto();
    }

    public constrcutCriteria(): BeneficiaireCriteria {
        return new BeneficiaireCriteria();
    }
}
